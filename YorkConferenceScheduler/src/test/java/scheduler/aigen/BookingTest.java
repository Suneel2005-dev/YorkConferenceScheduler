package scheduler.aigen;

import static org.junit.Assert.*;
import java.time.LocalDateTime;
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
    private PaymentStrategy success;

    @Before public void setUp() {
        user = new Student("u1", "u@yorku.ca", "Password1!", "s1", true);
        room = new Room("R1", 10, "LAS", "100", false, false, "enabled");
        start = LocalDateTime.of(2030, 1, 1, 10, 0);
        success = amount -> true;
    }

    private Booking booking() {
        return new Booking(user, room, start, start.plusMinutes(90), new StudentPricing(), success);
    }

    @Test public void constructorAndGettersWork() {
        Booking b = new Booking("B1", user, room, start, start.plusHours(2), new StudentPricing(), success,
                true, false, false, 20.0);
        assertEquals("B1", b.getBookingID()); assertSame(user, b.getUser()); assertSame(room, b.getRoom());
        assertEquals(start, b.getStartTime()); assertEquals(start.plusHours(2), b.getEndTime());
        assertTrue(b.isCheckedIn()); assertFalse(b.isCancelled()); assertFalse(b.isDepositForfeited());
        assertEquals(20.0, b.getUpfrontDeposit(), 0.001); assertNotNull(b.getPricingStrategy()); assertSame(success, b.getPaymentStrategy());
    }

    @Test public void validatesConstructorArguments() {
        assertThrows(IllegalArgumentException.class, () -> new Booking(null, room, start, start.plusHours(1), new StudentPricing(), success));
        assertThrows(IllegalArgumentException.class, () -> new Booking(user, null, start, start.plusHours(1), new StudentPricing(), success));
        assertThrows(IllegalArgumentException.class, () -> new Booking(user, room, null, start.plusHours(1), new StudentPricing(), success));
        assertThrows(IllegalArgumentException.class, () -> new Booking(user, room, start, start, new StudentPricing(), success));
        assertThrows(IllegalArgumentException.class, () -> new Booking(user, room, start, start.plusHours(1), null, success));
    }

    @Test public void calculatesDepositAndFinalCosts() {
        Booking b = booking();
        assertEquals(20.0, b.calculateUpfrontCost(), 0.001);
        assertEquals(30.0, b.calculateFinalCost(), 0.001);
        assertEquals(40.0, b.calculateFinalCost(2), 0.001);
        b.checkIn();
        assertEquals(10.0, b.calculateFinalCost(), 0.001);
        assertEquals(20.0, b.calculateFinalCost(2), 0.001);
        b.forfeitDeposit();
        assertEquals(30.0, b.calculateFinalCost(), 0.001);
        assertEquals(0.0, b.calculateFinalCost(0), 0.001);
    }

    @Test public void defaultBookingSafelyReturnsZero() {
        Booking b = new Booking();
        assertEquals(0.0, b.calculateUpfrontCost(), 0.001);
        assertEquals(0.0, b.calculateFinalCost(), 0.001);
        assertEquals(0.0, b.calculateFinalCost(2), 0.001);
        assertFalse(b.executePayment(1));
    }

    @Test public void paymentAndSettersWork() {
        Booking b = booking();
        assertTrue(b.executePayment(10)); assertFalse(b.executePayment(-1));
        b.setPaymentStrategy(amount -> false); assertFalse(b.executePayment(10));
        b.setBookingID("new"); assertEquals("new", b.getBookingID());
        b.setPricingStrategy(() -> 99); assertEquals(99, b.calculateUpfrontCost(), 0.001);
        assertThrows(IllegalArgumentException.class, () -> b.setPricingStrategy(null));
    }

    @Test public void overlapModificationExtensionAndCancellation() {
        Booking b = booking();
        assertTrue(b.overlaps(start.plusMinutes(30), start.plusHours(2)));
        assertFalse(b.overlaps(start.minusHours(2), start));
        assertFalse(b.overlaps(null, start));
        b.modifyTimes(start.plusHours(1), start.plusHours(3));
        assertEquals(start.plusHours(1), b.getStartTime());
        assertTrue(b.extendBooking(2)); assertEquals(start.plusHours(5), b.getEndTime());
        assertFalse(b.extendBooking(0));
        assertThrows(IllegalArgumentException.class, () -> b.modifyTimes(null, start));
        assertThrows(IllegalArgumentException.class, () -> b.modifyTimes(start, start));
        b.cancel(); assertTrue(b.isCancelled()); assertFalse(b.overlaps(start, start.plusHours(9)));
        assertFalse(b.extendBooking(1));
        assertThrows(IllegalStateException.class, () -> b.modifyTimes(start, start.plusHours(1)));
        assertThrows(IllegalStateException.class, b::checkIn);
    }
}
