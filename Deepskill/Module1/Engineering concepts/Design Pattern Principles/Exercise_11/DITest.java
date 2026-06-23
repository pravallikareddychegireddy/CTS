// DITest.java - Dependency Injection Test
// Demonstrates creating a CustomerService with an injected CustomerRepositoryImpl.

public class DITest {

    public static void main(String[] args) {

        System.out.println("=== Dependency Injection - Customer Management ===\n");

        // Create the concrete repository (the dependency)
        CustomerRepository repository = new CustomerRepositoryImpl();

        // Inject the repository into the service via constructor injection
        CustomerService service = new CustomerService(repository);

        // Use the service to find customers
        service.findCustomer(1);
        service.findCustomer(2);
        service.findCustomer(3);
        service.findCustomer(99);   // does not exist

        System.out.println("\nDependency was injected through the constructor, not created inside CustomerService.");
    }
}
