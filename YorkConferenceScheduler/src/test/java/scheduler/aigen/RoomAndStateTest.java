package scheduler.aigen;

import static org.junit.Assert.*;
import org.junit.Test;
import scheduler.room.*;

public class RoomAndStateTest {
    @Test public void roomConstructionAndLocationWork() {
        Room simple = new Room("A", 5, "ACE");
        assertEquals("A", simple.getRoomID()); assertEquals(5, simple.getCapacity());
        assertEquals("ACE", simple.getBuilding()); assertEquals("", simple.getRoomNumber()); assertEquals("ACE", simple.getLocation());
        assertFalse(simple.isOccupied()); assertFalse(simple.isMaintenance()); assertEquals("enabled", simple.getStatus());
        assertTrue(simple.toString().contains("A"));
        Room full = new Room("B", 20, "LAS", "101", true, false, null);
        assertEquals("LAS 101", full.getLocation()); assertTrue(full.isOccupied()); assertEquals("enabled", full.getStatus());
    }

    @Test public void constructorRejectsInvalidValues() {
        assertThrows(IllegalArgumentException.class, () -> new Room(null, 1, "X"));
        assertThrows(IllegalArgumentException.class, () -> new Room("", 1, "X"));
        assertThrows(IllegalArgumentException.class, () -> new Room("A", 0, "X"));
        assertThrows(IllegalArgumentException.class, () -> new Room("A", 1, ""));
    }

    @Test public void stateTransitionsWork() {
        Room room = new Room("R", 5, "ACE");
        assertTrue(room.getCurrentState() instanceof AvailableState);
        room.reserve(); assertTrue(room.isOccupied());
        room.reserve(); assertTrue(room.isOccupied());
        room.release(); assertFalse(room.isOccupied());
        room.release(); assertTrue(room.getCurrentState() instanceof AvailableState);
        room.setState(new MaintenanceState()); assertTrue(room.isMaintenance());
        room.reserve(); room.release(); assertTrue(room.isMaintenance());
        assertThrows(IllegalArgumentException.class, () -> room.setState(null));
    }

    @Test public void statesRejectNullRooms() {
        RoomState[] states = {new AvailableState(), new OccupiedState(), new MaintenanceState()};
        for (RoomState state : states) {
            assertThrows(IllegalArgumentException.class, () -> state.handleReserve(null));
            assertThrows(IllegalArgumentException.class, () -> state.handleRelease(null));
        }
    }

    @Test public void disabledRoomStartsInMaintenance() {
        Room room = new Room("D", 5, "ACE", null, false, false, "disabled");
        assertTrue(room.isMaintenance()); assertEquals("disabled", room.getStatus()); assertEquals("ACE", room.getLocation());
    }
}
