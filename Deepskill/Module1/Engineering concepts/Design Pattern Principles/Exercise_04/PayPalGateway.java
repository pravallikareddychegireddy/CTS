// PayPalGateway.java - Adaptee class (third-party PayPal API)
// This is an existing class with its own method names - we cannot change it.

public class PayPalGateway {

    public void makePayPalPayment(double amount) {
        System.out.println("Processing payment of $" + amount + " via PayPal.");
    }
}
