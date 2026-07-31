package scheduler.aigen;

import static org.junit.Assert.*;

import org.junit.Test;

import scheduler.room.*;

public class RoomAndStateTest {
    @Test
    public void roomConstructionProvidesUsefulDefaultsAndLocation() {
        Room room = new Room("A", 5, "ACE");
        assertEquals("A", room.getRoomID());
        assertEquals(5, room.getCapacity());
        assertEquals("ACE", room.getLocation());
        assertFalse(room.isOccupied());
        assertFalse(room.isMaintenance());
        assertEquals("enabled", room.getStatus());
        assertTrue(room.toString().contains("AvailableState"));
    }

    @Test
    public void constructorSelectsStateFromPersistedFlags() {
        assertTrue(new Room("O", 10, "LAS", "101", true, false, "enabled")
                .getCurrentState() instanceof OccupiedState);
        assertTrue(new Room("M", 10, "LAS", "102", false, true, "enabled")
                .getCurrentState() instanceof MaintenanceState);
        assertTrue(new Room("D", 10, "LAS", "103", false, false, "disabled")
                .getCurrentState() instanceof MaintenanceState);
    }

    @Test
    public void constructorRejectsInvalidIdentityCapacityAndLocation() {
        assertThrows(IllegalArgumentException.class, () -> new Room(null, 1, "X"));
        assertThrows(IllegalArgumentException.class, () -> new Room("", 1, "X"));
        assertThrows(IllegalArgumentException.class, () -> new Room("A", 0, "X"));
        assertThrows(IllegalArgumentException.class, () -> new Room("A", 1, ""));
    }

    @Test
    public void reserveAndReleaseFollowStatePatternRules() {
        Room room = new Room("R", 5, "ACE");
        room.reserve();
        assertTrue(room.isOccupied());
        room.reserve();
        assertTrue(room.isOccupied());
        room.release();
        assertFalse(room.isOccupied());

        room.setState(new MaintenanceState());
        room.reserve();
        room.release();
        assertTrue(room.isMaintenance());
    }

    @Test
    public void setStateRejectsNullAndSynchronizesMaintenanceFlag() {
        Room room = new Room("R", 5, "ACE");
        assertThrows(IllegalArgumentException.class, () -> room.setState(null));
        room.setState(new MaintenanceState());
        assertTrue(room.isMaintenance());
        room.setState(new AvailableState());
        assertFalse(room.isMaintenance());
    }

    @Test
    public void stateObjectsRejectNullRoomTargets() {
        for (RoomState state : new RoomState[] {new AvailableState(), new OccupiedState(), new MaintenanceState()}) {
            assertThrows(IllegalArgumentException.class, () -> state.handleReserve(null));
            assertThrows(IllegalArgumentException.class, () -> state.handleRelease(null));
        }
    }
}
