package scheduler.booking;

import java.time.Duration;
import java.time.LocalDateTime;

import scheduler.payment.PaymentStrategy;
import scheduler.pricing.PricingStrategy;
import scheduler.room.Room;
import scheduler.user.User;

public class Booking {

    private String bookingID;

	private User user;
	private Room room;

	private LocalDateTime startTime;
	private LocalDateTime endTime;

	private boolean isCheckedIn;
	private boolean isCancelled;
	private boolean depositForfeited;

	private double upfrontDeposit;

	private PricingStrategy pricingStrategy;
	private PaymentStrategy paymentStrategy;

	public Booking() {
		isCheckedIn = false;
		isCancelled = false;
		depositForfeited = false;
		upfrontDeposit = 0.0;
	}

	public Booking(User user, Room room, LocalDateTime startTime, LocalDateTime endTime,
			PricingStrategy pricingStrategy, PaymentStrategy paymentStrategy) {

		if (user == null) {
			throw new IllegalArgumentException("User is required.");
		}

		if (room == null) {
			throw new IllegalArgumentException("Room is required.");
		}

		if (startTime == null || endTime == null) {
			throw new IllegalArgumentException("Start and end times are required.");
		}

		if (!endTime.isAfter(startTime)) {
			throw new IllegalArgumentException("End time must be after start time.");
		}

		if (pricingStrategy == null) {
			throw new IllegalArgumentException("Pricing strategy is required.");
		}

		this.user = user;
		this.room = room;
		this.startTime = startTime;
		this.endTime = endTime;
		this.pricingStrategy = pricingStrategy;
		this.paymentStrategy = paymentStrategy;

		isCheckedIn = false;
		isCancelled = false;
		depositForfeited = false;
		upfrontDeposit = 0.0;
	}

    public Booking(String bookingID, User user, Room room, LocalDateTime startTime,
            LocalDateTime endTime, PricingStrategy pricingStrategy, PaymentStrategy paymentStrategy,
            boolean isCheckedIn, boolean isCancelled, boolean depositForfeited, double upfrontDeposit) {

        this(user, room, startTime, endTime, pricingStrategy, paymentStrategy);

        this.bookingID = bookingID;
        this.isCheckedIn = isCheckedIn;
        this.isCancelled = isCancelled;
        this.depositForfeited = depositForfeited;
        this.upfrontDeposit = upfrontDeposit;
    }

	public double calculateUpfrontCost() {
		if (pricingStrategy == null) {
			return 0.0;
		}

		upfrontDeposit = pricingStrategy.getHourlyRate();
		return upfrontDeposit;
	}

	public double calculateFinalCost() {
		if (pricingStrategy == null) {
			return 0.0;
		}

		long minutes = Duration.between(startTime, endTime).toMinutes();

		if (minutes <= 0) {
			return 0.0;
		}

		double hours = minutes / 60.0;
		double totalCost = pricingStrategy.getHourlyRate() * hours;

		if (isCheckedIn && !depositForfeited) {
			totalCost -= upfrontDeposit;
		}

		return Math.max(0.0, totalCost);
	}

	public double calculateFinalCost(int hours) {
		if (pricingStrategy == null || hours <= 0) {
			return 0.0;
		}

		double totalCost = pricingStrategy.getHourlyRate() * hours;

		if (isCheckedIn && !depositForfeited) {
			totalCost -= upfrontDeposit;
		}

		return Math.max(0.0, totalCost);
	}

	public boolean executePayment(double amount) {
		if (paymentStrategy == null || amount < 0) {
			return false;
		}

		return paymentStrategy.processTransaction(amount);
	}

	public void checkIn() {
		if (isCancelled) {
			throw new IllegalStateException("A cancelled booking cannot be checked in.");
		}

		isCheckedIn = true;
	}

	public void cancel() {
		isCancelled = true;
	}

	public void forfeitDeposit() {
		depositForfeited = true;
		isCheckedIn = false;
	}

	public boolean overlaps(LocalDateTime otherStart, LocalDateTime otherEnd) {

		if (isCancelled || otherStart == null || otherEnd == null) {
			return false;
		}

		return startTime.isBefore(otherEnd) && endTime.isAfter(otherStart);
	}

	public void modifyTimes(LocalDateTime newStart, LocalDateTime newEnd) {

		if (newStart == null || newEnd == null) {
			throw new IllegalArgumentException("Start and end times are required.");
		}

		if (!newEnd.isAfter(newStart)) {
			throw new IllegalArgumentException("End time must be after start time.");
		}

		if (isCancelled) {
			throw new IllegalStateException("A cancelled booking cannot be modified.");
		}

		startTime = newStart;
		endTime = newEnd;
	}

	public boolean extendBooking(int additionalHours) {
		if (additionalHours <= 0 || isCancelled) {
			return false;
		}

		endTime = endTime.plusHours(additionalHours);
		return true;
	}

    public String getBookingID() {
        return bookingID;
    }

	public User getUser() {
		return user;
	}

	public Room getRoom() {
		return room;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public boolean isCheckedIn() {
		return isCheckedIn;
	}

	public boolean isCancelled() {
		return isCancelled;
	}

	public boolean isDepositForfeited() {
		return depositForfeited;
	}

	public double getUpfrontDeposit() {
		return upfrontDeposit;
	}

	public PricingStrategy getPricingStrategy() {
		return pricingStrategy;
	}

	public PaymentStrategy getPaymentStrategy() {
		return paymentStrategy;
	}

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

	public void setPaymentStrategy(PaymentStrategy paymentStrategy) {

		this.paymentStrategy = paymentStrategy;
	}

	public void setPricingStrategy(PricingStrategy pricingStrategy) {

		if (pricingStrategy == null) {
			throw new IllegalArgumentException("Pricing strategy is required.");
		}

		this.pricingStrategy = pricingStrategy;
	}
}
