// ObserverTest.java - Observer Pattern Test
// Demonstrates how observers get notified when stock prices change.

public class ObserverTest {

    public static void main(String[] args) {

        System.out.println("=== Observer Pattern - Stock Market System ===\n");

        // Create the stock market (subject)
        StockMarket appleStock = new StockMarket("AAPL");

        // Create observers
        Observer mobileUser = new MobileApp("StockTracker");
        Observer webUser1   = new WebApp("FinanceHub");
        Observer webUser2   = new WebApp("MarketWatch");

        // Register observers
        appleStock.registerObserver(mobileUser);
        appleStock.registerObserver(webUser1);
        appleStock.registerObserver(webUser2);

        // Change price - all observers get notified
        appleStock.setStockPrice(182.50);
        appleStock.setStockPrice(185.00);

        // Remove one observer and change price again
        System.out.println();
        appleStock.deregisterObserver(webUser2);
        appleStock.setStockPrice(179.75);
    }
}
