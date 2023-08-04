import java.util.Comparator;

public class ArtistCompare implements Comparator<Songs> {

    @Override
    public int compare(Songs s1, Songs s2) {
        return s1.getArtist().compareTo(s2.getArtist());
    }
}
