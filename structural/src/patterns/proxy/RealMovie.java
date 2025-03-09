package patterns.proxy;

public class RealMovie implements Media{
    private String title;

    public RealMovie(String title) {
        this.title = title;
        loadMovie();
    }

    private void loadMovie() {
        System.out.println("Loading movie: " + title);
    }

    @Override
    public void play() {
        System.out.println("Playing movie: " + title);
    }
}
