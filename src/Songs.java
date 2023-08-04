import java.util.*;

public class Songs implements Comparable<Songs>{

    private String title;
    private String artist;
    private int bpm;

    public Songs(String title, String artist, int bpm){
        this.title = title;
        this.artist = artist;
        this.bpm = bpm;
    }

    public String getTitle(){
        return title;
    }

    public String getArtist(){
        return artist;
    }

    public int getBpm(){
        return bpm;
    }

    public String toString(){
        return ("[" + artist + " - " + title + "]");
    }

    @Override
    public int compareTo(Songs s) {
        return title.compareTo(s.getTitle());
    }
}
