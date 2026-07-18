package payment;

public class DebitCardPayment implements PaymentStrategy{

	@Override
	public boolean processTransaction(double amount) {
		System.out.println("Processing debit billing for: $" + amount);
		return true;
	}

}
