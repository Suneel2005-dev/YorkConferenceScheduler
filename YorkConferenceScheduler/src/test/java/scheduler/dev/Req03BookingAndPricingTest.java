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
import scheduler.booking.BookingSystemFacade;
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

    @Test
    public void bookingConstructorStoresAllProvidedValues() {
        Student user = student("S-CONSTRUCTOR");
        StudentPricing pricing = new StudentPricing();

        Booking booking = new Booking(
                user,
                room,
                start,
                end,
                pricing,
                successfulPayment
        );

        assertNotNull(booking.getBookingID());
        assertSame(user, booking.getUser());
        assertSame(room, booking.getRoom());
        assertEquals(start, booking.getStartTime());
        assertEquals(end, booking.getEndTime());
        assertSame(pricing, booking.getPricingStrategy());
        assertSame(successfulPayment, booking.getPaymentStrategy());
        assertFalse(booking.isCheckedIn());
        assertFalse(booking.isCancelled());
        assertFalse(booking.isDepositForfeited());
    }

    @Test
    public void calculateUpfrontCostEqualsOneHourlyRate() {
        Booking booking = new Booking(
                student("S-UPFRONT"),
                room,
                start,
                end,
                new StudentPricing(),
                successfulPayment
        );

        double upfrontCost = booking.calculateUpfrontCost();

        assertEquals(20.0, upfrontCost, DELTA);
        assertEquals(20.0, booking.getUpfrontDeposit(), DELTA);
    }

    @Test
    public void finalCostBeforeCheckInIncludesEntireBookingCost() {
        Booking booking = new Booking(
                student("S-FINAL-1"),
                room,
                start,
                end,
                new StudentPricing(),
                successfulPayment
        );

        booking.calculateUpfrontCost();

        assertEquals(40.0, booking.calculateFinalCost(), DELTA);
    }

    @Test
    public void finalCostAfterCheckInSubtractsDeposit() {
        Booking booking = new Booking(
                student("S-FINAL-2"),
                room,
                start,
                end,
                new StudentPricing(),
                successfulPayment
        );

        booking.calculateUpfrontCost();
        booking.checkIn();

        assertTrue(booking.isCheckedIn());
        assertEquals(20.0, booking.calculateFinalCost(), DELTA);
    }

    @Test
    public void executePaymentUsesConfiguredPaymentStrategy() {
        final double[] receivedAmount = new double[1];

        PaymentStrategy recordingPayment = amount -> {
            receivedAmount[0] = amount;
            return true;
        };

        Booking booking = new Booking(
                student("S-PAYMENT"),
                room,
                start,
                end,
                new StudentPricing(),
                recordingPayment
        );

        boolean result = booking.executePayment(45.50);

        assertTrue(result);
        assertEquals(45.50, receivedAmount[0], DELTA);
    }

    @Test
    public void executePaymentReturnsFalseWhenStrategyRejectsPayment() {
        Booking booking = new Booking(
                student("S-PAYMENT-FAIL"),
                room,
                start,
                end,
                new StudentPricing(),
                amount -> false
        );

        assertFalse(booking.executePayment(20.0));
    }

    @Test
    public void checkInMarksActiveBookingAsCheckedIn() {
        Booking booking = create(student("S-CHECKIN"), new StudentPricing());

        booking.checkIn();

        assertTrue(booking.isCheckedIn());
        assertFalse(booking.isCancelled());
    }

    @Test
    public void cancelledBookingCannotBeCheckedIn() {
        Booking booking = create(student("S-CANCEL-CHECKIN"), new StudentPricing());

        booking.cancel();
        booking.checkIn();

        assertTrue(booking.isCancelled());
        assertFalse(booking.isCheckedIn());
    }

    @Test
    public void forfeitingDepositUpdatesBookingState() {
        Booking booking = create(student("S-FORFEIT"), new StudentPricing());

        booking.checkIn();
        booking.forfeitDeposit();

        assertTrue(booking.isDepositForfeited());
        assertFalse(booking.isCheckedIn());
    }

    @Test
    public void activeBookingOverlapsContainedTimeRange() {
        Booking booking = create(student("S-OVERLAP"), new StudentPricing());

        assertTrue(booking.overlaps(
                start.plusMinutes(30),
                end.minusMinutes(30)
        ));
    }

    @Test
    public void bookingDoesNotOverlapAdjacentTimeRange() {
        Booking booking = create(student("S-ADJACENT"), new StudentPricing());

        assertFalse(booking.overlaps(
                end,
                end.plusHours(1)
        ));
    }

    @Test
    public void cancelledBookingDoesNotCauseOverlap() {
        Booking booking = create(student("S-CANCEL-OVERLAP"), new StudentPricing());

        booking.cancel();

        assertFalse(booking.overlaps(start, end));
    }

    @Test
    public void modifyTimesChangesStartAndEndTimes() {
        Booking booking = create(student("S-MODIFY-DIRECT"), new StudentPricing());

        LocalDateTime newStart = start.plusDays(1);
        LocalDateTime newEnd = newStart.plusHours(3);

        booking.modifyTimes(newStart, newEnd);

        assertEquals(newStart, booking.getStartTime());
        assertEquals(newEnd, booking.getEndTime());
    }

    @Test
    public void extendingBookingAddsHoursToEndTime() {
        Booking booking = create(student("S-EXTEND-DIRECT"), new StudentPricing());

        LocalDateTime originalEnd = booking.getEndTime();

        boolean extended = booking.extendBooking(3);

        assertTrue(extended);
        assertEquals(originalEnd.plusHours(3), booking.getEndTime());
    }

    @Test
    public void extendingBookingByZeroHoursIsRejected() {
        Booking booking = create(student("S-EXTEND-ZERO"), new StudentPricing());

        LocalDateTime originalEnd = booking.getEndTime();

        assertFalse(booking.extendBooking(0));
        assertEquals(originalEnd, booking.getEndTime());
    }

    @Test
    public void extendingBookingByNegativeHoursIsRejected() {
        Booking booking = create(student("S-EXTEND-NEGATIVE"), new StudentPricing());

        LocalDateTime originalEnd = booking.getEndTime();

        assertFalse(booking.extendBooking(-2));
        assertEquals(originalEnd, booking.getEndTime());
    }

    @Test
    public void cancelledBookingCannotBeExtended() {
        Booking booking = create(student("S-EXTEND-CANCELLED"), new StudentPricing());

        LocalDateTime originalEnd = booking.getEndTime();
        booking.cancel();

        assertFalse(booking.extendBooking(2));
        assertEquals(originalEnd, booking.getEndTime());
    }

    @Test
    public void bookingIDCanBeChanged() {
        Booking booking = create(student("S-BOOKING-ID"), new StudentPricing());

        booking.setBookingID("CUSTOM-BOOKING-ID");

        assertEquals("CUSTOM-BOOKING-ID", booking.getBookingID());
    }

    @Test
    public void paymentStrategyCanBeChanged() {
        Booking booking = create(student("S-CHANGE-PAYMENT"), new StudentPricing());
        PaymentStrategy replacement = amount -> false;

        booking.setPaymentStrategy(replacement);

        assertSame(replacement, booking.getPaymentStrategy());
        assertFalse(booking.executePayment(20.0));
    }

    @Test
    public void pricingStrategyCanBeChanged() {
        Booking booking = create(student("S-CHANGE-PRICING"), new StudentPricing());
        FacultyPricing replacement = new FacultyPricing();

        booking.setPricingStrategy(replacement);

        assertSame(replacement, booking.getPricingStrategy());
        assertEquals(30.0, booking.calculateUpfrontCost(), DELTA);
    }

    @Test
    public void addingNullRoomIsRejected() {
        assertFalse(manager.addRoom(null));
    }

    @Test
    public void addingDuplicateRoomIDIsRejected() {
        Room duplicate = new Room(
                room.getRoomID(),
                50,
                "Different Building",
                "999",
                false,
                false,
                "enabled"
        );

        assertFalse(manager.addRoom(duplicate));
    }

    @Test
    public void getRoomReturnsAddedRoom() {
        Room returnedRoom = manager.getRoom(room.getRoomID());

        assertSame(room, returnedRoom);
    }

    @Test
    public void getRoomReturnsNullForNullBlankAndUnknownIDs() {
        assertNull(manager.getRoom(null));
        assertNull(manager.getRoom(""));
        assertNull(manager.getRoom("   "));
        assertNull(manager.getRoom("UNKNOWN-ROOM"));
    }

    @Test
    public void getRoomsContainsAddedRoom() {
        assertTrue(manager.getRooms().containsKey(room.getRoomID()));
        assertSame(room, manager.getRooms().get(room.getRoomID()));
    }

    @Test
    public void createdBookingIsAddedToActiveBookings() {
        Booking booking = create(student("S-ACTIVE"), new StudentPricing());

        assertEquals(1, manager.getActiveBookings().size());
        assertTrue(manager.getActiveBookings().contains(booking));
    }

    @Test
    public void findBookingByUserReturnsUsersBooking() {
        Booking booking = create(student("S-FIND"), new StudentPricing());

        Booking result = manager.findBookingByUser("S-FIND");

        assertSame(booking, result);
    }

    @Test
    public void findBookingByUnknownUserReturnsNull() {
        assertNull(manager.findBookingByUser("UNKNOWN-USER"));
    }

    @Test
    public void getBookingsForUserReturnsAllMatchingBookings() {
        Student user = student("S-MULTIPLE");

        Booking first = manager.createBooking(
                user,
                room.getRoomID(),
                start,
                end,
                new StudentPricing(),
                successfulPayment
        );

        Booking second = manager.createBooking(
                user,
                room.getRoomID(),
                end,
                end.plusHours(1),
                new StudentPricing(),
                successfulPayment
        );

        assertEquals(2, manager.getBookingsForUser("S-MULTIPLE").size());
        assertTrue(manager.getBookingsForUser("S-MULTIPLE").contains(first));
        assertTrue(manager.getBookingsForUser("S-MULTIPLE").contains(second));
    }

    @Test
    public void getBookingsForUnknownUserReturnsEmptyList() {
        assertNotNull(manager.getBookingsForUser("UNKNOWN-USER"));
        assertTrue(manager.getBookingsForUser("UNKNOWN-USER").isEmpty());
    }

    @Test
    public void managerCanModifyExistingBooking() {
        Booking booking = create(student("S-MANAGER-MODIFY"), new StudentPricing());

        LocalDateTime newStart = start.plusDays(2);
        LocalDateTime newEnd = newStart.plusHours(4);

        boolean modified = manager.modifyBooking(
                "S-MANAGER-MODIFY",
                newStart,
                newEnd
        );

        assertTrue(modified);
        assertEquals(newStart, booking.getStartTime());
        assertEquals(newEnd, booking.getEndTime());
    }

    @Test
    public void managerCannotModifyUnknownUsersBooking() {
        assertFalse(manager.modifyBooking(
                "UNKNOWN-USER",
                start.plusDays(1),
                end.plusDays(1)
        ));
    }

    @Test
    public void managerRejectsModifyWithInvalidTimeRange() {
        create(student("S-BAD-MODIFY"), new StudentPricing());

        assertFalse(manager.modifyBooking(
                "S-BAD-MODIFY",
                end,
                start
        ));
    }

    @Test
    public void managerCanCancelExistingBooking() {
        Booking booking = create(student("S-MANAGER-CANCEL"), new StudentPricing());

        boolean cancelled = manager.cancelBooking("S-MANAGER-CANCEL");

        assertTrue(cancelled);
        assertTrue(booking.isCancelled());
        assertTrue(manager.isRoomAvailable(room.getRoomID(), start, end));
    }

    @Test
    public void managerCannotCancelUnknownUsersBooking() {
        assertFalse(manager.cancelBooking("UNKNOWN-USER"));
    }

    @Test
    public void managerCanExtendExistingBooking() {
        Booking booking = create(student("S-MANAGER-EXTEND"), new StudentPricing());

        LocalDateTime originalEnd = booking.getEndTime();

        boolean extended = manager.extendBooking("S-MANAGER-EXTEND", 2);

        assertTrue(extended);
        assertEquals(originalEnd.plusHours(2), booking.getEndTime());
    }

    @Test
    public void managerCannotExtendUnknownUsersBooking() {
        assertFalse(manager.extendBooking("UNKNOWN-USER", 2));
    }

    @Test
    public void managerRejectsNonpositiveExtension() {
        Booking booking = create(student("S-MANAGER-BAD-EXTEND"), new StudentPricing());

        LocalDateTime originalEnd = booking.getEndTime();

        assertFalse(manager.extendBooking("S-MANAGER-BAD-EXTEND", 0));
        assertFalse(manager.extendBooking("S-MANAGER-BAD-EXTEND", -1));
        assertEquals(originalEnd, booking.getEndTime());
    }

    @Test
    public void removeRoomDeletesExistingRoom() {
        assertTrue(manager.removeRoom(room.getRoomID()));
        assertNull(manager.getRoom(room.getRoomID()));
    }

    @Test
    public void removeRoomReturnsFalseForUnknownRoom() {
        assertFalse(manager.removeRoom("UNKNOWN-ROOM"));
    }

    @Test
    public void updateRoomStateChangesRoomStatus() {
        assertTrue(manager.updateRoomState(room.getRoomID(), "disabled"));

        Room updatedRoom = manager.getRoom(room.getRoomID());

        assertNotNull(updatedRoom);
        assertEquals("disabled", updatedRoom.getStatus());
    }

    @Test
    public void updateRoomStateReturnsFalseForUnknownRoom() {
        assertFalse(manager.updateRoomState("UNKNOWN-ROOM", "disabled"));
    }

    @Test
    public void cancelBookingByIDCancelsMatchingBooking() {
        Booking booking = create(student("S-CANCEL-ID"), new StudentPricing());

        boolean cancelled = manager.cancelBookingByID(booking.getBookingID());

        assertTrue(cancelled);
        assertTrue(booking.isCancelled());
    }

    @Test
    public void cancelBookingByIDReturnsFalseForUnknownID() {
        assertFalse(manager.cancelBookingByID("UNKNOWN-BOOKING-ID"));
    }

    @Test
    public void facadeGetInstanceReturnsSameObject() {
        BookingSystemFacade first = BookingSystemFacade.getInstance();
        BookingSystemFacade second = BookingSystemFacade.getInstance();

        assertNotNull(first);
        assertSame(first, second);
    }

    @Test
    public void facadeProvidesBookingManager() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        assertNotNull(facade.getBookingManager());
    }

    @Test
    public void facadeCanAddAndRetrieveRoom() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        String roomID = "FACADE-" + System.nanoTime();

        Room facadeRoom = new Room(
                roomID,
                25,
                "Lassonde",
                "201",
                false,
                false,
                "enabled"
        );

        assertTrue(facade.addRoom(facadeRoom));
        assertSame(facadeRoom, facade.getRoom(roomID));

        facade.removeRoom(roomID);
    }

    @Test
    public void facadeRejectsDuplicateRoom() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        String roomID = "FACADE-DUPLICATE-" + System.nanoTime();

        Room first = new Room(
                roomID,
                25,
                "Lassonde",
                "202",
                false,
                false,
                "enabled"
        );

        Room duplicate = new Room(
                roomID,
                40,
                "Vari Hall",
                "300",
                false,
                false,
                "enabled"
        );

        assertTrue(facade.addRoom(first));
        assertFalse(facade.addRoom(duplicate));

        facade.removeRoom(roomID);
    }

    @Test
    public void facadeCanUpdateRoomState() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        String roomID = "FACADE-STATE-" + System.nanoTime();

        Room facadeRoom = new Room(
                roomID,
                25,
                "Lassonde",
                "203",
                false,
                false,
                "enabled"
        );

        assertTrue(facade.addRoom(facadeRoom));
        assertTrue(facade.updateRoomState(roomID, "disabled"));
        assertEquals("disabled", facade.getRoom(roomID).getStatus());

        facade.removeRoom(roomID);
    }

    @Test
    public void facadeCanRemoveRoom() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        String roomID = "FACADE-REMOVE-" + System.nanoTime();

        Room facadeRoom = new Room(
                roomID,
                25,
                "Lassonde",
                "204",
                false,
                false,
                "enabled"
        );

        assertTrue(facade.addRoom(facadeRoom));
        assertTrue(facade.removeRoom(roomID));
        assertNull(facade.getRoom(roomID));
    }

    @Test
    public void facadeProcessBookingRejectsNullUserID() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        assertFalse(facade.processBooking(
                null,
                room.getRoomID(),
                start,
                2,
                "Credit Card"
        ));
    }

    @Test
    public void facadeProcessBookingRejectsBlankUserID() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        assertFalse(facade.processBooking(
                "   ",
                room.getRoomID(),
                start,
                2,
                "Credit Card"
        ));
    }

    @Test
    public void facadeProcessBookingRejectsNullRoomID() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        assertFalse(facade.processBooking(
                "S001",
                null,
                start,
                2,
                "Credit Card"
        ));
    }

    @Test
    public void facadeProcessBookingRejectsNullStartTime() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        assertFalse(facade.processBooking(
                "S001",
                room.getRoomID(),
                null,
                2,
                "Credit Card"
        ));
    }

    @Test
    public void facadeProcessBookingRejectsZeroHours() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        assertFalse(facade.processBooking(
                "S001",
                room.getRoomID(),
                start,
                0,
                "Credit Card"
        ));
    }

    @Test
    public void facadeProcessBookingRejectsNegativeHours() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        assertFalse(facade.processBooking(
                "S001",
                room.getRoomID(),
                start,
                -2,
                "Credit Card"
        ));
    }

    @Test
    public void facadeProcessBookingRejectsUnknownUser() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        assertFalse(facade.processBooking(
                "UNKNOWN-USER",
                room.getRoomID(),
                start,
                2,
                "Credit Card"
        ));
    }

    @Test
    public void facadeOperationsReturnFalseForUnknownBooking() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();

        assertFalse(facade.cancelBooking("UNKNOWN-USER"));
        assertFalse(facade.extendBooking("UNKNOWN-USER", 2));
        assertFalse(facade.modifyBooking(
                "UNKNOWN-USER",
                start,
                end
        ));
        assertFalse(facade.cancelBookingByID("UNKNOWN-BOOKING-ID"));
    }
}
