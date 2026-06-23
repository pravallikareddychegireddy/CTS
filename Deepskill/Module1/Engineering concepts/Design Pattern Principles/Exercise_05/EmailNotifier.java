// EmailNotifier.java - Concrete Component
// The base notifier that sends email notifications.

public class EmailNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Sending EMAIL: " + message);
    }
}
