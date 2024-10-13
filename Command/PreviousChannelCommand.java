package Assignment3.Command;

public class PreviousChannelCommand implements Command {
    private Television television;

    public PreviousChannelCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.previousChannel();
    }
}
