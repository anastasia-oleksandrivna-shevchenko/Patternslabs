package patterns.proxy;

public class MovieProxy implements Media {
    private RealMovie realMovie;
    private String title;
    private boolean isPremium;

    public MovieProxy(String title, boolean isPremium) {
        this.title = title;
        this.isPremium = isPremium;
    }

    @Override
    public void play() {
        if (isPremium) {
            if(realMovie == null) {
                realMovie = new RealMovie(title);
            }
            realMovie.play();
        }
        else {
            System.out.println("You need premium account to watch: " + title);
        }
    }
}
