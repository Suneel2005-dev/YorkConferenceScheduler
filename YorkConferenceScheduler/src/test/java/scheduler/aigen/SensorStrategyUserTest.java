package scheduler.aigen;

import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import scheduler.payment.*;
import scheduler.pricing.*;
import scheduler.sensor.*;
import scheduler.user.*;

public class SensorStrategyUserTest {
    @Test public void sensorNotifiesAndDetachesObservers() {
        HardwareSensor sensor = new HardwareSensor("S1", "R1");
        List<String> events = new ArrayList<>(); SensorObserver observer = events::add;
        sensor.attach(null); sensor.attach(observer); sensor.attach(observer);
        sensor.detectOccupancy(); sensor.detectOccupancy(false); sensor.badgeScan("B7"); sensor.badgeScan(" ");
        assertEquals(Arrays.asList("OCCUPIED:R1", "EMPTY:R1", "BADGE_SCAN:R1:B7", "INVALID_BADGE:R1"), events);
        assertEquals("S1", sensor.getSensorID()); assertEquals("R1", sensor.getRoomID());
        sensor.detach(observer); sensor.notifyObservers("ignored"); assertEquals(4, events.size());
    }

    @Test public void defaultSensorWithoutRoomDoesNotEmitOccupancy() {
        HardwareSensor sensor = new HardwareSensor(); List<String> events = new ArrayList<>(); sensor.attach(events::add);
        sensor.detectOccupancy(true); assertTrue(events.isEmpty()); sensor.badgeScan(null); assertEquals(1, events.size());
    }

    @Test public void pricingAndPaymentsReturnExpectedResults() {
        assertEquals(20, new StudentPricing().getHourlyRate(), 0.001);
        assertEquals(30, new FacultyPricing().getHourlyRate(), 0.001);
        assertEquals(40, new StaffPricing().getHourlyRate(), 0.001);
        assertEquals(50, new PartnerPricing().getHourlyRate(), 0.001);
        assertTrue(new CreditCardPayment().processTransaction(10));
        assertTrue(new DebitCardPayment().processTransaction(10));
        assertTrue(new InstitutionBilling().processTransaction(10));
    }

    @Test public void userAccessorsPasswordAndTypeWork() {
        Student user = new Student("u", "e@yorku.ca", "Secret1!", "o", false);
        assertEquals("u", user.getUserID()); assertEquals("e@yorku.ca", user.getEmail());
        assertEquals("Secret1!", user.getPassword()); assertEquals("o", user.getOrgID()); assertFalse(user.isVerified());
        assertTrue(user.checkPassword("Secret1!")); assertFalse(user.checkPassword("bad")); assertEquals("Student", user.getAccountType());
        user.setVerified(true); assertTrue(user.isVerified());
        assertFalse(new Student().checkPassword(null));
        assertEquals("Faculty", new Faculty().getAccountType()); assertEquals("Staff", new Staff().getAccountType()); assertEquals("Partner", new Partner().getAccountType());
    }
}
