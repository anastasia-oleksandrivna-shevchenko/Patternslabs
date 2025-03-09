package patterns.facade;

public class HomeTheaterFacade {
    private TV tv;
    private Projector projector;
    private SoundSystem soundSystem;
    private StreamingService streamingService;

    public HomeTheaterFacade(TV tv, Projector projector, SoundSystem soundSystem, StreamingService streamingService) {
        this.tv = tv;
        this.projector = projector;
        this.soundSystem = soundSystem;
        this.streamingService = streamingService;
    }

    public void watchMovie(String movie, String username) {
        System.out.println("Get ready to watch a movie...");
        tv.turnOn();
        projector.turnOn();
        projector.setResolution("4K");
        soundSystem.turnOn();
        soundSystem.setVolume(50);
        streamingService.login(username);
        streamingService.playMovie(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down movie...");
        streamingService.logout();
        soundSystem.turnOff();
        projector.turnOff();
        tv.turnOff();
    }
}
