package classes.observer;

public interface Subscriber {
    void notifyAboutNewVideo(String newVideo, String channelName);
}
