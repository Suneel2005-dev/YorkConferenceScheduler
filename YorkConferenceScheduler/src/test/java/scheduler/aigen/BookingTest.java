package scheduler.aigen;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import scheduler.booking.Booking;
import scheduler.payment.PaymentStrategy;
import scheduler.pricing.StudentPricing;
import scheduler.room.Room;
import scheduler.user.Student;

public class BookingTest {
    private Student user;
    private Room room;
    private LocalDateTime start;
    private PaymentStrategy successfulPayment;

    @Before
    public void setUp() {
        user = new Student("u1", "u@yorku.ca", "Password1!", "s1", true);
        room = new Room("R1", 10, "LAS", "100", false, false, "enabled");
        start = LocalDateTime.of(2030, 1, 1, 10, 0);
        successfulPayment = amount -> true;
    }

    private Booking booking() {
        return new Booking(user, room, start, start.plusMinutes(90),
                new StudentPricing(), successfulPayment);
    }

    @Test
    public void constructorStoresCompletePersistedState() {
        Booking booking = new Booking("B1", user, room, start, start.plusHours(2),
                new StudentPricing(), successfulPayment, true, false, false, 20.0);

        assertEquals("B1", booking.getBookingID());
        assertSame(user, booking.getUser());
        assertSame(room, booking.getRoom());
        assertEquals(start, booking.getStartTime());
        assertEquals(start.plusHours(2), booking.getEndTime());
        assertTrue(booking.isCheckedIn());
        assertFalse(booking.isCancelled());
        assertFalse(booking.isDepositForfeited());
        assertEquals(20.0, booking.getUpfrontDeposit(), 0.001);
    }

    @Test
    public void constructorRejectsMissingOrInvalidRequiredValues() {
        assertThrows(IllegalArgumentException.class,
                () -> new Booking(null, room, start, start.plusHours(1), new StudentPricing(), successfulPayment));
        assertThrows(IllegalArgumentException.class,
                () -> new Booking(user, null, start, start.plusHours(1), new StudentPricing(), successfulPayment));
        assertThrows(IllegalArgumentException.class,
                () -> new Booking(user, room, null, start.plusHours(1), new StudentPricing(), successfulPayment));
        assertThrows(IllegalArgumentException.class,
                () -> new Booking(user, room, start, start, new StudentPricing(), successfulPayment));
        assertThrows(IllegalArgumentException.class,
                () -> new Booking(user, room, start, start.plusHours(1), null, successfulPayment));
    }

    @Test
    public void depositIsAppliedOnlyAfterSuccessfulCheckIn() {
        Booking booking = booking();

        assertEquals(20.0, booking.calculateUpfrontCost(), 0.001);
        assertEquals(30.0, booking.calculateFinalCost(), 0.001);

        booking.checkIn();
        assertEquals(10.0, booking.calculateFinalCost(), 0.001);

        booking.forfeitDeposit();
        assertFalse(booking.isCheckedIn());
        assertTrue(booking.isDepositForfeited());
        assertEquals(30.0, booking.calculateFinalCost(), 0.001);
    }

    @Test
    public void partialHoursAreChargedProportionally() {
        Booking booking = booking();
        booking.calculateUpfrontCost();

        assertEquals(30.0, booking.calculateFinalCost(), 0.001);
        assertEquals(40.0, booking.calculateFinalCost(2), 0.001);
        assertEquals(0.0, booking.calculateFinalCost(0), 0.001);
    }

    @Test
    public void executePaymentDelegatesExactAmountAndRejectsInvalidInput() {
        AtomicReference<Double> charged = new AtomicReference<>();
        Booking booking = booking();
        booking.setPaymentStrategy(amount -> {
            charged.set(amount);
            return amount == 20.0;
        });

        assertTrue(booking.executePayment(20.0));
        assertEquals(20.0, charged.get(), 0.001);
        assertFalse(booking.executePayment(-0.01));

        booking.setPaymentStrategy(null);
        assertFalse(booking.executePayment(20.0));
    }

    @Test
    public void overlapUsesHalfOpenTimeIntervalsAndIgnoresCancelledBookings() {
        Booking booking = booking();

        assertTrue(booking.overlaps(start.plusMinutes(30), start.plusHours(2)));
        assertFalse(booking.overlaps(start.minusHours(1), start));
        assertFalse(booking.overlaps(start.plusMinutes(90), start.plusHours(2)));
        assertFalse(booking.overlaps(null, start));

        booking.cancel();
        assertFalse(booking.overlaps(start, start.plusHours(9)));
    }

    @Test
    public void cancelledBookingCannotBeModifiedExtendedOrCheckedIn() {
        Booking booking = booking();
        booking.cancel();

        assertFalse(booking.extendBooking(1));
        assertThrows(IllegalStateException.class,
                () -> booking.modifyTimes(start, start.plusHours(1)));
        assertThrows(IllegalStateException.class, booking::checkIn);
    }
}
