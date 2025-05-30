package patterns.facade;

public class SoundSystem {
    public void turnOn() {
        System.out.println("Turning on the sound system...");
    }

    public void turnOff() {
        System.out.println("Turning off the sound system...");
    }

    public void setVolume(int volume) {
        System.out.println("Setting sound system volume to " + volume);
    }
}
