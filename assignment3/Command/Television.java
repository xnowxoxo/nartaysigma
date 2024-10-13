package Assignment3.assignment3.Command;

public class Television {
    private int volume = 10;
    private int channel = 1;
    private boolean isOn = false;

    public void turnOn() {
        isOn = true;
        System.out.println("Television is turned ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Television is turned OFF");
    }

    public void volumeUp() {
        if (isOn) {
            volume++;
            System.out.println("Volume is now: " + volume);
        } else {
            System.out.println("Television is OFF");
        }
    }

    public void volumeDown() {
        if (isOn) {
            volume--;
            System.out.println("Volume is now: " + volume);
        } else {
            System.out.println("Television is OFF");
        }
    }

    public void nextChannel() {
        if (isOn) {
            channel++;
            System.out.println("Channel is now: " + channel);
        } else {
            System.out.println("Television is OFF");
        }
    }

    public void previousChannel() {
        if (isOn) {
            channel--;
            System.out.println("Channel is now: " + channel);
        } else {
            System.out.println("Television is OFF");
        }
    }
}
