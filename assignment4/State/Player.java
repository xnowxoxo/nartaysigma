package Assignment3.assignment4.State;

public class Player {
    private PlayerState state;

    public Player() {
        this.state = new StoppedState(); // Плеер начинается в состоянии остановки
    }

    public void setState(PlayerState state) {
        this.state = state;
    }

    public void play() {
        state.play(this);
    }

    public void pause() {
        state.pause(this);
    }

    public void stop() {
        state.stop(this);
    }
}
