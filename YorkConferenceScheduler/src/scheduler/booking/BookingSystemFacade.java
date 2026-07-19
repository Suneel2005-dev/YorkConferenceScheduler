package scheduler.booking;

import java.time.LocalDateTime;

import scheduler.user.UserFactory;

public class BookingSystemFacade {

	private static BookingSystemFacade instance;

	private UserFactory userFactory;
	private BookingManager bookingManager;

	private BookingSystemFacade() {
		userFactory = new UserFactory();
		bookingManager = new BookingManager();
	}

	public static BookingSystemFacade getInstance() {
		if (instance == null) {
			instance = new BookingSystemFacade();
		}

		return instance;
	}

	public boolean processBooking(String userID, String roomID, int hours) {
		return false;
	}

	public boolean modifyBooking(String userID, LocalDateTime newStart, LocalDateTime newEnd) {

		return false;
	}

	public boolean cancelBooking(String userID) {
		return false;
	}
}
