package classes.iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements PlaylistCollection {
    private List<String> songs = new ArrayList<String>();

    public void addSong(String song){
        songs.add(song);
    }

    @Override
    public Iterator<String>  createPlaylistIterator() {
        return new PlaylistIterator(songs);
    }
}
