package scheduler.booking;

import java.time.*;

import scheduler.payment.PaymentStrategy;
import scheduler.pricing.PricingStrategy;
import scheduler.user.User;
import scheduler.room.Room;

public class Booking {
    
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private boolean isCheckedIn;
    private double upfrontDeposit;
    private PricingStrategy pricingStrategy;
    private PaymentStrategy paymentStrategy;

    public Booking() {

    }

    public double calculateUpfrontCost() {
        return 0.0;
    }

    public double calculateFinalCost(int hours) {
        return 0.0;
    }

    public boolean executePayment(double amount) {
        return true;
    }

    public void forfeitDeposit() {
        
    }

}
