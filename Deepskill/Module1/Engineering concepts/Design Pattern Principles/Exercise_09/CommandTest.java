// CommandTest.java - Command Pattern Test
// Demonstrates controlling lights using a remote control.

public class CommandTest {

    public static void main(String[] args) {

        System.out.println("=== Command Pattern - Home Automation System ===\n");

        // Create the receiver - a living room light
        Light livingRoomLight = new Light("Living Room");
        Light bedroomLight    = new Light("Bedroom");

        // Create commands for each action
        Command lightOn   = new LightOnCommand(livingRoomLight);
        Command lightOff  = new LightOffCommand(livingRoomLight);
        Command bedOn     = new LightOnCommand(bedroomLight);
        Command bedOff    = new LightOffCommand(bedroomLight);

        // Create the invoker (remote control)
        RemoteControl remote = new RemoteControl();

        // Use the remote to turn on living room light
        remote.setCommand(lightOn);
        remote.pressButton();

        // Turn off living room light
        remote.setCommand(lightOff);
        remote.pressButton();

        // Turn on bedroom light
        remote.setCommand(bedOn);
        remote.pressButton();

        // Turn off bedroom light
        remote.setCommand(bedOff);
        remote.pressButton();
    }
}
