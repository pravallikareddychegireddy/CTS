// CustomerRepositoryImpl.java - Concrete Repository
// Implements CustomerRepository with some sample data.

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(int id) {
        // Simulating a database lookup with hardcoded data
        switch (id) {
            case 1: return "Alice Johnson";
            case 2: return "Bob Smith";
            case 3: return "Charlie Brown";
            default: return null;
        }
    }
}
