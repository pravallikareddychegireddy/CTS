// PaymentContext.java - Context class
// The context holds a reference to the current payment strategy and
// delegates the payment to whichever strategy is set.

public class PaymentContext {

    // The current payment strategy
    private PaymentStrategy paymentStrategy;

    // Set or change the strategy at runtime
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    // Execute the current strategy
    public void executePayment(double amount) {
        if (paymentStrategy == null) {
            System.out.println("No payment strategy set.");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
