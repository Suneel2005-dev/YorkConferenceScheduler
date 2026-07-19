package scheduler.booking;

import java.util.ArrayList;
import java.util.List;

import scheduler.sensor.SensorObserver;

public class BookingManager implements SensorObserver {

	private List<Booking> activeBookings;

	public BookingManager() {
		activeBookings = new ArrayList<>();
	}

	@Override
	public void update(String sensorData) {
		// Empty for now
	}

	public void checkTimeouts() {
		// Empty for now
	}
}
