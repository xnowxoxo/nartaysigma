package Assignment3.Command;

public class TurnOnCommand implements Command {
    private Television television;

    public TurnOnCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.turnOn();
    }
}
