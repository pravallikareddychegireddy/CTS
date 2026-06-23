// Logger.java - Singleton Pattern
// The Logger class can only have one instance in the entire program.

public class Logger {

    // Step 1: Create a private static variable to hold the single instance
    private static Logger instance;

    // Step 2: Make the constructor private so no one can do "new Logger()" from outside
    private Logger() {
        System.out.println("Logger created.");
    }

    // Step 3: Provide a public method to get the one and only instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    // A simple log method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
