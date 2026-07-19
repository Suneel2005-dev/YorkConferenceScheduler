package scheduler.sensor;

import java.util.ArrayList;
import java.util.List;

public class HardwareSensor {

	private String sensorID;
	private String roomID;

	private List<SensorObserver> observers = new ArrayList<>();

	public HardwareSensor() {

	}

	public void attach(SensorObserver observer) {
		if (observer != null && !observers.contains(observer)) {
			observers.add(observer);
		}
	}

	public void detach(SensorObserver observer) {
		observers.remove(observer);
	}

	public void notifyObservers(String data) {
		for (SensorObserver observer : observers) {
			observer.update(data);
		}
	}

	public void detectOccupancy() {
		notifyObservers("OCCUPIED:" + roomID);
	}

	public void badgeScan(String badgeID) {
		if (badgeID == null || badgeID.isBlank()) {
			notifyObservers("INVALID_BADGE:" + roomID);
			return;
		}

		notifyObservers("BADGE_SCAN:" + roomID + ":" + badgeID);
	}
}