package patterns.facade;

public class StreamingService {
    public void login(String username) {
        System.out.println("Logging in to the streaming service as " + username + "...");
    }

    public void logout() {
        System.out.println("Logging out of the streaming service...");
    }

    public void playMovie(String movie) {
        System.out.println("Streaming movie: " + movie);
    }
}
