// PayPalAdapter.java - Adapter for PayPal gateway
// Wraps PayPalGateway and makes it compatible with our PaymentProcessor interface.

public class PayPalAdapter implements PaymentProcessor {

    private PayPalGateway payPalGateway;

    public PayPalAdapter(PayPalGateway payPalGateway) {
        this.payPalGateway = payPalGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Translate our standard call to the PayPal-specific method
        payPalGateway.makePayPalPayment(amount);
    }
}
