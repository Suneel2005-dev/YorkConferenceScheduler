package scheduler.booking;

import java.time.LocalDateTime;

import scheduler.payment.CreditCardPayment;
import scheduler.payment.DebitCardPayment;
import scheduler.payment.InstitutionBilling;
import scheduler.payment.PaymentStrategy;
import scheduler.pricing.FacultyPricing;
import scheduler.pricing.PartnerPricing;
import scheduler.pricing.PricingStrategy;
import scheduler.pricing.StaffPricing;
import scheduler.pricing.StudentPricing;
import scheduler.room.Room;
import scheduler.user.User;
import scheduler.user.UserFactory;

public class BookingSystemFacade {

	private static BookingSystemFacade instance;

	private final UserFactory userFactory;
	private final BookingManager bookingManager;

	private BookingSystemFacade() {
		userFactory = new UserFactory();
		bookingManager = new BookingManager();

		bookingManager.addRoom(new Room("R101", 20, "First Floor"));

		bookingManager.addRoom(new Room("R205", 40, "Second Floor"));

		bookingManager.addRoom(new Room("R310", 60, "Third Floor"));
	}

	public static BookingSystemFacade getInstance() {
		if (instance == null) {
			instance = new BookingSystemFacade();
		}

		return instance;
	}

	public boolean processBooking(String userID, String roomID, int hours) {

		return processBooking(userID, roomID, LocalDateTime.now().plusMinutes(1), hours, "Credit Card");
	}


	 // Overloaded version used by the GUI.

	public boolean processBooking(String userID, String roomID, LocalDateTime startTime, int hours,
			String paymentMethod) {

		if (userID == null || userID.isBlank() || roomID == null || roomID.isBlank() || startTime == null
				|| hours <= 0) {

			return false;
		}

		User user = userFactory.getUserByID(userID);

		if (user == null || !user.isVerified()) {
			return false;
		}

		PricingStrategy pricingStrategy = selectPricingStrategy(user);

		PaymentStrategy paymentStrategy = selectPaymentStrategy(paymentMethod);

		if (pricingStrategy == null || paymentStrategy == null) {

			return false;
		}

		LocalDateTime endTime = startTime.plusHours(hours);

		try {
			bookingManager.createBooking(user, roomID, startTime, endTime, pricingStrategy, paymentStrategy);

			return true;

		} catch (IllegalArgumentException | IllegalStateException exception) {

			return false;
		}
	}

	public boolean modifyBooking(String userID, LocalDateTime newStart, LocalDateTime newEnd) {

		return bookingManager.modifyBooking(userID, newStart, newEnd);
	}

	public boolean cancelBooking(String userID) {
		return bookingManager.cancelBooking(userID);
	}

	public boolean extendBooking(String userID, int additionalHours) {

		return bookingManager.extendBooking(userID, additionalHours);
	}

	public boolean addRoom(Room room) {
		return bookingManager.addRoom(room);
	}

	public Room getRoom(String roomID) {
		return bookingManager.getRoom(roomID);
	}

	public Booking findBookingByUser(String userID) {
		return bookingManager.findBookingByUser(userID);
	}

	public BookingManager getBookingManager() {
		return bookingManager;
	}

	private PricingStrategy selectPricingStrategy(User user) {

		String accountType = user.getAccountType();

		if ("Student".equalsIgnoreCase(accountType)) {
			return new StudentPricing();
		}

		if ("Faculty".equalsIgnoreCase(accountType)) {
			return new FacultyPricing();
		}

		if ("Staff".equalsIgnoreCase(accountType)) {
			return new StaffPricing();
		}

		if ("Partner".equalsIgnoreCase(accountType)) {
			return new PartnerPricing();
		}

		return null;
	}

	private PaymentStrategy selectPaymentStrategy(String paymentMethod) {

		if (paymentMethod == null) {
			return null;
		}

		if ("Credit Card".equalsIgnoreCase(paymentMethod)) {
			return new CreditCardPayment();
		}

		if ("Debit Card".equalsIgnoreCase(paymentMethod)) {
			return new DebitCardPayment();
		}

		if ("Institution Billing".equalsIgnoreCase(paymentMethod)) {
			return new InstitutionBilling();
		}

		return null;
	}
}
