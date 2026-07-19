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
		isCheckedIn = false;
		upfrontDeposit = 0.0;
	}

	public double calculateUpfrontCost() {
		if (pricingStrategy == null) {
			return 0.0;
		}

		upfrontDeposit = pricingStrategy.getHourlyRate();
		return upfrontDeposit;
	}

	public double calculateFinalCost(int hours) {
		if (pricingStrategy == null || hours <= 0) {
			return 0.0;
		}

		double totalCost = pricingStrategy.getHourlyRate() * hours;

		if (isCheckedIn) {
			return Math.max(0.0, totalCost - upfrontDeposit);
		}

		return totalCost;
	}

	public boolean executePayment(double amount) {
		if (paymentStrategy == null || amount < 0) {
			return false;
		}

		return paymentStrategy.processTransaction(amount);
	}

	public void forfeitDeposit() {
		upfrontDeposit = 0.0;
	}
}
