package scheduler.dev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;
import static org.junit.Assert.*;

import scheduler.sensor.HardwareSensor;

public class Req05SensorTest {

    @Test
    public void detectOccupancy_sendsOccupancyDataToObserver() {

        HardwareSensor sensor = new HardwareSensor("SEN-1", "R-1");
        List<String> receivedData = new ArrayList<>();

        sensor.attach(receivedData::add);
        sensor.detectOccupancy(true);
        sensor.detectOccupancy(false);

        assertEquals(Arrays.asList("OCCUPIED:R-1", "EMPTY:R-1"), receivedData);

    }

    @Test
    public void badgeScan_validBadge_sendsRoomAndBadgeData() {

        HardwareSensor sensor = new HardwareSensor("SEN-2", "R-2");
        List<String> receivedData = new ArrayList<>();

        sensor.attach(receivedData::add);
        sensor.badgeScan("STUDENT-123");

        assertEquals(1, receivedData.size());
        assertEquals("BADGE_SCAN:R-2:STUDENT-123", receivedData.get(0));

    }

    @Test
    public void badgeScan_blankBadge_reportsInvalidBadge() {

        HardwareSensor sensor = new HardwareSensor("SEN-3", "R-3");
        List<String> receivedData = new ArrayList<>();

        sensor.attach(receivedData::add);
        sensor.badgeScan(" ");

        assertEquals(1, receivedData.size());
        assertEquals("INVALID_BADGE:R-3", receivedData.get(0));

    }

    @Test
    public void detectOccupancy_multipleObservers_notifiesEveryObserver() {

        HardwareSensor sensor = new HardwareSensor("SEN-4", "R-4");

        List<String> firstObserverData = new ArrayList<>();
        List<String> secondObserverData = new ArrayList<>();

        sensor.attach(firstObserverData::add);
        sensor.attach(secondObserverData::add);
        sensor.detectOccupancy(true);

        assertEquals(Arrays.asList("OCCUPIED:R-4"), firstObserverData);
        assertEquals(Arrays.asList("OCCUPIED:R-4"), secondObserverData);

    }

    @Test
    public void badgeScan_staffBadge_sendsExactBadgeIdentification() {

        HardwareSensor sensor = new HardwareSensor("SEN-5", "R-5");
        List<String> receivedData = new ArrayList<>();

        sensor.attach(receivedData::add);
        sensor.badgeScan("STAFF-98765");

        assertEquals("BADGE_SCAN:R-5:STAFF-98765", receivedData.get(0));

    }

}