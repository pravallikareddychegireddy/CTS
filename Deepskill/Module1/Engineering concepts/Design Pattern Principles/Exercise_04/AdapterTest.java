// AdapterTest.java - Adapter Pattern Test
// Demonstrates using different payment gateways through a single interface.

public class AdapterTest {

    public static void main(String[] args) {

        System.out.println("=== Adapter Pattern - Payment Gateway System ===\n");

        // Using PayPal through the adapter
        PaymentProcessor paypal = new PayPalAdapter(new PayPalGateway());
        System.out.print("PayPal: ");
        paypal.processPayment(150.00);

        // Using Stripe through the adapter
        PaymentProcessor stripe = new StripeAdapter(new StripeGateway());
        System.out.print("Stripe: ");
        stripe.processPayment(250.50);

        System.out.println("\nBoth gateways used via the same PaymentProcessor interface!");
    }
}
