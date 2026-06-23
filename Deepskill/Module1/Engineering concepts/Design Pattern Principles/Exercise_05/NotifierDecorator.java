// NotifierDecorator.java - Abstract Decorator
// All decorators extend this class, which also implements Notifier.

public abstract class NotifierDecorator implements Notifier {

    // Holds a reference to the wrapped Notifier
    protected Notifier wrappedNotifier;

    public NotifierDecorator(Notifier notifier) {
        this.wrappedNotifier = notifier;
    }

    @Override
    public void send(String message) {
        // By default, delegate to the wrapped notifier
        wrappedNotifier.send(message);
    }
}
