package scheduler.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import static org.junit.Assert.*;

import scheduler.sensor.*;

public class Req05SensorTest {

    @Test
    public void occupancyDataSentToObservers() {

        HardwareSensor sensor = new HardwareSensor("SEN-1", "R-1");
        List<String> data = new ArrayList<>();

        sensor.attach(data::add);
        sensor.detectOccupancy(true);
        sensor.detectOccupancy(false);

        assertEquals(Arrays.asList("OCCUPIED:R-1", "EMPTY:R-1"), data);

    }

    @Test
    public void badgeScanSendsRoomAndBadgeData() {

        HardwareSensor sensor = new HardwareSensor("SEN-2", "R-2");
        List<String> data = new ArrayList<>();

        sensor.attach(data::add);
        sensor.badgeScan("STUDENT-123");

        assertEquals(1, data.size());
        assertEquals("BADGE_SCAN:R-2:STUDENT-123", data.get(0));

    }

    @Test
    public void blankBadgeReportedInvalid() {

        HardwareSensor sensor = new HardwareSensor("SEN-3", "R-3");
        List<String> data = new ArrayList<>();

        sensor.attach(data::add);
        sensor.badgeScan(" ");

        assertEquals(1, data.size());
        assertEquals("INVALID_BADGE:R-3", data.get(0));

    }

    @Test
    public void detectOccupancyWithoutArgumentReportsOccupiedRoom() {

        HardwareSensor sensor = new HardwareSensor("SEN-4", "R-4");
        List<String> data = new ArrayList<>();

        sensor.attach(data::add);
        sensor.detectOccupancy();

        assertEquals(1, data.size());
        assertEquals("OCCUPIED:R-4", data.get(0));

    }

    @Test
    public void constructorStoresSensorAndRoomID() {

        HardwareSensor sensor = new HardwareSensor("SEN-5", "ROOM-101");

        assertEquals("SEN-5", sensor.getSensorID());
        assertEquals("ROOM-101", sensor.getRoomID());

    }

    @Test
    public void notifyObserversSendsDataToObserver() {

        HardwareSensor sensor = new HardwareSensor("SEN-6", "R-6");
        List<String> data = new ArrayList<>();

        sensor.attach(data::add);
        sensor.notifyObservers("TEST_SENSOR_DATA");


        assertEquals(1, data.size());
        assertEquals("TEST_SENSOR_DATA", data.get(0));

    }

    @Test
    public void detachedObserverDoesNotReceiveSensorData() {

        HardwareSensor sensor = new HardwareSensor("SEN-7", "R-7");
        List<String> data = new ArrayList<>();
        SensorObserver observer = data::add;

        sensor.attach(observer);
        sensor.detach(observer);
        sensor.detectOccupancy(true);
        sensor.badgeScan("STUDENT-456");

        assertTrue(data.isEmpty());

    }

    @Test
    public void defaultConstructorCreatesSensorWithNullIDs() {

        HardwareSensor sensor = new HardwareSensor();

        assertEquals(null, sensor.getSensorID());
        assertEquals(null, sensor.getRoomID());

    }

    @Test
    public void occupancyWithNullRoomIDDoesNotNotifyObserver() {

        HardwareSensor sensor = new HardwareSensor();
        List<String> data = new ArrayList<>();

        sensor.attach(data::add);
        sensor.detectOccupancy(true);

        assertTrue(data.isEmpty());

    }

    @Test
    public void occupancyWithBlankRoomIDDoesNotNotifyObserver() {

        HardwareSensor sensor = new HardwareSensor("SEN-8", " ");
        List<String> data = new ArrayList<>();

        sensor.attach(data::add);
        sensor.detectOccupancy(false);

        assertTrue(data.isEmpty());

    }

    @Test
    public void nullBadgeIsReportedAsInvalid() {

        HardwareSensor sensor = new HardwareSensor("SEN-9", "R-9");
        List<String> data = new ArrayList<>();

        sensor.attach(data::add);
        sensor.badgeScan(null);

        assertEquals(1, data.size());
        assertEquals("INVALID_BADGE:R-9", data.get(0));

    }

    @Test
    public void multipleObserversReceiveSensorData() {

        HardwareSensor sensor = new HardwareSensor("SEN-10", "R-10");
        List<String> firstObserverData = new ArrayList<>();
        List<String> secondObserverData = new ArrayList<>();

        sensor.attach(firstObserverData::add);
        sensor.attach(secondObserverData::add);
        sensor.detectOccupancy(true);

        assertEquals(Arrays.asList("OCCUPIED:R-10"), firstObserverData);
        assertEquals(Arrays.asList("OCCUPIED:R-10"), secondObserverData);

    }

    @Test
    public void attachingSameObserverTwiceDoesNotDuplicateNotifications() {

        HardwareSensor sensor = new HardwareSensor("SEN-11", "R-11");
        List<String> data = new ArrayList<>();
        SensorObserver observer = data::add;

        sensor.attach(observer);
        sensor.attach(observer);
        sensor.detectOccupancy(true);

        assertEquals(1, data.size());
        assertEquals("OCCUPIED:R-11", data.get(0));

    }

    @Test
    public void attachingNullObserverDoesNotCauseFailure() {

        HardwareSensor sensor = new HardwareSensor("SEN-12", "R-12");
        List<String> data = new ArrayList<>();

        sensor.attach(null);
        sensor.attach(data::add);
        sensor.detectOccupancy(true);

        assertEquals(1, data.size());
        assertEquals("OCCUPIED:R-12", data.get(0));

    }

}