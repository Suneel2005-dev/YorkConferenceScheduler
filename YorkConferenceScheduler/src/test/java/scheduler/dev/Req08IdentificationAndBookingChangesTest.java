package scheduler.dev;

import org.junit.*;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

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
	private Map<String, Object> details = new HashMap<>();
	private String userID = "U007";
	private String email = "Dan3@yorku.ca";
	private String pwd = "Password!1";
	private String orgID = "951757";
	
	@Before
	public void setUp() {
		testUser = new Student("U005", "Daniel1@yorku.ca", "Password_1", "602519", true);
		testRoom = new Room("R101", 30, "Lassonde", "1001", false, false, "enabled");
		start = LocalDateTime.of(2026, 9, 10, 10, 0);
		end = LocalDateTime.of(2026, 9, 10, 12, 0);
		testPayment = new CreditCardPayment();
		testPricing = new StudentPricing();
		details.put("userID", userID);
		details.put("email", email);
		details.put("password", pwd);
		details.put("orgID", orgID);
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
	
	@Test
	public void testModifyBooking() {
		Booking booking = new Booking(testUser, testRoom, start, end, testPricing, testPayment);
		booking.modifyTimes(start.plusHours(1), end.plusHours(1));
		assertEquals(start.plusHours(1), booking.getStartTime());
		assertEquals(end.plusHours(1), booking.getEndTime());
	}
	
	@Test
	public void testUserValidation() {
		
		UserFactory factory = new UserFactory();
		factory.createUser("student", details);
		User user2 = factory.getUserByID(userID);
		
		assertTrue(user2.isVerified());
		assertEquals(orgID, user2.getOrgID());
	}
	
	@Test
	public void testCancelBookingByUserID() {
		BookingManager bookingManager = new BookingManager();
		bookingManager.addRoom(testRoom);
		Booking booking = bookingManager.createBooking(testUser, testRoom.getRoomID(), start, end, testPricing, testPayment);
		assertTrue(bookingManager.cancelBooking("U005"));
		assertTrue(booking.isCancelled());
	}

	@Test
	public void testCancelBookingByBookingID() {
		BookingManager bookingManager = new BookingManager();
		bookingManager.addRoom(testRoom);
		Booking booking = bookingManager.createBooking(testUser, testRoom.getRoomID(), start, end, testPricing, testPayment);
		assertTrue(bookingManager.cancelBookingByID(booking.getBookingID()));
		assertTrue(booking.isCancelled());
	}
}
