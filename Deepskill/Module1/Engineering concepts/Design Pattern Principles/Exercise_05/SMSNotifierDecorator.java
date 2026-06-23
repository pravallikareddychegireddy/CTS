// SMSNotifierDecorator.java - Concrete Decorator
// Adds SMS notification on top of any existing Notifier.

public class SMSNotifierDecorator extends NotifierDecorator {

    public SMSNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        // First send the wrapped notification
        wrappedNotifier.send(message);
        // Then also send an SMS
        System.out.println("Sending SMS: " + message);
    }
}
