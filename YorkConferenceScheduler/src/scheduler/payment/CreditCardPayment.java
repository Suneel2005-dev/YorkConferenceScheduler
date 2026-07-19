package scheduler.payment;

public class CreditCardPayment implements PaymentStrategy{

	@Override
	public boolean processTransaction(double amount) {
		System.out.println("Processing credit billing for: $" + amount);
		return true;
	}

}
