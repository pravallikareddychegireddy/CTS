// Computer.java - Builder Pattern
// Computer is the product we want to build step by step.

public class Computer {

    // These are the parts of a computer
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private boolean hasBluetooth;

    // Private constructor - only the Builder can create a Computer
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.graphicsCard = builder.graphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
    }

    // Show the computer's configuration
    public void showSpecs() {
        System.out.println("=== Computer Specs ===");
        System.out.println("CPU          : " + cpu);
        System.out.println("RAM          : " + ram);
        System.out.println("Storage      : " + storage);
        System.out.println("Graphics Card: " + (graphicsCard != null ? graphicsCard : "None"));
        System.out.println("Bluetooth    : " + (hasBluetooth ? "Yes" : "No"));
        System.out.println("======================");
    }

    // ---- Static nested Builder class ----
    public static class Builder {

        // Required parts
        private String cpu;
        private String ram;
        private String storage;

        // Optional parts
        private String graphicsCard;
        private boolean hasBluetooth;

        // Constructor with required fields
        public Builder(String cpu, String ram, String storage) {
            this.cpu = cpu;
            this.ram = ram;
            this.storage = storage;
        }

        // Optional: set graphics card
        public Builder graphicsCard(String graphicsCard) {
            this.graphicsCard = graphicsCard;
            return this;
        }

        // Optional: enable bluetooth
        public Builder bluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        // Build the final Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}
