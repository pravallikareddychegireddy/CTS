// StripeGateway.java - Adaptee class (third-party Stripe API)
// Another existing class with its own different method names.

public class StripeGateway {

    public void chargeWithStripe(double amount) {
        System.out.println("Charging $" + amount + " using Stripe payment gateway.");
    }
}
