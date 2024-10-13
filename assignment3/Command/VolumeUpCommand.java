package Assignment3.assignment3.Command;

public class VolumeUpCommand implements Command {
    private Television television;

    public VolumeUpCommand(Television television) {
        this.television = television;
    }

    public void execute() {
        television.volumeUp();
    }
}
