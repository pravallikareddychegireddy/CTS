// StripeAdapter.java - Adapter for Stripe gateway
// Wraps StripeGateway and makes it compatible with our PaymentProcessor interface.

public class StripeAdapter implements PaymentProcessor {

    private StripeGateway stripeGateway;

    public StripeAdapter(StripeGateway stripeGateway) {
        this.stripeGateway = stripeGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Translate our standard call to the Stripe-specific method
        stripeGateway.chargeWithStripe(amount);
    }
}
