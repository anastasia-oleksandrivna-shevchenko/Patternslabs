package classes.observer;

import java.util.ArrayList;
import java.util.List;

public class SimpleYouTubeChannel implements YouTubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String channelName;

    public SimpleYouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    public void uploadNewVideo(String newVideo) {
        System.out.println("New video uploaded: " + newVideo);
        notifySubscribers(newVideo);
    }

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }
    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }
    @Override
    public void notifySubscribers(String newVideo) {
        for (Subscriber subscriber : subscribers) {
            subscriber.notifyAboutNewVideo(newVideo, this.channelName);
        }
    }

}
