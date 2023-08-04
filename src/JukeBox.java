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
    }
}
