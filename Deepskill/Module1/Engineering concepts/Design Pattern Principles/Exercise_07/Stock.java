// Stock.java - Observer Pattern
// Subject interface: any class acting as a "publisher" will implement this.

public interface Stock {
    void registerObserver(Observer observer);
    void deregisterObserver(Observer observer);
    void notifyObservers();
}
