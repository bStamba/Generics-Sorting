import java.util.*;

public class SongInfo{
        public static List<Songs> getSongStrings() {

            List<Songs> songs = new ArrayList<>();
            songs.add(new Songs ("Balance is Restored", "Final Fantasy", 6));
            songs.add(new Songs ("Somersault", "Zimbabwe Jones", 9));
            songs.add(new Songs ("Sweet but Psycho", "Ava Max", 7));
            songs.add(new Songs ("River of Darkness", "The Midnight", 4));
            songs.add(new Songs ("When You Grow Up Your Heart Dies", "GUNSHIP", 5));
            songs.add(new Songs ("Sunset", "The Midnight", 3));
            songs.add(new Songs ("Ali Bomaye", "The Game", 8));
            songs.add(new Songs ("Still Fly", "Big Tymers", 2));
            songs.add(new Songs ("Winter Time", "Steve Miller Band", 1));
            songs.add(new Songs ("Just To See You Smile", "Tim McGraw", 10));
            return songs;
        }
}
