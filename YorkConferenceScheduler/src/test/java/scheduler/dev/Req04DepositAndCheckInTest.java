package scheduler.dev;

import static org.junit.Assert.*;

import java.time.LocalDateTime;

import org.junit.Before;
import org.junit.Test;

import scheduler.booking.Booking;
import scheduler.payment.PaymentStrategy;
import scheduler.pricing.FacultyPricing;
import scheduler.pricing.PartnerPricing;
import scheduler.pricing.StaffPricing;
import scheduler.pricing.StudentPricing;
import scheduler.room.Room;
import scheduler.user.Faculty;
import scheduler.user.Partner;
import scheduler.user.Staff;
import scheduler.user.Student;

public class Req04DepositAndCheckInTest {

	private static final double DELTA = 0.001;

	private Room room;
	private LocalDateTime start;
	private PaymentStrategy successfulPayment;

	@Before
	public void setUp() {
		room = new Room("REQ4-R101", 12, "Lassonde");
		start = LocalDateTime.of(2026, 9, 10, 10, 0);
		successfulPayment = amount -> true;
	}

	@Test
	public void studentIsCharged20DollarDepositUpfront() {
		Booking booking = new Booking(new Student("S001", "s@yorku.ca", "pw", "SN1", true), room, start,
				start.plusHours(3), new StudentPricing(), successfulPayment);

		assertEquals(20.0, booking.calculateUpfrontCost(), DELTA);
		assertEquals(20.0, booking.getUpfrontDeposit(), DELTA);
	}

	@Test
	public void facultyIsCharged30DollarDepositUpfront() {
		Booking booking = new Booking(new Faculty("F001", "f@yorku.ca", "pw", "YORK", true), room, start,
				start.plusHours(3), new FacultyPricing(), successfulPayment);

		assertEquals(30.0, booking.calculateUpfrontCost(), DELTA);
	}

	@Test
	public void staffIsCharged40DollarDepositUpfront() {
		Booking booking = new Booking(new Staff("T001", "t@yorku.ca", "pw", "YORK", true), room, start,
				start.plusHours(3), new StaffPricing(), successfulPayment);

		assertEquals(40.0, booking.calculateUpfrontCost(), DELTA);
	}

	@Test
	public void partnerIsCharged50DollarDepositUpfront() {
		Booking booking = new Booking(new Partner("P001", "p@partner.ca", "pw", "ORG", true), room, start,
				start.plusHours(3), new PartnerPricing(), successfulPayment);

		assertEquals(50.0, booking.calculateUpfrontCost(), DELTA);
	}

	@Test
	public void checkedInStudentDepositIsAppliedToFinalCost() {
		Booking booking = new Booking(new Student("S001", "s@yorku.ca", "pw", "SN1", true), room, start,
				start.plusHours(3), new StudentPricing(), successfulPayment);

		booking.calculateUpfrontCost();
		booking.checkIn();


		assertEquals(40.0, booking.calculateFinalCost(), DELTA);
	}

	@Test
	public void checkedInFacultyDepositIsAppliedToFinalCost() {
		Booking booking = new Booking(new Faculty("F001", "f@yorku.ca", "pw", "YORK", true), room, start,
				start.plusHours(2), new FacultyPricing(), successfulPayment);

		booking.calculateUpfrontCost();
		booking.checkIn();


		assertEquals(30.0, booking.calculateFinalCost(), DELTA);
	}

	@Test
	public void noCheckInMeansDepositIsNotYetApplied() {
		Booking booking = new Booking(new Student("S001", "s@yorku.ca", "pw", "SN1", true), room, start,
				start.plusHours(3), new StudentPricing(), successfulPayment);

		booking.calculateUpfrontCost();

		assertFalse(booking.isCheckedIn());
		assertEquals(60.0, booking.calculateFinalCost(), DELTA);
	}

	@Test
	public void forfeitedDepositIsLostAndNotAppliedToFinalCost() {
		Booking booking = new Booking(new Student("S001", "s@yorku.ca", "pw", "SN1", true), room, start,
				start.plusHours(3), new StudentPricing(), successfulPayment);

		booking.calculateUpfrontCost();
		booking.forfeitDeposit();

		assertTrue(booking.isDepositForfeited());
		assertFalse(booking.isCheckedIn());
		assertEquals(60.0, booking.calculateFinalCost(), DELTA);
	}

	@Test
	public void oneHourCheckedInBookingHasZeroRemainingCost() {
		Booking booking = new Booking(new Faculty("F001", "f@yorku.ca", "pw", "YORK", true), room, start,
				start.plusHours(1), new FacultyPricing(), successfulPayment);

		booking.calculateUpfrontCost();
		booking.checkIn();

		assertEquals(0.0, booking.calculateFinalCost(), DELTA);
	}

	@Test
	public void depositRemainsOneHourFeeForLongBooking() {
		Booking booking = new Booking(new Partner("P001", "p@partner.ca", "pw", "ORG", true), room, start,
				start.plusHours(5), new PartnerPricing(), successfulPayment);

		assertEquals(50.0, booking.calculateUpfrontCost(), DELTA);
		assertEquals(250.0, booking.calculateFinalCost(), DELTA);
	}

	@Test
	public void partialHourFinalCostIsCalculatedProportionally() {
		Booking booking = new Booking(new Student("S001", "s@yorku.ca", "pw", "SN1", true), room, start,
				start.plusMinutes(90), new StudentPricing(), successfulPayment);

		assertEquals(30.0, booking.calculateFinalCost(), DELTA);
	}

	@Test
	public void calculateFinalCostByHoursAlsoAppliesDepositAfterCheckIn() {
		Booking booking = new Booking(new Staff("T001", "t@yorku.ca", "pw", "YORK", true), room, start,
				start.plusHours(4), new StaffPricing(), successfulPayment);

		booking.calculateUpfrontCost();
		booking.checkIn();

		assertEquals(120.0, booking.calculateFinalCost(4), DELTA);
	}

	@Test
	public void negativePaymentAmountIsRejected() {
		Booking booking = new Booking(new Student("S001", "s@yorku.ca", "pw", "SN1", true), room, start,
				start.plusHours(1), new StudentPricing(), successfulPayment);

		assertFalse(booking.executePayment(-20.0));
	}

	@Test
	public void paymentStrategyReceivesExactDepositAmount() {
		final double[] charged = { -1.0 };

		PaymentStrategy recordingPayment = amount -> {
			charged[0] = amount;
			return true;
		};

		Booking booking = new Booking(new Partner("P001", "p@partner.ca", "pw", "ORG", true), room, start,
				start.plusHours(2), new PartnerPricing(), recordingPayment);

		double deposit = booking.calculateUpfrontCost();

		assertTrue(booking.executePayment(deposit));
		assertEquals(50.0, charged[0], DELTA);
	}
}
