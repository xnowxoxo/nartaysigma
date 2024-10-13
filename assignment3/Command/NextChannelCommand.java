package Assignment3.assignment3.Command;

public class NextChannelCommand implements Command {
    private Television television;

    public NextChannelCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.nextChannel();
    }
}
