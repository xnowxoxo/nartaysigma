package Assignment3.assignment4.State;

public class PlayingState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Плеер уже воспроизводит трек.");
    }

    @Override
    public void pause(Player player) {
        System.out.println("Плеер приостановлен.");
        player.setState(new PausedState());
    }

    @Override
    public void stop(Player player) {
        System.out.println("Плеер остановлен.");
        player.setState(new StoppedState());
    }
}
