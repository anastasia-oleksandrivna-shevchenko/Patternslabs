package patterns.facade;

public class TV {
    public void turnOn() {
        System.out.println("Turning on the TV...");
    }

    public void turnOff() {
        System.out.println("Turning off the TV...");
    }

    public void setChannel(int channel) {
        System.out.println("Setting TV channel to " + channel);
    }
}
