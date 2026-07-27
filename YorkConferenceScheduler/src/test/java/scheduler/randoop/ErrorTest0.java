package scheduler.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        scheduler.booking.Booking booking0 = new scheduler.booking.Booking();
        boolean boolean2 = booking0.extendBooking((int) (byte) 0);
        scheduler.user.User user3 = booking0.getUser();
        double double4 = booking0.calculateFinalCost();
        double double6 = booking0.calculateFinalCost((int) (short) -1);
        double double7 = booking0.calculateFinalCost();
        java.time.LocalDateTime localDateTime8 = booking0.getEndTime();
        scheduler.pricing.StaffPricing staffPricing9 = new scheduler.pricing.StaffPricing();
        double double10 = staffPricing9.getHourlyRate();
        booking0.setPricingStrategy((scheduler.pricing.PricingStrategy) staffPricing9);
        booking0.cancel();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double13 = booking0.calculateFinalCost();
    }
}

