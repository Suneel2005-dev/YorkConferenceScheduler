package scheduler.dev;

import org.junit.*;
import static org.junit.Assert.*;

import java.time.LocalDateTime;
import scheduler.booking.*;
import scheduler.user.*;
import scheduler.room.*;
import scheduler.payment.*;
import scheduler.pricing.*;

public class Req08IdentificationAndBookingChangesTest {
	
	private Student testUser;
	private Room testRoom;
	private LocalDateTime start;
	private LocalDateTime end;
	private PaymentStrategy testPayment;
	private PricingStrategy testPricing;
	
	@Before
	public void setUp() {
		testUser = new Student("U005", "Daniel1@yorku.ca", "Password_1", "602519", true);
		testRoom = new Room("R101", 30, "Lassonde", "1001", false, false, "enabled");
		start = LocalDateTime.of(2026, 9, 10, 10, 0);
		end = LocalDateTime.of(2026, 9, 10, 12, 0);
		testPayment = new CreditCardPayment();
		testPricing = new StudentPricing();
	}
	
	@Test
	public void testCancel() {
		Booking booking = new Booking(testUser, testRoom, start, end, testPricing, testPayment);
		booking.cancel();
		assertTrue(booking.isCancelled());
	}
	
	@Test
	public void testModifyCancelledBooking() {
		Booking booking = new Booking(testUser, testRoom, start, end, testPricing, testPayment);
		booking.cancel();
		assertThrows(IllegalStateException.class, () -> booking.modifyTimes(start.plusHours(1), end.plusHours(1)));
	}
	
}
