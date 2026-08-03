package scheduler.dev;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.Test;

import scheduler.aigen.*;
import scheduler.booking.*;
import scheduler.payment.*;
import scheduler.pricing.*;
import scheduler.room.*;
import scheduler.user.*;

public class Req09BookingExtensionTest extends TestFileSupport {

    @Test
    public void extendBooking_positiveHours() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(1);
        Booking booking = newBooking(start, end);

        boolean result = booking.extendBooking(2);

        assertTrue(result);
        assertEquals(end.plusHours(2), booking.getEndTime());
    }

    @Test
    public void extendBooking_zeroHours() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(1);
        Booking booking = newBooking(start, end);

        boolean result = booking.extendBooking(0);

        assertFalse(result);
        assertEquals(end, booking.getEndTime());
    }

    @Test
    public void extendBooking_negativeHours() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(1);
        Booking booking = newBooking(start, end);

        boolean result = booking.extendBooking(-3);

        assertFalse(result);
        assertEquals(end, booking.getEndTime());
    }

    @Test
    public void extendBooking_onCancelledBooking() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(1);
        Booking booking = newBooking(start, end);
        booking.cancel();

        boolean result = booking.extendBooking(1);

        assertFalse(result);
        assertEquals(end, booking.getEndTime());
    }

    @Test
    public void extendBooking_calledMultipleTimes() {
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(1);
        Booking booking = newBooking(start, end);

        booking.extendBooking(1);
        booking.extendBooking(2);

        assertEquals(end.plusHours(3), booking.getEndTime());
    }

    @Test
    public void managerExtendBooking_unknownUser() {
        BookingManager manager = new BookingManager();

        boolean result = manager.extendBooking("no such user", 1);

        assertFalse(result);
    }

    @Test
    public void managerExtendBooking_nonPositiveHours() {
        BookingManager manager = new BookingManager();
        String roomID = uniqueId("R");
        manager.addRoom(new Room(roomID, 10, "Test Building"));

        User user = new Student(uniqueId("S"), "S@yorku.ca", "Passw0rd!", "111", true);
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(1);
        manager.createBooking(user, roomID, start, end, new StudentPricing(), new CreditCardPayment());

        boolean result = manager.extendBooking(user.getUserID(), 0);

        assertFalse(result);
        assertEquals(end, manager.findBookingByUser(user.getUserID()).getEndTime());
    }

    @Test
    public void managerExtendBooking_roomAvailable() {
        BookingManager manager = new BookingManager();
        String roomID = uniqueId("R");
        manager.addRoom(new Room(roomID, 10, "Test Building"));

        User user = new Student(uniqueId("S"), "S@yorku.ca", "Passw0rd!", "111", true);
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(1);
        manager.createBooking(user, roomID, start, end, new StudentPricing(), new CreditCardPayment());

        boolean result = manager.extendBooking(user.getUserID(), 2);

        assertTrue(result);
        assertEquals(end.plusHours(2), manager.findBookingByUser(user.getUserID()).getEndTime());
    }

    @Test
    public void managerExtendBooking_conflictingRoomBooking() {
        BookingManager manager = new BookingManager();
        String roomID = uniqueId("R");
        manager.addRoom(new Room(roomID, 10, "Test Building"));

        User firstUser = new Student(uniqueId("S"), "first9@yorku.ca", "Passw0rd!", "111", true);
        LocalDateTime firstStart = LocalDateTime.now().plusHours(2);
        LocalDateTime firstEnd = firstStart.plusHours(1);
        manager.createBooking(
                firstUser, roomID, firstStart, firstEnd, new StudentPricing(), new CreditCardPayment());

        // Second booking starts exactly when the first ends, blocking any extension.
        User secondUser = new Faculty(uniqueId("F9"), "second9@yorku.ca", "Passw0rd!", "222", true);
        LocalDateTime secondStart = firstEnd;
        LocalDateTime secondEnd = secondStart.plusHours(1);
        manager.createBooking(
                secondUser, roomID, secondStart, secondEnd, new StudentPricing(), new CreditCardPayment());

        boolean result = manager.extendBooking(firstUser.getUserID(), 1);

        assertFalse(result);
        assertEquals(firstEnd, manager.findBookingByUser(firstUser.getUserID()).getEndTime());
    }

    @Test
    public void facadeExtendBooking_validRequest() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();
        String roomID = uniqueId("RF9");
        facade.addRoom(new Room(roomID, 10, "Test Building"));

        String userID = uniqueId("SF9");
        registerVerifiedStudent(userID, "sf9@yorku.ca");

        LocalDateTime start = LocalDateTime.now().plusMinutes(90);
        boolean created = facade.processBooking(userID, roomID, start, 1, "Credit Card");
        assertTrue("precondition: booking must be created", created);

        boolean result = facade.extendBooking(userID, 1);

        assertTrue(result);
        assertEquals(
                start.plusHours(2),
                facade.findBookingByUser(userID).getEndTime());
    }

    @Test
    public void facadeExtendBooking_unknownUser() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        boolean result = facade.extendBooking(uniqueId("nobody"), 1);

        assertFalse(result);
    }

    //helper functions
    
    private String uniqueId(String prefix) {
        return prefix + "-" + UUID.randomUUID().toString().substring(0, 8);
    }


    private Booking newBooking(LocalDateTime start, LocalDateTime end) {
        User user = new Student(uniqueId("S"), "S@yorku.ca", "Passw0rd!", "111", true);
        Room room = new Room(uniqueId("R"), 10, "Test Building");
        PricingStrategy pricing = new StudentPricing();
        return new Booking(user, room, start, end, pricing, new CreditCardPayment());
    }

    private void registerVerifiedStudent(String userID, String email) {
        UserFactory userFactory = new UserFactory();
        java.util.Map<String, Object> details = new java.util.HashMap<>();
        details.put("userID", userID);
        details.put("email", email);
        details.put("password", "Passw0rd!");
        details.put("orgID", "999");
        userFactory.createUser("student", details);
    }
}
