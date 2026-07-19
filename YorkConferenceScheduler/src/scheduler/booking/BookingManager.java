package scheduler.booking;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import scheduler.payment.PaymentStrategy;
import scheduler.pricing.PricingStrategy;
import scheduler.room.Room;
import scheduler.sensor.SensorObserver;
import scheduler.user.User;

public class BookingManager implements SensorObserver {

	private final List<Booking> activeBookings;
	private final Map<String, Room> rooms;

	public BookingManager() {
		activeBookings = new ArrayList<>();
		rooms = new HashMap<>();
	}

	// Adds a room to the collection managed by the booking system.

	public boolean addRoom(Room room) {
		if (room == null) {
			return false;
		}

		String roomID = normalize(room.getRoomID());

		if (rooms.containsKey(roomID)) {
			return false;
		}

		rooms.put(roomID, room);
		return true;
	}

	public Room getRoom(String roomID) {
		if (roomID == null || roomID.isBlank()) {
			return null;
		}

		return rooms.get(normalize(roomID));
	}

	// Creates and stores a booking.
	
	public Booking createBooking(User user, String roomID, LocalDateTime startTime, LocalDateTime endTime,
			PricingStrategy pricingStrategy, PaymentStrategy paymentStrategy) {

		if (user == null) {
			throw new IllegalArgumentException("User is required.");
		}

		Room room = getRoom(roomID);

		if (room == null) {
			throw new IllegalArgumentException("The selected room does not exist.");
		}

		if (startTime == null || endTime == null) {
			throw new IllegalArgumentException("Start and end times are required.");
		}

		if (!endTime.isAfter(startTime)) {
			throw new IllegalArgumentException("End time must be after start time.");
		}

		if (startTime.isBefore(LocalDateTime.now())) {
			throw new IllegalArgumentException("A booking cannot start in the past.");
		}

		if (!isRoomAvailable(roomID, startTime, endTime, null)) {
			throw new IllegalArgumentException("The room is unavailable during the selected time.");
		}

		Booking booking = new Booking(user, room, startTime, endTime, pricingStrategy, paymentStrategy);

		double deposit = booking.calculateUpfrontCost();

		// When a payment strategy is supplied, the one-hour deposit must be successfully paid before the booking is stored.

		if (paymentStrategy != null && !booking.executePayment(deposit)) {

			throw new IllegalStateException("The upfront deposit payment was unsuccessful.");
		}

		activeBookings.add(booking);
		return booking;
	}

	public boolean isRoomAvailable(String roomID, LocalDateTime startTime, LocalDateTime endTime) {

		return isRoomAvailable(roomID, startTime, endTime, null);
	}

	private boolean isRoomAvailable(String roomID, LocalDateTime startTime, LocalDateTime endTime,
			Booking ignoredBooking) {

		if (getRoom(roomID) == null || startTime == null || endTime == null || !endTime.isAfter(startTime)) {

			return false;
		}

		for (Booking booking : activeBookings) {

			if (booking == ignoredBooking || booking.isCancelled()) {
				continue;
			}

			boolean sameRoom = booking.getRoom().getRoomID().equalsIgnoreCase(roomID);

			if (sameRoom && booking.overlaps(startTime, endTime)) {

				return false;
			}
		}

		return true;
	}

	// Finds the first active booking belonging to a user.
	
	public Booking findBookingByUser(String userID) {
		if (userID == null || userID.isBlank()) {
			return null;
		}

		for (Booking booking : activeBookings) {
			if (!booking.isCancelled() && booking.getUser().getUserID().equalsIgnoreCase(userID)) {

				return booking;
			}
		}

		return null;
	}

	public List<Booking> getBookingsForUser(String userID) {
		List<Booking> userBookings = new ArrayList<>();

		if (userID == null || userID.isBlank()) {
			return userBookings;
		}

		for (Booking booking : activeBookings) {
			if (booking.getUser().getUserID().equalsIgnoreCase(userID)) {

				userBookings.add(booking);
			}
		}

		return userBookings;
	}

	public boolean modifyBooking(String userID, LocalDateTime newStart, LocalDateTime newEnd) {

		Booking booking = findBookingByUser(userID);

		if (booking == null || newStart == null || newEnd == null || !newEnd.isAfter(newStart)
				|| newStart.isBefore(LocalDateTime.now())) {

			return false;
		}

		String roomID = booking.getRoom().getRoomID();

		if (!isRoomAvailable(roomID, newStart, newEnd, booking)) {

			return false;
		}

		booking.modifyTimes(newStart, newEnd);
		return true;
	}

	public boolean cancelBooking(String userID) {
		Booking booking = findBookingByUser(userID);

		if (booking == null) {
			return false;
		}


		// Release the room only if the user had physically checked in. Future bookings do not place the room in OccupiedState.
		
		if (booking.isCheckedIn()) {
			booking.getRoom().release();
		}

		booking.cancel();
		return true;
	}

	public boolean extendBooking(String userID, int additionalHours) {

		Booking booking = findBookingByUser(userID);

		if (booking == null || additionalHours <= 0) {
			return false;
		}

		LocalDateTime proposedEnd = booking.getEndTime().plusHours(additionalHours);

		if (!isRoomAvailable(booking.getRoom().getRoomID(), booking.getStartTime(), proposedEnd, booking)) {

			return false;
		}

		return booking.extendBooking(additionalHours);
	}

	// Handles occupancy and badge messages sent by HardwareSensor.
	
	@Override
	public void update(String sensorData) {
		if (sensorData == null || sensorData.isBlank()) {
			return;
		}

		String[] parts = sensorData.split(":");

		if (parts.length == 2 && "OCCUPIED".equalsIgnoreCase(parts[0])) {

			Room room = getRoom(parts[1]);

			if (room != null) {
				room.reserve();
			}

			return;
		}

		if (parts.length == 3 && "BADGE_SCAN".equalsIgnoreCase(parts[0])) {

			String roomID = parts[1];
			String userID = parts[2];

			processBadgeScan(roomID, userID);
		}
	}

	private boolean processBadgeScan(String roomID, String userID) {

		LocalDateTime now = LocalDateTime.now();

		for (Booking booking : activeBookings) {

			if (booking.isCancelled() || booking.isCheckedIn()) {
				continue;
			}

			boolean correctRoom = booking.getRoom().getRoomID().equalsIgnoreCase(roomID);

			boolean correctUser = booking.getUser().getUserID().equalsIgnoreCase(userID);

			// Permit check-in beginning 30 minutes before the booking and ending 30 minutes after the scheduled start.
			
			LocalDateTime earliestCheckIn = booking.getStartTime().minusMinutes(30);

			LocalDateTime deadline = booking.getStartTime().plusMinutes(30);

			boolean withinCheckInPeriod = !now.isBefore(earliestCheckIn) && !now.isAfter(deadline);

			if (correctRoom && correctUser && withinCheckInPeriod) {

				booking.checkIn();
				booking.getRoom().reserve();
				return true;
			}
		}

		return false;
	}

	// 	Forfeits the one-hour deposit when the user has not checked in within 30 minutes of the scheduled start time.
	
	public void checkTimeouts() {
		LocalDateTime now = LocalDateTime.now();

		for (Booking booking : activeBookings) {

			if (booking.isCancelled() || booking.isCheckedIn() || booking.isDepositForfeited()) {
				continue;
			}

			LocalDateTime deadline = booking.getStartTime().plusMinutes(30);

			if (now.isAfter(deadline)) {
				booking.forfeitDeposit();
			}
		}
	}

	public List<Booking> getActiveBookings() {
		return Collections.unmodifiableList(activeBookings);
	}

	public Map<String, Room> getRooms() {
		return Collections.unmodifiableMap(rooms);
	}

	private String normalize(String value) {
		return value.trim().toLowerCase();
	}
}