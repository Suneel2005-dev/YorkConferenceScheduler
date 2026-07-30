package scheduler.dev;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.*;
import static org.junit.Assert.*;

import scheduler.booking.BookingManager;
import scheduler.room.*;

public class Req06RoomAdministrationTest {

    private static final String ACCOUNTS_HEADER = "userID,email,password,orgID,accountType,verified\n";
    private static final String ROOMS_HEADER = "roomID,capacity,building,room,occupied,maintenance,status\n";
    private static final String BOOKINGS_HEADER = "bookingID,userID,roomID,startTime,endTime,checkedIn,cancelled," + "depositForfeited,upfrontDeposit,hourlyRate,paymentType\n";

    private final Path accountsPath = Path.of("accounts.csv");
    private final Path roomsPath = Path.of("rooms.csv");
    private final Path bookingsPath = Path.of("bookings.csv");

    private byte[] originalAccountsData;
    private byte[] originalRoomsData;
    private byte[] originalBookingsData;

    private BookingManager manager;

    @Before
    public void setUp() throws IOException {

        backupAndResetTestFiles();
        manager = new BookingManager();

    }

    @After
    public void tearDown() throws IOException {

        restoreTestFiles();

    }

    @Test
    public void addRoom_validRoom_addsRoomToSystem() {

        Room room = new Room("R1", 25, "Vari Hall");

        boolean result = manager.addRoom(room);

        assertTrue(result);
        assertNotNull(manager.getRoom("R1"));
        assertEquals("R1", manager.getRoom("R1").getRoomID());

    }

    @Test
    public void updateRoomState_availableRoom_canBePlacedUnderMaintenance() {

        Room room = new Room("R2", 25, "Vari Hall");

        manager.addRoom(room);

        boolean result = manager.updateRoomState("R2", "maintenance");

        assertTrue(result);
        assertTrue(manager.getRoom("R2").isMaintenance());
        assertTrue(manager.getRoom("R2").getCurrentState() instanceof MaintenanceState);

    }

    @Test
    public void updateRoomState_maintenanceRoom_canBeReenabled() {

        Room room = new Room("R3", 30, "Ross Building");

        manager.addRoom(room);
        manager.updateRoomState("R3", "maintenance");

        boolean result = manager.updateRoomState("R3", "available");

        assertTrue(result);
        assertFalse(manager.getRoom("R3").isMaintenance());
        assertTrue(manager.getRoom("R3").getCurrentState() instanceof AvailableState);

    }

    @Test
    public void updateRoomState_roomCanCompleteMaintenanceCycle() {

        Room room = new Room("R4", 40, "Accolade East");

        manager.addRoom(room);

        assertTrue(manager.updateRoomState("R4", "maintenance"));

        Room maintenanceRoom = manager.getRoom("R4");

        assertTrue(maintenanceRoom.isMaintenance());
        assertTrue(manager.updateRoomState("R4", "available"));

        Room reopenedRoom = manager.getRoom("R4");

        assertFalse(reopenedRoom.isMaintenance());
        assertTrue(reopenedRoom.getCurrentState() instanceof AvailableState);

    }

    @Test
    public void constructor_disabledStatus_createsUnavailableRoom() {

        Room room = new Room("R5", 10, "Ross Building", "101", false, false, "disabled");

        assertTrue(room.isMaintenance());
        assertEquals("disabled", room.getStatus());

    }

    @Test
    public void constructor_availableStatus_createsAvailableRoom() {

        Room room = new Room("R6", 50, "Vari Hall", "200", false, false, "available");

        assertFalse(room.isMaintenance());
        assertTrue(room.getCurrentState() instanceof AvailableState);
        assertEquals("available", room.getStatus());

    }

    @Test
    public void addRoom_duplicateRoomId_rejectsSecondRoom() {

        Room firstRoom = new Room("R7", 20, "Vari Hall");

        Room duplicateRoom = new Room("R7", 40, "Ross Building");

        boolean firstResult = manager.addRoom(firstRoom);
        boolean duplicateResult = manager.addRoom(duplicateRoom);

        assertTrue(firstResult);
        assertFalse(duplicateResult);
        assertEquals(20, manager.getRoom("R7").getCapacity());

    }

    @Test
    public void updateRoomState_unknownRoom_returnsFalse() {

        boolean result = manager.updateRoomState(
            "ROOM-DOES-NOT-EXIST",
            "maintenance"
        );

        assertFalse(result);

    }

    private void backupAndResetTestFiles() throws IOException {

        originalAccountsData = readFile(accountsPath);
        originalRoomsData = readFile(roomsPath);
        originalBookingsData = readFile(bookingsPath);

        Files.writeString(accountsPath, ACCOUNTS_HEADER);
        Files.writeString(roomsPath, ROOMS_HEADER);
        Files.writeString(bookingsPath,BOOKINGS_HEADER);

    }

    private void restoreTestFiles() throws IOException {

        restoreFile(accountsPath, originalAccountsData);
        restoreFile(roomsPath, originalRoomsData);
        restoreFile(bookingsPath, originalBookingsData);

    }

    private byte[] readFile(Path path) throws IOException {

        if (!Files.exists(path)) {
            return null;
        }

        return Files.readAllBytes(path);

    }

    private void restoreFile(Path path, byte[] originalData) throws IOException {

        if (originalData == null) {
            Files.deleteIfExists(path);
            return;
        }

        Files.write(path, originalData);

    }

}