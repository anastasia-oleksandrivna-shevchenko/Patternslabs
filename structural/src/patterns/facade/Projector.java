package patterns.facade;

public class Projector {
    public void turnOn() {
        System.out.println("Turning on the projector...");
    }

    public void turnOff() {
        System.out.println("Turning off the projector...");
    }

    public void setResolution(String resolution) {
        System.out.println("Setting projector resolution to " + resolution);
    }
}
