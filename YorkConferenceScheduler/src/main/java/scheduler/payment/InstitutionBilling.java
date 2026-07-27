package scheduler.payment;

public class InstitutionBilling implements PaymentStrategy{

	@Override
	public boolean processTransaction(double amount) {
		System.out.println("Processing institutional billing for: $" + amount);
		return true;
	}

}
