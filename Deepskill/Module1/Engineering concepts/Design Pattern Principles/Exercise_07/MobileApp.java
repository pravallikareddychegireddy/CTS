// MobileApp.java - Concrete Observer
// Receives stock price updates and shows them as mobile alerts.

public class MobileApp implements Observer {

    private String appName;

    public MobileApp(String appName) {
        this.appName = appName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[" + appName + " - Mobile] Alert: " + stockName + " is now $" + price);
    }
}
