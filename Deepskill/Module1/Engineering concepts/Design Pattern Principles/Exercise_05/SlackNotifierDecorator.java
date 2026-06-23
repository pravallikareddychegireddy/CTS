// SlackNotifierDecorator.java - Concrete Decorator
// Adds Slack notification on top of any existing Notifier.

public class SlackNotifierDecorator extends NotifierDecorator {

    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        // First send the wrapped notification(s)
        wrappedNotifier.send(message);
        // Then also send a Slack message
        System.out.println("Sending Slack message: " + message);
    }
}
