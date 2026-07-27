package scheduler.room;

public class Room {

    private String roomID;
    private int capacity;
    private String building;
    private String roomNumber;
    private boolean maintenance;
    private String status;
    private RoomState currentState;

    public Room(String roomID, int capacity, String location) {
        this(
                roomID,
                capacity,
                location,
                "",
                false,
                false,
                "enabled");
    }

    public Room(
            String roomID,
            int capacity,
            String building,
            String roomNumber,
            boolean occupied,
            boolean maintenance,
            String status) {

        if (roomID == null || roomID.isBlank()) {
            throw new IllegalArgumentException(
                    "Room ID cannot be empty.");
        }

        if (capacity <= 0) {
            throw new IllegalArgumentException(
                    "Room capacity must be greater than zero.");
        }

        if (building == null || building.isBlank()) {
            throw new IllegalArgumentException(
                    "Room location cannot be empty.");
        }

        this.roomID = roomID;
        this.capacity = capacity;
        this.building = building;
        this.roomNumber = roomNumber == null ? "" : roomNumber;
        this.maintenance = maintenance;
        this.status = status == null ? "enabled" : status;

        if (maintenance
                || "disabled".equalsIgnoreCase(this.status)) {
            currentState = new MaintenanceState();
        } else if (occupied) {
            currentState = new OccupiedState();
        } else {
            currentState = new AvailableState();
        }
    }

    public String getRoomID() {
        return roomID;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getBuilding() {
        return building;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public String getLocation() {
        if (roomNumber.isBlank()) {
            return building;
        }

        return building + " " + roomNumber;
    }

    public boolean isOccupied() {
        return currentState instanceof OccupiedState;
    }

    public boolean isMaintenance() {
        return maintenance
                || currentState instanceof MaintenanceState;
    }

    public String getStatus() {
        return status;
    }

    public RoomState getCurrentState() {
        return currentState;
    }

    public void setState(RoomState state) {
        if (state == null) {
            throw new IllegalArgumentException(
                    "Room state cannot be null.");
        }

        currentState = state;
        maintenance = state instanceof MaintenanceState;
    }

    public void reserve() {
        currentState.handleReserve(this);
    }

    public void release() {
        currentState.handleRelease(this);
    }

    @Override
    public String toString() {
        return "Room{"
                + "roomID='" + roomID + '\''
                + ", capacity=" + capacity
                + ", location='" + getLocation() + '\''
                + ", currentState="
                + currentState.getClass().getSimpleName()
                + '}';
    }
}