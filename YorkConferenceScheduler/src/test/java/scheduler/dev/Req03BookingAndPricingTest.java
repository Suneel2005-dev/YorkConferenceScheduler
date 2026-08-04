package scheduler.dev;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import scheduler.booking.Booking;
import scheduler.booking.BookingManager;
import scheduler.database.CsvDatabase;
import scheduler.payment.PaymentStrategy;
import scheduler.pricing.FacultyPricing;
import scheduler.pricing.PartnerPricing;
import scheduler.pricing.StaffPricing;
import scheduler.pricing.StudentPricing;
import scheduler.room.Room;
import scheduler.user.Faculty;
import scheduler.user.Partner;
import scheduler.user.Staff;
import scheduler.user.Student;
import scheduler.user.User;

public class Req03BookingAndPricingTest {

	private static final double DELTA = 0.001;

	private Path roomsBackup;
	private Path bookingsBackup;
	private boolean roomsOriginallyExisted;
	private boolean bookingsOriginallyExisted;

	private BookingManager manager;
	private Room room;
	private LocalDateTime start;
	private LocalDateTime end;
	private PaymentStrategy successfulPayment;

	@Before
	public void setUp() throws IOException {
		Path tempDirectory = Files.createTempDirectory("req3");

		roomsBackup = tempDirectory.resolve("rooms.csv.backup");
		bookingsBackup = tempDirectory.resolve("bookings.csv.backup");

		roomsOriginallyExisted = Files.exists(CsvDatabase.ROOMS_FILE);
		bookingsOriginallyExisted = Files.exists(CsvDatabase.BOOKINGS_FILE);

		if (roomsOriginallyExisted) {
			Files.copy(CsvDatabase.ROOMS_FILE, roomsBackup);
		}

		if (bookingsOriginallyExisted) {
			Files.copy(CsvDatabase.BOOKINGS_FILE, bookingsBackup);
		}

		Files.writeString(CsvDatabase.ROOMS_FILE, "roomID,capacity,building,room,occupied,maintenance,status");

		Files.writeString(CsvDatabase.BOOKINGS_FILE, "bookingID,userID,roomID,startTime,endTime,"
				+ "checkedIn,cancelled,depositForfeited," + "upfrontDeposit,hourlyRate,paymentType");

		manager = new BookingManager();

		room = new Room("REQ3-R101", 20, "Lassonde", "101", false, false, "enabled");

		assertTrue(manager.addRoom(room));

		start = LocalDateTime.now().plusDays(30).withSecond(0).withNano(0);

		end = start.plusHours(2);

		successfulPayment = amount -> true;
	}

	@After
	public void tearDown() throws IOException {
		restoreFile(CsvDatabase.ROOMS_FILE, roomsBackup, roomsOriginallyExisted);

		restoreFile(CsvDatabase.BOOKINGS_FILE, bookingsBackup, bookingsOriginallyExisted);
	}

	private void restoreFile(Path original, Path backup, boolean originallyExisted) throws IOException {

		if (originallyExisted) {
			Files.copy(backup, original, java.nio.file.StandardCopyOption.REPLACE_EXISTING);
		} else {
			Files.deleteIfExists(original);
		}
	}

	private Student student(String id) {
		return new Student(id, id.toLowerCase() + "@yorku.ca", "password", "STUDENT-NUMBER", true);
	}

	private Faculty faculty(String id) {
		return new Faculty(id, id.toLowerCase() + "@yorku.ca", "password", "YORK", true);
	}

	private Staff staff(String id) {
		return new Staff(id, id.toLowerCase() + "@yorku.ca", "password", "YORK", true);
	}

	private Partner partner(String id) {
		return new Partner(id, id.toLowerCase() + "@partner.ca", "password", "PARTNER-ORG", true);
	}

	private Booking create(User user, scheduler.pricing.PricingStrategy pricing) {

		return manager.createBooking(user, room.getRoomID(), start, end, pricing, successfulPayment);
	}

	@Test
	public void verifiedStudentCanBookAvailableRoomAt20DollarsPerHour() {
		Booking booking = create(student("S001"), new StudentPricing());

		assertNotNull(booking);
		assertTrue(booking.getUser().isVerified());
		assertEquals(20.0, booking.getPricingStrategy().getHourlyRate(), DELTA);
		assertEquals(20.0, booking.getUpfrontDeposit(), DELTA);
	}

	@Test
	public void verifiedFacultyCanBookAvailableRoomAt30DollarsPerHour() {
		Booking booking = create(faculty("F001"), new FacultyPricing());

		assertNotNull(booking);
		assertTrue(booking.getUser().isVerified());
		assertEquals(30.0, booking.getPricingStrategy().getHourlyRate(), DELTA);
		assertEquals(30.0, booking.getUpfrontDeposit(), DELTA);
	}

	@Test
	public void verifiedStaffCanBookAvailableRoomAt40DollarsPerHour() {
		Booking booking = create(staff("T001"), new StaffPricing());

		assertNotNull(booking);
		assertTrue(booking.getUser().isVerified());
		assertEquals(40.0, booking.getPricingStrategy().getHourlyRate(), DELTA);
		assertEquals(40.0, booking.getUpfrontDeposit(), DELTA);
	}

	@Test
	public void verifiedPartnerCanBookAvailableRoomAt50DollarsPerHour() {
		Booking booking = create(partner("P001"), new PartnerPricing());

		assertNotNull(booking);
		assertTrue(booking.getUser().isVerified());
		assertEquals(50.0, booking.getPricingStrategy().getHourlyRate(), DELTA);
		assertEquals(50.0, booking.getUpfrontDeposit(), DELTA);
	}

	@Test
	public void successfulBookingMakesRequestedTimeUnavailable() {
		create(student("S001"), new StudentPricing());

		assertFalse(manager.isRoomAvailable(room.getRoomID(), start, end));
	}

	@Test
	public void overlappingBookingForSameRoomIsRejected() {
		create(student("S001"), new StudentPricing());

		assertThrows(IllegalArgumentException.class, () -> manager.createBooking(faculty("F001"), room.getRoomID(),
				start.plusMinutes(30), end.plusHours(1), new FacultyPricing(), successfulPayment));
	}

	@Test
	public void adjacentBookingForSameRoomIsAllowed() {
		create(student("S001"), new StudentPricing());

		Booking secondBooking = manager.createBooking(faculty("F001"), room.getRoomID(), end, end.plusHours(1),
				new FacultyPricing(), successfulPayment);

		assertNotNull(secondBooking);
	}

	@Test
	public void bookingNonexistentRoomIsRejected() {
		assertThrows(IllegalArgumentException.class, () -> manager.createBooking(student("S001"), "DOES-NOT-EXIST",
				start, end, new StudentPricing(), successfulPayment));
	}

	@Test
	public void bookingMaintenanceRoomIsRejected() {
		Room maintenanceRoom = new Room("REQ3-MAINT", 10, "Lassonde", "102", false, true, "enabled");

		assertTrue(manager.addRoom(maintenanceRoom));

		assertThrows(IllegalArgumentException.class, () -> manager.createBooking(student("S001"),
				maintenanceRoom.getRoomID(), start, end, new StudentPricing(), successfulPayment));
	}

	@Test
	public void bookingDisabledRoomIsRejected() {
		Room disabledRoom = new Room("REQ3-DISABLED", 10, "Lassonde", "103", false, false, "disabled");

		assertTrue(manager.addRoom(disabledRoom));

		assertThrows(IllegalArgumentException.class, () -> manager.createBooking(student("S001"),
				disabledRoom.getRoomID(), start, end, new StudentPricing(), successfulPayment));
	}

	@Test
	public void bookingWithEndBeforeStartIsRejected() {
		assertThrows(IllegalArgumentException.class, () -> manager.createBooking(student("S001"), room.getRoomID(),
				start, start.minusMinutes(1), new StudentPricing(), successfulPayment));
	}

	@Test
	public void bookingInPastIsRejected() {
		LocalDateTime pastStart = LocalDateTime.now().minusHours(2);

		assertThrows(IllegalArgumentException.class, () -> manager.createBooking(student("S001"), room.getRoomID(),
				pastStart, pastStart.plusHours(1), new StudentPricing(), successfulPayment));
	}

	@Test
	public void failedDepositPaymentPreventsBooking() {
		PaymentStrategy failedPayment = amount -> false;

		assertThrows(IllegalStateException.class, () -> manager.createBooking(student("S001"), room.getRoomID(), start,
				end, new StudentPricing(), failedPayment));

		assertTrue(manager.isRoomAvailable(room.getRoomID(), start, end));
	}
}
