import java.util.*;

public class JukeBox {

    public void go(){
        List<Songs> songList = SongInfo.getSongStrings();
        //Original list.
        System.out.println(songList);

        //List sorted by title.
        Collections.sort(songList);
        System.out.println(songList);

        //List sorted by artist.
        ArtistCompare aCompare = new ArtistCompare();
        songList.sort(aCompare);
        System.out.println(songList);

        //List sorted with lambda.
        songList.sort((one, two) -> one.getArtist().compareTo(two.getArtist()));
        System.out.println(songList);

        //Using a TreeSet
        Set<Songs> songSet2 = new TreeSet<>(songList);
        System.out.println(songSet2);

        //Using a set
        Set<Songs> songSet = new HashSet<>(songList);
        System.out.println(songSet);
    }
}
