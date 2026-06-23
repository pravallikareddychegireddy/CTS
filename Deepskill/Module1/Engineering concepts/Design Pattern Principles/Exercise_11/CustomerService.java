// CustomerService.java - Service class
// Depends on CustomerRepository, which is injected through the constructor.

public class CustomerService {

    // The service depends on the repository (the dependency)
    private CustomerRepository customerRepository;

    // Constructor injection: the repository is passed in from outside
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    // Business logic: find a customer and print details
    public void findCustomer(int id) {
        String customerName = customerRepository.findCustomerById(id);
        if (customerName != null) {
            System.out.println("Customer found: " + customerName + " (ID: " + id + ")");
        } else {
            System.out.println("No customer found with ID: " + id);
        }
    }
}
