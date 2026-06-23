// Observer.java - Observer Pattern
// Any class that wants to receive stock updates will implement this interface.

public interface Observer {
    void update(String stockName, double price);
}
