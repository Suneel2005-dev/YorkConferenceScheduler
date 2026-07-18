package scheduler.room;

public class Room {

	private String roomID;
	private int capacity;
	private String location;
	private RoomState currentState;

	public Room(String roomID, int capacity, String location) {
		if (roomID == null || roomID.isBlank()) {
			throw new IllegalArgumentException("Room ID cannot be empty.");
		}

		if (capacity <= 0) {
			throw new IllegalArgumentException("Room capacity must be greater than zero.");
		}

		if (location == null || location.isBlank()) {
			throw new IllegalArgumentException("Room location cannot be empty.");
		}

		this.roomID = roomID;
		this.capacity = capacity;
		this.location = location;
		this.currentState = new AvailableState();
	}

	public String getRoomID() {
		return roomID;
	}

	public int getCapacity() {
		return capacity;
	}

	public String getLocation() {
		return location;
	}

	public RoomState getCurrentState() {
		return currentState;
	}

	public void setState(RoomState state) {
		if (state == null) {
			throw new IllegalArgumentException("Room state cannot be null.");
		}

		this.currentState = state;
	}

	public void reserve() {
		currentState.handleReserve(this);
	}

	public void release() {
		currentState.handleRelease(this);
	}

	@Override
	public String toString() {
		return "Room{" + "roomID='" + roomID + '\'' + ", capacity=" + capacity + ", location='" + location + '\''
				+ ", currentState=" + currentState.getClass().getSimpleName() + '}';
	}
}