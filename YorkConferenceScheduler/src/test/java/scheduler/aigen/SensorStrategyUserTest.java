package scheduler.aigen;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import scheduler.payment.*;
import scheduler.pricing.*;
import scheduler.sensor.*;
import scheduler.user.*;

public class SensorStrategyUserTest {
    @Test
    public void sensorPublishesDomainEventsAndPreventsDuplicateObservers() {
        HardwareSensor sensor = new HardwareSensor("S1", "R1");
        List<String> events = new ArrayList<>();
        SensorObserver observer = events::add;

        sensor.attach(null);
        sensor.attach(observer);
        sensor.attach(observer);
        sensor.detectOccupancy();
        sensor.detectOccupancy(false);
        sensor.badgeScan("B7");
        sensor.badgeScan(" ");

        assertEquals(Arrays.asList(
                "OCCUPIED:R1", "EMPTY:R1", "BADGE_SCAN:R1:B7", "INVALID_BADGE:R1"), events);

        sensor.detach(observer);
        sensor.notifyObservers("ignored");
        assertEquals(4, events.size());
    }

    @Test
    public void sensorWithoutRoomSuppressesOccupancyButStillReportsInvalidBadge() {
        HardwareSensor sensor = new HardwareSensor();
        List<String> events = new ArrayList<>();
        sensor.attach(events::add);

        sensor.detectOccupancy(true);
        assertTrue(events.isEmpty());
        sensor.badgeScan(null);
        assertEquals(Arrays.asList("INVALID_BADGE:null"), events);
    }

    @Test
    public void pricingStrategiesMatchSpecifiedAccountRates() {
        assertEquals(20, new StudentPricing().getHourlyRate(), 0.001);
        assertEquals(30, new FacultyPricing().getHourlyRate(), 0.001);
        assertEquals(40, new StaffPricing().getHourlyRate(), 0.001);
        assertEquals(50, new PartnerPricing().getHourlyRate(), 0.001);
    }

    @Test
    public void paymentStrategiesAcceptTransactions() {
        assertTrue(new CreditCardPayment().processTransaction(10));
        assertTrue(new DebitCardPayment().processTransaction(10));
        assertTrue(new InstitutionBilling().processTransaction(10));
    }

    @Test
    public void userAccessorsPasswordVerificationAndRuntimeTypeWork() {
        Student user = new Student("u", "e@yorku.ca", "Secret1!", "o", false);
        assertEquals("u", user.getUserID());
        assertEquals("e@yorku.ca", user.getEmail());
        assertTrue(user.checkPassword("Secret1!"));
        assertFalse(user.checkPassword("bad"));
        assertEquals("Student", user.getAccountType());
        user.setVerified(true);
        assertTrue(user.isVerified());
        assertEquals("Faculty", new Faculty().getAccountType());
        assertEquals("Staff", new Staff().getAccountType());
        assertEquals("Partner", new Partner().getAccountType());
    }
}
