// WebApp.java - Concrete Observer
// Receives stock price updates and shows them on a web dashboard.

public class WebApp implements Observer {

    private String siteName;

    public WebApp(String siteName) {
        this.siteName = siteName;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println("[" + siteName + " - Web] Dashboard updated: " + stockName + " = $" + price);
    }
}
