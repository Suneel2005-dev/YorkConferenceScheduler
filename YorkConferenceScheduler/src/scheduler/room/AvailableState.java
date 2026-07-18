package room;

public class AvailableState implements RoomState {

	@Override
	public void handleReserve(Room room) {
		if (room == null) {
			throw new IllegalArgumentException("Room cannot be null.");
		}

		System.out.println("Room " + room.getRoomID() + " has been reserved.");

		room.setState(new OccupiedState());
	}

	@Override
	public void handleRelease(Room room) {
		if (room == null) {
			throw new IllegalArgumentException("Room cannot be null.");
		}

		System.out.println("Room " + room.getRoomID() + " is already available.");
	}
}
