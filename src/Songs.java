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

    public boolean equals(Object aSong){
        Songs otherSong = (Songs) aSong;
        return title.equals(otherSong.getTitle());
    }

    public int hashCode() {
        return title.hashCode();
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
