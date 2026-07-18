package booking;

import booking.BookingManager;
import user.UserFactory;
import user.ChiefEventCoordinator;

import java.time.LocalDateTime;

public class BookingSystemFacade {

    private static BookingSystemFacade instance;

    private UserFactory userFactory;
    private BookingManager bookingManager;

    private BookingSystemFacade() {
    }

    public static BookingSystemFacade getInstance() {
        return null;
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
