package scheduler.pricing;

public class StaffPricing implements PricingStrategy{

	@Override
	public double getHourlyRate() {
		return 40.0;
	}
}
