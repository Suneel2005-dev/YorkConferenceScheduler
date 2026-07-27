package scheduler.room;

public interface RoomState {

	void handleReserve(Room room);

	void handleRelease(Room room);
}
