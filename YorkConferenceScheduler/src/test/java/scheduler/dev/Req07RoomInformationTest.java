package scheduler.dev;

import org.junit.*;
import static org.junit.Assert.*;

import scheduler.room.*;

public class Req07RoomInformationTest {
	
	@Test
	public void testRoomID() {
		Room room = new Room("R101", 30, "Lassonde", "1001", false, false, "enabled");
		assertEquals("R101", room.getRoomID());
	}
	
	@Test
	public void testCapacity() {
		Room room = new Room("R101", 30, "Lassonde", "1001", false, false, "enabled");
		assertEquals(30, room.getCapacity());
	}
	
	@Test
	public void testRoomBuilding() {
		Room room = new Room("R101", 30, "Lassonde", "1001", false, false, "enabled");
		assertEquals("Lassonde", room.getBuilding());
	}
	
	@Test
	public void testRoomNumber() {
		Room room = new Room("R101", 30, "Lassonde", "1001", false, false, "enabled");
		assertEquals("1001", room.getRoomNumber());
	}
	
	@Test
	public void testRoomLocation() {
		Room room = new Room("R101", 30, "Lassonde", "1001", false, false, "enabled");
		assertEquals("Lassonde 1001", room.getLocation());
	}

	@Test
	public void testInvalidRoomID() {
		assertThrows(IllegalArgumentException.class, () -> new Room(null, 30, "Lassonde"));
		assertThrows(IllegalArgumentException.class, () -> new Room(" ", 30, "Lassonde"));
		assertThrows(IllegalArgumentException.class, () -> new Room("", 30, "Lassonde"));
	}
	
	@Test
	public void testInvalidCapacity() {
		assertThrows(IllegalArgumentException.class, () -> new Room("R101", 0, "Lassonde"));
		assertThrows(IllegalArgumentException.class, () -> new Room("R101", -5, "Lassonde"));
	}
	
	@Test
	public void testInvalidBuilding() {
		assertThrows(IllegalArgumentException.class, () -> new Room("R101", 30, null));
		assertThrows(IllegalArgumentException.class, () -> new Room("R101", 30, "Lassonde"));
	}

	@Test
	public void testNullRoomNumberAndDefaultStatus() {
		Room room = new Room("R101", 30, "Lassonde", null, false, false, null);
		assertEquals("", room.getRoomNumber());
		assertEquals("enabled", room.getStatus());
	}
}
