package scheduler.user;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

import scheduler.room.Room;
import scheduler.room.RoomState;

public class Administrator extends User {

	private String adminID;
	private String email;
	private Map<String, Room> rooms;

    private static final Path ACCOUNTS_FILE = Path.of("accounts.csv");

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

    public static Administrator authenticate(String email, String password) {
        if (email == null || email.isBlank() || password == null || password.isBlank()) {
            return null;
        }

        if (!Files.exists(ACCOUNTS_FILE)) {
            throw new IllegalStateException("The accounts.csv file could not be found.");
        }

        try {
            List<String> lines = Files.readAllLines(ACCOUNTS_FILE);
            // Start at 1 to skip the CSV header.
            for (int i = 1; i < lines.size(); i++) {
                String line = lines.get(i).trim();

                if (line.isEmpty()) {
                    continue;
                }

                String[] account = line.split(",", -1);

                if (account.length < 6) {
                    continue;
                }

                String adminID = account[0].trim();
                String storedEmail = account[1].trim();
                String storedPassword = account[2];
                String accountType = account[4].trim();
                boolean verified = Boolean.parseBoolean(account[5].trim());

                boolean isAdministrator = accountType.equalsIgnoreCase("administrator");

                boolean emailMatches = storedEmail.equalsIgnoreCase(email);

                boolean passwordMatches = storedPassword.equals(password);

                if (isAdministrator && emailMatches && passwordMatches && verified) {
                    return new Administrator(storedEmail,adminID);
                }
            }

            return null;

        } catch (IOException exception) {
            throw new IllegalStateException(
                    "Could not read administrator accounts.",
                    exception);
        }
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

    public String getAdminID() {
        return adminID;
    }

    public String getEmail() {
        return email;
    }
}