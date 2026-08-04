package scheduler.dev;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.UUID;

import org.junit.Test;

import scheduler.aigen.*;
import scheduler.booking.*;
import scheduler.payment.*;
import scheduler.pricing.*;
import scheduler.room.*;
import scheduler.user.*;

public class Req10PaymentMethodsTest extends TestFileSupport {

    @Test
    public void creditCardPayment_positiveAmount() {
        PaymentStrategy strategy = new CreditCardPayment();
        assertTrue(strategy.processTransaction(25.00));
    }

    @Test
    public void creditCardPayment_zeroAmount() {
        PaymentStrategy strategy = new CreditCardPayment();
        assertTrue(strategy.processTransaction(0.0));
    }

    @Test
    public void debitCardPayment_positiveAmount() {
        PaymentStrategy strategy = new DebitCardPayment();
        assertTrue(strategy.processTransaction(30.00));
    }

    @Test
    public void institutionBilling_positiveAmount() {
        PaymentStrategy strategy = new InstitutionBilling();
        assertTrue(strategy.processTransaction(40.00));
    }

    @Test
    public void allPaymentStrategies_areInterchangeable() {
        PaymentStrategy[] strategies = { new CreditCardPayment(), new DebitCardPayment(), new InstitutionBilling() };

        for (PaymentStrategy strategy : strategies) { assertTrue(strategy.getClass().getSimpleName(), strategy.processTransaction(50.00)); }
    }

    @Test
    public void booking_executePayment_creditCard() {
        Booking booking = newBooking(new CreditCardPayment());
        assertTrue(booking.executePayment(20.0));
    }

    @Test
    public void booking_executePayment_debitCard() {
        Booking booking = newBooking(new DebitCardPayment());
        assertTrue(booking.executePayment(20.0));
    }

    @Test
    public void booking_executePayment_institutionBilling() {
        Booking booking = newBooking(new InstitutionBilling());
        assertTrue(booking.executePayment(20.0));
    }

    @Test
    public void booking_executePayment_negativeAmount() {
        Booking booking = newBooking(new CreditCardPayment());
        assertFalse(booking.executePayment(-5.0));
    }

    @Test
    public void booking_executePayment_nullPaymentStrategy() {
        Booking booking = newBooking(null);
        assertFalse(booking.executePayment(20.0));
    }

    @Test
    public void booking_setPaymentStrategy() {
        Booking booking = newBooking(new CreditCardPayment());
        booking.setPaymentStrategy(new InstitutionBilling());

        assertTrue(booking.executePayment(20.0));
        assertTrue(booking.getPaymentStrategy() instanceof InstitutionBilling);
    }

    @Test
    public void facadeProcessBooking_creditCard() {
        assertPaymentMethodAccepted("Credit Card");
    }

    @Test
    public void facadeProcessBooking_debitCard() {
        assertPaymentMethodAccepted("Debit Card");
    }

    @Test
    public void facadeProcessBooking_institutionBilling() {
        assertPaymentMethodAccepted("Institution Billing");
    }

    @Test
    public void facadeProcessBooking_unknownPaymentMethod() {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();
        String roomID = uniqueId("R");
        facade.addRoom(new Room(roomID, 10, "Test Building"));

        String userID = uniqueId("S");
        registerVerifiedStudent(userID, "unknownpay@yorku.ca");

        boolean result = facade.processBooking(
                userID, roomID, LocalDateTime.now().plusMinutes(90), 1, "Bitcoin");

        assertFalse(result);
    }

    //helper functions

    private String uniqueId(String prefix) {
        return prefix + "-" + UUID.randomUUID().toString().substring(0, 8);
    }
    
    private void assertPaymentMethodAccepted(String paymentMethod) {
        BookingSystemFacade facade = BookingSystemFacade.getInstance();
        String roomID = uniqueId("R");
        facade.addRoom(new Room(roomID, 10, "Test Building"));

        String userID = uniqueId("S");
        registerVerifiedStudent(userID, uniqueId("pay10") + "@yorku.ca");

        boolean result = facade.processBooking(
                userID, roomID, LocalDateTime.now().plusMinutes(90), 1, paymentMethod);

        assertTrue("booking with payment method '" + paymentMethod + "' should succeed", result);
    }

    private Booking newBooking(PaymentStrategy paymentStrategy) {
        User user = new Student(uniqueId("S"), "S@yorku.ca", "Passw0rd!", "111", true);
        Room room = new Room(uniqueId("R"), 10, "Test Building");
        LocalDateTime start = LocalDateTime.now().plusHours(1);
        LocalDateTime end = start.plusHours(1);
        return new Booking(user, room, start, end, new StudentPricing(), paymentStrategy);
    }

    private void registerVerifiedStudent(String userID, String email) {
        UserFactory userFactory = new UserFactory();
        java.util.Map<String, Object> details = new java.util.HashMap<>();
        details.put("userID", userID);
        details.put("email", email);
        details.put("password", "Passw0rd!");
        details.put("orgID", "999");
        userFactory.createUser("student", details);
    }
}
