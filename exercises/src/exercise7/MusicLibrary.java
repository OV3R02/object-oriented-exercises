package exercise7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicLibrary {
    private List<Song> songLib = new ArrayList<>();

    public boolean addSong(Song song) {
        int conta = 0;
        while (conta < songLib.size()) {
            if (song.getSongTitle().equals(songLib.get(conta).getSongTitle())) {
                return false;

            }
            conta++;
        }
        songLib.add(song);
        return true;

    }

    public boolean rmSong(Song song) {
        
        int conta = 0;
        while (conta < songLib.size()) {
            conta++;
            if (song.getSongTitle().equals(songLib.get(conta).getSongTitle())) {
                songLib.remove(song);
                return true;
            }
        }
        return false;
    }

    public void printLib() {
        System.out.println("\n__________________________________| PLAYLIST |__________________________________\n");
        for (int i = 0; i < songLib.size(); i++) {
            System.out.println(i + ") " + songLib.get(i));
        }
        System.out.println("\n_________________________________________________________________________________\n");
    }

    public void playRandomSongs() {
        Random r = new Random();

        int randomIndex = r.nextInt(songLib.size());
        Song song = songLib.get(randomIndex);

        System.out.println("             ______        ____________________________             ______        ");
        System.out.println("             |    |        |      |             |     |             |    |        ");
        System.out.println("            _|   _|        |  |>  |MUSIC IN PLAY|  =  |            _|   _|        ");
        System.out.println("           (_|  (_|        |______|_____________|_____|           (_|  (_|        ");

        System.out.println("\n  -" + song + "-" + "\n");

    }
}
