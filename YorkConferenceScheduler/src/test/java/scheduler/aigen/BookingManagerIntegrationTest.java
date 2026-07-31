package scheduler.aigen;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Before;
import org.junit.Test;

import scheduler.booking.Booking;
import scheduler.booking.BookingManager;
import scheduler.database.CsvDatabase;
import scheduler.pricing.StudentPricing;
import scheduler.room.MaintenanceState;
import scheduler.room.Room;
import scheduler.sensor.HardwareSensor;
import scheduler.user.Student;

public class BookingManagerIntegrationTest extends TestFileSupport {
    private static final DateTimeFormatter CSV_TIME = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private Student user;

    @Before
    public void createIsolatedDatabase() throws Exception {
        user = new Student("student1", "student1@yorku.ca", "Strong1!", "YORK", true);
        writeCsv(CsvDatabase.ACCOUNTS_FILE,
                "userID,email,password,orgID,accountType,verified",
                "student1,student1@yorku.ca,Strong1!,YORK,student,true");
        writeCsv(CsvDatabase.ROOMS_FILE,
                "roomID,capacity,building,room,occupied,maintenance,status",
                "R1,20,LAS,101,false,false,enabled",
                "R2,10,ACE,202,false,true,disabled");
        writeCsv(CsvDatabase.BOOKINGS_FILE,
                "bookingID,userID,roomID,startTime,endTime,checkedIn,cancelled,depositForfeited,upfrontDeposit,hourlyRate,paymentType");
    }

    @Test
    public void createBookingChargesDepositAssignsIdAndPersistsRow() throws Exception {
        BookingManager manager = new BookingManager();
        AtomicReference<Double> charged = new AtomicReference<>();
        LocalDateTime start = LocalDateTime.now().plusDays(2).withNano(0);

        Booking booking = manager.createBooking(user, "r1", start, start.plusHours(2),
                new StudentPricing(), amount -> { charged.set(amount); return true; });

        assertEquals("B001", booking.getBookingID());
        assertEquals(20.0, charged.get(), 0.001);
        assertEquals(20.0, booking.getUpfrontDeposit(), 0.001);
        assertSame(booking, manager.findBookingByUser("STUDENT1"));
        List<String[]> rows = CsvDatabase.read(CsvDatabase.BOOKINGS_FILE);
        assertEquals(1, rows.size());
        assertEquals("B001", rows.get(0)[0]);
        assertEquals("student1", rows.get(0)[1]);
        assertEquals("R1", rows.get(0)[2]);
    }

    @Test
    public void failedDepositDoesNotCreateOrPersistBooking() {
        BookingManager manager = new BookingManager();
        LocalDateTime start = LocalDateTime.now().plusDays(2);

        assertThrows(IllegalStateException.class,
                () -> manager.createBooking(user, "R1", start, start.plusHours(1),
                        new StudentPricing(), amount -> false));
        assertTrue(manager.getActiveBookings().isEmpty());
        assertTrue(CsvDatabase.read(CsvDatabase.BOOKINGS_FILE).isEmpty());
    }

    @Test
    public void overlappingBookingIsRejectedButTouchingBoundaryIsAvailable() {
        BookingManager manager = new BookingManager();
        LocalDateTime start = LocalDateTime.now().plusDays(3).withNano(0);
        manager.createBooking(user, "R1", start, start.plusHours(2), new StudentPricing(), amount -> true);

        assertFalse(manager.isRoomAvailable("R1", start.plusMinutes(30), start.plusHours(3)));
        assertTrue(manager.isRoomAvailable("R1", start.plusHours(2), start.plusHours(3)));
        assertThrows(IllegalArgumentException.class,
                () -> manager.createBooking(new Student("s2", "s2@yorku.ca", "Strong1!", "Y", true),
                        "R1", start.plusMinutes(30), start.plusHours(1), new StudentPricing(), amount -> true));
    }

    @Test
    public void invalidAndMaintenanceRoomsCannotBeBooked() {
        BookingManager manager = new BookingManager();
        LocalDateTime start = LocalDateTime.now().plusDays(1);

        assertThrows(IllegalArgumentException.class,
                () -> manager.createBooking(user, "missing", start, start.plusHours(1), new StudentPricing(), amount -> true));
        assertThrows(IllegalArgumentException.class,
                () -> manager.createBooking(user, "R2", start, start.plusHours(1), new StudentPricing(), amount -> true));
        assertThrows(IllegalArgumentException.class,
                () -> manager.createBooking(user, "R1", LocalDateTime.now().minusHours(1), LocalDateTime.now(),
                        new StudentPricing(), amount -> true));
    }

    @Test
    public void sensorEventsChangeRoomOccupancyAndBadgeScanChecksIn() {
        LocalDateTime start = LocalDateTime.now().plusMinutes(10).withNano(0);
        writeBookingRow("B010", start, start.plusHours(1), false, false, false, 20.0);
        BookingManager manager = new BookingManager();
        HardwareSensor sensor = new HardwareSensor("S1", "R1");
        sensor.attach(manager);

        sensor.badgeScan("student1");
        Booking booking = manager.findBookingByUser("student1");
        assertTrue(booking.isCheckedIn());
        assertTrue(manager.getRoom("R1").isOccupied());

        sensor.detectOccupancy(false);
        assertFalse(manager.getRoom("R1").isOccupied());
    }

    @Test
    public void timeoutForfeitsDepositAfterThirtyMinuteDeadline() {
        LocalDateTime start = LocalDateTime.now().minusMinutes(31).withNano(0);
        writeBookingRow("B011", start, start.plusHours(1), false, false, false, 20.0);
        BookingManager manager = new BookingManager();

        manager.checkTimeouts();

        Booking booking = manager.findBookingByUser("student1");
        assertTrue(booking.isDepositForfeited());
        assertFalse(booking.isCheckedIn());
        assertEquals("true", CsvDatabase.read(CsvDatabase.BOOKINGS_FILE).get(0)[7]);
    }

    @Test
    public void modifyExtendCancelAndRemoveRespectBookingConflicts() {
        BookingManager manager = new BookingManager();
        LocalDateTime start = LocalDateTime.now().plusDays(4).withNano(0);
        Booking booking = manager.createBooking(user, "R1", start, start.plusHours(1),
                new StudentPricing(), amount -> true);

        assertFalse(manager.removeRoom("R1"));
        assertTrue(manager.modifyBooking("student1", start.plusHours(1), start.plusHours(2)));
        assertTrue(manager.extendBooking("student1", 2));
        assertEquals(start.plusHours(4), booking.getEndTime());
        assertTrue(manager.cancelBookingByID(booking.getBookingID()));
        assertFalse(manager.cancelBookingByID(booking.getBookingID()));
        assertTrue(manager.removeRoom("R1"));
    }

    @Test
    public void roomAdministrationRejectsDuplicatesAndUnknownStates() {
        BookingManager manager = new BookingManager();
        assertFalse(manager.addRoom(null));
        assertFalse(manager.addRoom(new Room("r1", 50, "NEW")));
        assertTrue(manager.addRoom(new Room("R3", 50, "NEW")));
        assertTrue(manager.updateRoomState("R3", "maintenance"));
        assertTrue(manager.getRoom("r3").getCurrentState() instanceof MaintenanceState);
        assertFalse(manager.updateRoomState("R3", "closed"));
        assertFalse(manager.updateRoomState("missing", "available"));
    }

    private void writeBookingRow(String id, LocalDateTime start, LocalDateTime end,
            boolean checkedIn, boolean cancelled, boolean forfeited, double deposit) {
        try {
            writeCsv(CsvDatabase.BOOKINGS_FILE,
                    "bookingID,userID,roomID,startTime,endTime,checkedIn,cancelled,depositForfeited,upfrontDeposit,hourlyRate,paymentType",
                    String.join(",", id, "student1", "R1", start.format(CSV_TIME), end.format(CSV_TIME),
                            Boolean.toString(checkedIn), Boolean.toString(cancelled), Boolean.toString(forfeited),
                            String.format(java.util.Locale.US, "%.2f", deposit), "20.00", "credit_card"));
        } catch (Exception exception) {
            throw new AssertionError(exception);
        }
    }
}
