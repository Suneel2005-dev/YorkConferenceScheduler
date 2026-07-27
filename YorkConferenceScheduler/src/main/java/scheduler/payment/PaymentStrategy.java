package scheduler.payment;

public interface PaymentStrategy {
	
	boolean processTransaction(double amount);

}
