package scheduler.booking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import scheduler.database.CsvDatabase;
import scheduler.payment.PaymentStrategy;
import scheduler.pricing.FacultyPricing;
import scheduler.pricing.PartnerPricing;
import scheduler.pricing.PricingStrategy;
import scheduler.pricing.StaffPricing;
import scheduler.pricing.StudentPricing;
import scheduler.room.Room;
import scheduler.sensor.SensorObserver;
import scheduler.user.User;
import scheduler.user.UserFactory;

public class BookingManager implements SensorObserver {

    private static final DateTimeFormatter CSV_DATE_FORMAT =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private final List<Booking> activeBookings;
    private final Map<String, Room> rooms;

    public BookingManager() {
        activeBookings = new ArrayList<>();
        rooms = new HashMap<>();

        loadRooms();
        loadBookings();
    }

    public boolean addRoom(Room room) {
        if (room == null) {
            return false;
        }

        String roomID = normalize(room.getRoomID());

        if (rooms.containsKey(roomID)) {
            return false;
        }

        rooms.put(roomID, room);
        saveRooms();

        return true;
    }

    public Room getRoom(String roomID) {
        if (roomID == null || roomID.isBlank()) {
            return null;
        }

        return rooms.get(normalize(roomID));
    }

    public Booking createBooking(
            User user,
            String roomID,
            LocalDateTime startTime,
            LocalDateTime endTime,
            PricingStrategy pricingStrategy,
            PaymentStrategy paymentStrategy) {

        if (user == null) {
            throw new IllegalArgumentException("User is required.");
        }

        Room room = getRoom(roomID);

        if (room == null) {
            throw new IllegalArgumentException(
                    "The selected room does not exist.");
        }

        if (room.isMaintenance()
                || "disabled".equalsIgnoreCase(room.getStatus())) {
            throw new IllegalArgumentException(
                    "The selected room is disabled or under maintenance.");
        }

        if (startTime == null || endTime == null) {
            throw new IllegalArgumentException(
                    "Start and end times are required.");
        }

        if (!endTime.isAfter(startTime)) {
            throw new IllegalArgumentException(
                    "End time must be after start time.");
        }

        if (startTime.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException(
                    "A booking cannot start in the past.");
        }

        if (!isRoomAvailable(
                roomID, startTime, endTime, null)) {

            throw new IllegalArgumentException(
                    "The room is unavailable during the selected time.");
        }

        Booking booking = new Booking(
                user,
                room,
                startTime,
                endTime,
                pricingStrategy,
                paymentStrategy);

        booking.setBookingID(generateBookingID());

        double deposit = booking.calculateUpfrontCost();

        if (paymentStrategy != null
                && !booking.executePayment(deposit)) {

            throw new IllegalStateException(
                    "The upfront deposit payment was unsuccessful.");
        }

        activeBookings.add(booking);
        saveBookings();

        return booking;
    }

    public boolean isRoomAvailable(
            String roomID,
            LocalDateTime startTime,
            LocalDateTime endTime) {

        return isRoomAvailable(
                roomID, startTime, endTime, null);
    }

    private boolean isRoomAvailable(
            String roomID,
            LocalDateTime startTime,
            LocalDateTime endTime,
            Booking ignoredBooking) {

        Room room = getRoom(roomID);

        if (room == null
                || room.isMaintenance()
                || "disabled".equalsIgnoreCase(room.getStatus())
                || startTime == null
                || endTime == null
                || !endTime.isAfter(startTime)) {

            return false;
        }

        for (Booking booking : activeBookings) {
            if (booking == ignoredBooking
                    || booking.isCancelled()) {
                continue;
            }

            boolean sameRoom =
                    booking.getRoom()
                            .getRoomID()
                            .equalsIgnoreCase(roomID);

            if (sameRoom
                    && booking.overlaps(startTime, endTime)) {
                return false;
            }
        }

        return true;
    }

    public Booking findBookingByUser(String userID) {
        if (userID == null || userID.isBlank()) {
            return null;
        }

        for (Booking booking : activeBookings) {
            if (!booking.isCancelled()
                    && booking.getUser()
                            .getUserID()
                            .equalsIgnoreCase(userID)) {

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
            if (booking.getUser()
                    .getUserID()
                    .equalsIgnoreCase(userID)) {

                userBookings.add(booking);
            }
        }

        return userBookings;
    }

    public boolean modifyBooking(
            String userID,
            LocalDateTime newStart,
            LocalDateTime newEnd) {

        Booking booking = findBookingByUser(userID);

        if (booking == null
                || newStart == null
                || newEnd == null
                || !newEnd.isAfter(newStart)
                || newStart.isBefore(LocalDateTime.now())) {

            return false;
        }

        String roomID = booking.getRoom().getRoomID();

        if (!isRoomAvailable(
                roomID, newStart, newEnd, booking)) {
            return false;
        }

        booking.modifyTimes(newStart, newEnd);
        saveBookings();

        return true;
    }

    public boolean cancelBooking(String userID) {
        Booking booking = findBookingByUser(userID);

        if (booking == null) {
            return false;
        }

        if (booking.isCheckedIn()) {
            booking.getRoom().release();
            saveRooms();
        }

        booking.cancel();
        saveBookings();

        return true;
    }

    public boolean extendBooking(
            String userID,
            int additionalHours) {

        Booking booking = findBookingByUser(userID);

        if (booking == null || additionalHours <= 0) {
            return false;
        }

        LocalDateTime proposedEnd =
                booking.getEndTime().plusHours(additionalHours);

        if (!isRoomAvailable(
                booking.getRoom().getRoomID(),
                booking.getStartTime(),
                proposedEnd,
                booking)) {

            return false;
        }

        boolean extended =
                booking.extendBooking(additionalHours);

        if (extended) {
            saveBookings();
        }

        return extended;
    }

    @Override
    public void update(String sensorData) {
        if (sensorData == null || sensorData.isBlank()) {
            return;
        }

        String[] parts = sensorData.split(":");

        if (parts.length == 2
                && "OCCUPIED".equalsIgnoreCase(parts[0])) {

            Room room = getRoom(parts[1]);

            if (room != null) {
                room.reserve();
                saveRooms();
            }

            return;
        }

        if (parts.length == 2
                && "EMPTY".equalsIgnoreCase(parts[0])) {

            Room room = getRoom(parts[1]);

            if (room != null) {
                room.release();
                saveRooms();
            }

            return;
        }

        if (parts.length == 3
                && "BADGE_SCAN".equalsIgnoreCase(parts[0])) {

            processBadgeScan(parts[1], parts[2]);
        }
    }

    private boolean processBadgeScan(
            String roomID,
            String userID) {

        LocalDateTime now = LocalDateTime.now();

        for (Booking booking : activeBookings) {
            if (booking.isCancelled()
                    || booking.isCheckedIn()) {
                continue;
            }

            boolean correctRoom =
                    booking.getRoom()
                            .getRoomID()
                            .equalsIgnoreCase(roomID);

            boolean correctUser =
                    booking.getUser()
                            .getUserID()
                            .equalsIgnoreCase(userID);

            LocalDateTime earliestCheckIn =
                    booking.getStartTime().minusMinutes(30);

            LocalDateTime deadline =
                    booking.getStartTime().plusMinutes(30);

            boolean withinCheckInPeriod =
                    !now.isBefore(earliestCheckIn)
                            && !now.isAfter(deadline);

            if (correctRoom
                    && correctUser
                    && withinCheckInPeriod) {

                booking.checkIn();
                booking.getRoom().reserve();

                saveBookings();
                saveRooms();

                return true;
            }
        }

        return false;
    }

    public void checkTimeouts() {
        LocalDateTime now = LocalDateTime.now();
        boolean changed = false;

        for (Booking booking : activeBookings) {
            if (booking.isCancelled()
                    || booking.isCheckedIn()
                    || booking.isDepositForfeited()) {
                continue;
            }

            LocalDateTime deadline =
                    booking.getStartTime().plusMinutes(30);

            if (now.isAfter(deadline)) {
                booking.forfeitDeposit();
                changed = true;
            }
        }

        if (changed) {
            saveBookings();
        }
    }

    public List<Booking> getActiveBookings() {
        return Collections.unmodifiableList(activeBookings);
    }

    public Map<String, Room> getRooms() {
        return Collections.unmodifiableMap(rooms);
    }

    private void loadRooms() {
        for (String[] row
                : CsvDatabase.read(CsvDatabase.ROOMS_FILE)) {

            if (row.length < 7) {
                continue;
            }

            try {
                Room room = new Room(
                        row[0].trim(),
                        Integer.parseInt(row[1].trim()),
                        row[2].trim(),
                        row[3].trim(),
                        Boolean.parseBoolean(row[4].trim()),
                        Boolean.parseBoolean(row[5].trim()),
                        row[6].trim());

                rooms.put(
                        normalize(room.getRoomID()),
                        room);
            } catch (RuntimeException exception) {
                System.err.println(
                        "Skipped invalid room row: " + row[0]);
            }
        }
    }

    private void loadBookings() {
        UserFactory userFactory = new UserFactory();

        for (String[] row
                : CsvDatabase.read(CsvDatabase.BOOKINGS_FILE)) {

            if (row.length < 11) {
                continue;
            }

            try {
                String bookingID = row[0].trim();
                User user = userFactory.getUserByID(row[1].trim());
                Room room = getRoom(row[2].trim());

                if (user == null || room == null) {
                    continue;
                }

                LocalDateTime startTime =
                        LocalDateTime.parse(
                                row[3].trim(),
                                CSV_DATE_FORMAT);

                LocalDateTime endTime =
                        LocalDateTime.parse(
                                row[4].trim(),
                                CSV_DATE_FORMAT);

                boolean checkedIn =
                        Boolean.parseBoolean(row[5].trim());

                boolean cancelled =
                        Boolean.parseBoolean(row[6].trim());

                boolean depositForfeited =
                        Boolean.parseBoolean(row[7].trim());

                double upfrontDeposit =
                        Double.parseDouble(row[8].trim());

                Booking booking = new Booking(
                        bookingID,
                        user,
                        room,
                        startTime,
                        endTime,
                        pricingFor(user),
                        null,
                        checkedIn,
                        cancelled,
                        depositForfeited,
                        upfrontDeposit);

                activeBookings.add(booking);
            } catch (RuntimeException exception) {
                System.err.println(
                        "Skipped invalid booking row: " + row[0]);
            }
        }
    }

    private void saveRooms() {
        List<String> rows = new ArrayList<>();

        for (Room room : rooms.values()) {
            rows.add(String.join(",",
                    CsvDatabase.clean(room.getRoomID()),
                    Integer.toString(room.getCapacity()),
                    CsvDatabase.clean(room.getBuilding()),
                    CsvDatabase.clean(room.getRoomNumber()),
                    Boolean.toString(room.isOccupied()),
                    Boolean.toString(room.isMaintenance()),
                    CsvDatabase.clean(room.getStatus())));
        }

        CsvDatabase.replaceRows(
                CsvDatabase.ROOMS_FILE,
                "roomID,capacity,building,room,"
                        + "occupied,maintenance,status",
                rows);
    }

    private void saveBookings() {
        List<String> rows = new ArrayList<>();

        for (Booking booking : activeBookings) {
            rows.add(String.join(",",
                    CsvDatabase.clean(booking.getBookingID()),
                    CsvDatabase.clean(
                            booking.getUser().getUserID()),
                    CsvDatabase.clean(
                            booking.getRoom().getRoomID()),
                    booking.getStartTime()
                            .format(CSV_DATE_FORMAT),
                    booking.getEndTime()
                            .format(CSV_DATE_FORMAT),
                    Boolean.toString(booking.isCheckedIn()),
                    Boolean.toString(booking.isCancelled()),
                    Boolean.toString(
                            booking.isDepositForfeited()),
                    String.format(
                            java.util.Locale.US,
                            "%.2f",
                            booking.getUpfrontDeposit()),
                    String.format(
                            java.util.Locale.US,
                            "%.2f",
                            booking.getPricingStrategy()
                                    .getHourlyRate()),
                    paymentTypeFor(booking)));
        }

        CsvDatabase.replaceRows(
                CsvDatabase.BOOKINGS_FILE,
                "bookingID,userID,roomID,startTime,endTime,"
                        + "checkedIn,cancelled,depositForfeited,"
                        + "upfrontDeposit,hourlyRate,paymentType",
                rows);
    }

    private String generateBookingID() {
        int largestID = 0;

        for (Booking booking : activeBookings) {
            String bookingID = booking.getBookingID();

            if (bookingID == null
                    || !bookingID.matches("B\\d+")) {
                continue;
            }

            largestID = Math.max(
                    largestID,
                    Integer.parseInt(bookingID.substring(1)));
        }

        return String.format("B%03d", largestID + 1);
    }

    private PricingStrategy pricingFor(User user) {
        switch (user.getAccountType().toLowerCase()) {
        case "student":
            return new StudentPricing();

        case "faculty":
            return new FacultyPricing();

        case "staff":
            return new StaffPricing();

        case "partner":
            return new PartnerPricing();

        default:
            throw new IllegalArgumentException(
                    "Unknown account type.");
        }
    }

    private String paymentTypeFor(Booking booking) {
        if (booking.getPaymentStrategy() == null) {
            return "";
        }

        String name = booking.getPaymentStrategy()
                .getClass()
                .getSimpleName();

        if ("CreditCardPayment".equals(name)) {
            return "credit_card";
        }

        if ("DebitCardPayment".equals(name)) {
            return "debit_card";
        }

        if ("InstitutionBilling".equals(name)) {
            return "institution_billing";
        }

        return name.toLowerCase();
    }

    private String normalize(String value) {
        return value.trim().toLowerCase();
    }
}