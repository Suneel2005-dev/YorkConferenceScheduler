package scheduler.user;

import java.util.HashMap;
import java.util.Map;

import scheduler.room.Room;
import scheduler.room.RoomState;

public class Administrator {

	private String adminID;
	private String email;
	private Map<String, Room> rooms;

	Administrator(String email, String adminID) {
		if (email == null || email.isBlank()) {
			throw new IllegalArgumentException("Administrator email cannot be empty.");
		}

		if (adminID == null || adminID.isBlank()) {
			throw new IllegalArgumentException("Administrator ID cannot be empty.");
		}

		this.email = email;
		this.adminID = adminID;
		this.rooms = new HashMap<>();
	}

	public void addRoom(String roomID, int capacity, String location) {
		if (rooms.containsKey(roomID)) {
			throw new IllegalArgumentException("Room " + roomID + " already exists.");
		}

		Room room = new Room(roomID, capacity, location);
		rooms.put(roomID, room);
	}

	public void setRoomState(String roomID, RoomState state) {
		if (state == null) {
			throw new IllegalArgumentException("Room state cannot be null.");
		}

		Room room = rooms.get(roomID);

		if (room == null) {
			throw new IllegalArgumentException("Room " + roomID + " does not exist.");
		}

		room.setState(state);
	}

	public Room getRoom(String roomID) {
		return rooms.get(roomID);
	}

	public Map<String, Room> getRooms() {
		return rooms;
	}
}