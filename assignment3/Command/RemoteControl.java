package Assignment3.assignment3.Command;

import java.util.HashMap;
import java.util.Map;

public class RemoteControl {
    private Map<String, Command> commands = new HashMap<>();

    public void setCommand(String button, Command command) {
        commands.put(button, command);
    }

    public void buttonPressed(String button) {
        Command command = commands.get(button);
        if (command != null) {
            command.execute();
        } else {
            System.out.println("Unknown Command: " + button);
        }
    }
}
