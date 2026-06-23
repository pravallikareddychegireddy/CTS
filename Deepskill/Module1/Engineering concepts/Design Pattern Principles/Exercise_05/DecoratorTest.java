// DecoratorTest.java - Decorator Pattern Test
// Shows how notifications can be sent through multiple channels by stacking decorators.

public class DecoratorTest {

    public static void main(String[] args) {

        System.out.println("=== Decorator Pattern - Notification System ===\n");

        // Test 1: Only email notification
        System.out.println("--- Email Only ---");
        Notifier emailOnly = new EmailNotifier();
        emailOnly.send("Your order has been placed.");

        // Test 2: Email + SMS
        System.out.println("\n--- Email + SMS ---");
        Notifier emailAndSms = new SMSNotifierDecorator(new EmailNotifier());
        emailAndSms.send("Your order has been shipped.");

        // Test 3: Email + SMS + Slack (stacking decorators)
        System.out.println("\n--- Email + SMS + Slack ---");
        Notifier allChannels = new SlackNotifierDecorator(
                                   new SMSNotifierDecorator(
                                       new EmailNotifier()));
        allChannels.send("Payment confirmed!");
    }
}
