// LoggerTest.java - Singleton Pattern Test
// This test checks that Logger always returns the same instance.

public class LoggerTest {

    public static void main(String[] args) {

        // Get the logger instance in two different places
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        // Both should point to the exact same object
        if (logger1 == logger2) {
            System.out.println("Same instance - Singleton is working correctly!");
        } else {
            System.out.println("Different instances - Singleton is NOT working.");
        }

        // Use the logger to print messages
        logger1.log("Application started.");
        logger2.log("User logged in.");
        logger1.log("Application finished.");
    }
}
