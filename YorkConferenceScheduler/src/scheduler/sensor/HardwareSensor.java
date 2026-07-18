package sensor;

import java.util.ArrayList;
import java.util.List;
import sensor.SensorObserver;

public class HardwareSensor {

    private String sensorID;
    private String roomID;

    private List<SensorObserver> observers = new ArrayList<>();

    public HardwareSensor() {

    }

    public void attach(SensorObserver observer) {

    }

    public void detach(SensorObserver observer) {

    }

    public void notifyObservers(String data) {

    }

    public void detectOccupancy() {

    }

    public void badgeScan(String badgeID) {

    }

}