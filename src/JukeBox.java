import java.util.*;

public class JukeBox {

    public void go(){
        List<Songs> songList = SongInfo.getSongStrings();
        System.out.println(songList);
        Collections.sort(songList);
        System.out.println(songList);
    }
}
