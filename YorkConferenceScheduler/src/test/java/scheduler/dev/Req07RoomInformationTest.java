package scheduler.dev;

import org.junit.*;
import static org.junit.Assert.*;

import scheduler.room.*;

public class Req07RoomInformationTest {
	
	@Test
	void testRoomID() {
		Room room = new Room("R101", 30, "Lassonde", "1001", false, false, "enabled");
		assertEquals("R101", room.getRoomID());
	}
	
	@Test
	void testCapacity() {
		Room room = new Room("R101", 30, "Lassonde", "1001", false, false, "enabled");
		assertEquals(30, room.getCapacity());
	}
	
	@Test
	void testRoomBuilding() {
		Room room = new Room("R101", 30, "Lassonde", "1001", false, false, "enabled");
		assertEquals("Lassonde", room.getBuilding());
	}
	
	@Test
	void testRoomNumber() {
		Room room = new Room("R101", 30, "Lassonde", "1001", false, false, "enabled");
		assertEquals("1001", room.getRoomNumber());
	}
	
	@Test
	void testRoomLocation() {
		Room room = new Room("R101", 30, "Lassonde", "1001", false, false, "enabled");
		assertEquals("Lassonde 1001", room.getLocation());
	}
	
}
