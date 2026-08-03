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
	
}
