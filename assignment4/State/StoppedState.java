package Assignment3.assignment4.State;

public class StoppedState implements PlayerState {
    @Override
    public void play(Player player) {
        System.out.println("Начало воспроизведения трека.");
        player.setState(new PlayingState());
    }

    @Override
    public void pause(Player player) {
        System.out.println("Плеер не может быть приостановлен, он в состоянии остановки.");
    }

    @Override
    public void stop(Player player) {
        System.out.println("Плеер уже остановлен.");
    }
}
