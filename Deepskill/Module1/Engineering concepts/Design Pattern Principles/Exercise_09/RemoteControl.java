// RemoteControl.java - Invoker class
// The remote control holds a command and triggers it when the button is pressed.

public class RemoteControl {

    private Command command;

    // Load a command into the remote
    public void setCommand(Command command) {
        this.command = command;
    }

    // Press the button - executes whatever command is loaded
    public void pressButton() {
        if (command != null) {
            command.execute();
        } else {
            System.out.println("No command set.");
        }
    }
}
