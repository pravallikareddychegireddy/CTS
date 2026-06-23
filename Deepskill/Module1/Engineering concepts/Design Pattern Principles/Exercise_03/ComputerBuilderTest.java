// ComputerBuilderTest.java - Builder Pattern Test
// Shows how to build different Computer configurations using the Builder.

public class ComputerBuilderTest {

    public static void main(String[] args) {

        System.out.println("=== Builder Pattern - Computer Configurations ===\n");

        // Configuration 1: Basic office computer (no GPU, no Bluetooth)
        Computer officePC = new Computer.Builder("Intel i3", "8GB", "256GB SSD")
                .build();
        System.out.println("Office PC:");
        officePC.showSpecs();

        // Configuration 2: Gaming computer with GPU and Bluetooth
        Computer gamingPC = new Computer.Builder("Intel i9", "32GB", "1TB SSD")
                .graphicsCard("NVIDIA RTX 4080")
                .bluetooth(true)
                .build();
        System.out.println("\nGaming PC:");
        gamingPC.showSpecs();

        // Configuration 3: Mid-range workstation with Bluetooth only
        Computer workstation = new Computer.Builder("AMD Ryzen 7", "16GB", "512GB SSD")
                .bluetooth(true)
                .build();
        System.out.println("\nWorkstation:");
        workstation.showSpecs();
    }
}
