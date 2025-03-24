package classes.iterator;

import java.util.List;

public class PlaylistIterator implements Iterator<String> {
    private List<String> songs;
    private int position = 0;

    public PlaylistIterator(List<String> songs) {
        this.songs = songs;
    }

    @Override
    public boolean hasNext() {
        return position < songs.size();
    }
    @Override
    public String next() {
        return hasNext() ? songs.get(position++) : null;
    }
    @Override
    public boolean hasPrevious() {
        return position > 0;
    }
    @Override
    public String previous() {
        return hasPrevious() ? songs.get(--position) : null;
    }
}
