package maang_prep.behavioral;

// command interface that declares the method for executing a command.
interface Command {
    void execute();
}

// Receiver: The class that performs an actual work
class Light {
    public void turnON() { System.out.println("The light is ON"); }

    public void turnOff() { System.out.println("The light is OFF"); };
}

// concrete command: Implements the command to turn the light on.
class LighOnCommand implements Command {
    private Light light;

    public LighOnCommand(Light light) {
        this.light = light;
    }

    public void execute() { light.turnON(); }
}

// concrete command: Implements the command to turn the light off.
class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() { light.turnOff(); }
}

// Invoker: asks the command to carry out the request
class RemoteControl {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}


public class CommandPattern {
    // The Command Pattern is a behavioral design pattern that encapsulates a request as an object, allowing parameterization of clients, request queuing, logging, and the ability to undo operations. It decouples the sender (Invoker) from the receiver by using command objects.

    // How it works?
    // 1. Receiver (Light): Contains the actual business logic to turn the light on or off.
    // 2. Command Interface: Declares a single method, execute(), which all concrete commands implement.
    // 3. Concrete Commands: LightOnCommand and LightOffCommand encapsulate the actions for turning the light on and off, respectively.
    // 3. Invoker (RemoteControl): Maintains a reference to a command object and triggers its execution.
    // 4. Client: Sets up the receiver, concrete commands, and the invoker. It assigns commands to the invoker and executes them.

    // Yes, in terms of handling undo and redo, the Invoker (e.g., a remote control, menu system, or command manager) is typically responsible for managing the history of executed commands. It keeps a stack (or list) of executed commands to support undo and redo functionality.

    public static void main(String[] args) {
        // Receiver
        Light livingRoomLight = new Light();

        // Creating command objects
        Command lightON = new LighOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Invoker
        RemoteControl remoteControl = new RemoteControl();

        remoteControl.setCommand(lightOff);
        remoteControl.pressButton();

        remoteControl.setCommand(lightON);
        remoteControl.pressButton();
    }
}
