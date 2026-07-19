package scheduler.room;

public class OccupiedState implements RoomState {

	@Override
	public void handleReserve(Room room) {
		if (room == null) {
			throw new IllegalArgumentException("Room cannot be null.");
		}

		System.out.println("Room " + room.getRoomID() + " cannot be reserved because it is occupied.");
	}

	@Override
	public void handleRelease(Room room) {
		if (room == null) {
			throw new IllegalArgumentException("Room cannot be null.");
		}

		System.out.println("Room " + room.getRoomID() + " has been released.");

		room.setState(new AvailableState());
	}
}