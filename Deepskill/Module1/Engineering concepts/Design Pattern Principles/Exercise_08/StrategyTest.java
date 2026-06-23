// StrategyTest.java - Strategy Pattern Test
// Demonstrates switching between different payment methods at runtime.

public class StrategyTest {

    public static void main(String[] args) {

        System.out.println("=== Strategy Pattern - Payment System ===\n");

        PaymentContext context = new PaymentContext();

        // Use Credit Card to pay
        context.setPaymentStrategy(new CreditCardPayment("1234567890123456"));
        System.out.println("Order 1:");
        context.executePayment(99.99);

        // Switch to PayPal for the next payment
        context.setPaymentStrategy(new PayPalPayment("john.doe@email.com"));
        System.out.println("\nOrder 2:");
        context.executePayment(45.50);

        // Switch back to Credit Card
        context.setPaymentStrategy(new CreditCardPayment("9876543210987654"));
        System.out.println("\nOrder 3:");
        context.executePayment(200.00);
    }
}
