package classes.observer;

public class ConcreteSubscriber implements Subscriber {
    private String username;
    private boolean notificationEnabled;

    public ConcreteSubscriber(String username, boolean notificationEnabled) {
        this.username = username;
        this.notificationEnabled = notificationEnabled;
    }

    public void toggleNotificationEnabled() {
        this.notificationEnabled = !this.notificationEnabled;
        System.out.println( this.username + " changed notification: " + this.notificationEnabled);
    }

    @Override
    public void notifyAboutNewVideo(String newVideo, String channelName) {
        if (this.notificationEnabled) {
            System.out.println( this.username + "get notification about new video: " + channelName + " - " + newVideo);
        }
    }
}
