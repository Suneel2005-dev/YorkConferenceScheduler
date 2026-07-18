package room;

public class MaintenanceState implements RoomState {

	@Override
	public void handleReserve(Room room) {
		if (room == null) {
			throw new IllegalArgumentException("Room cannot be null.");
		}

		System.out.println("Room " + room.getRoomID() + " cannot be reserved because it is under maintenance.");
	}

	@Override
	public void handleRelease(Room room) {
		if (room == null) {
			throw new IllegalArgumentException("Room cannot be null.");
		}

		System.out.println("Room " + room.getRoomID() + " cannot be released because it is under maintenance.");
	}
}