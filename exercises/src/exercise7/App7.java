/*
 * Write a Java program to create a class called "MusicLibrary" with
 * a collection of songs and methods to add and remove songs,
 * and to play a random song. 
 */

package exercise7;

public class App7 {
    public static void main(String[] args) {
        MusicLibrary lib1 = new MusicLibrary();
        Song song1 = new Song("Hotel California", "Eagles", "Rock");
        Song song2 = new Song("Nothing else matter", "Metallica", "Rock");
        Song song3 = new Song("Queen", "Bohemian Rapsody", "Rock");
        Song song4 = new Song("AC-DC", "Thunderstruck", "Rock");
        Song song5 = new Song("Welcome to the jungle", "Guns N'Roses", "Rock");
        Song song6 = new Song("Green Day", "American idiot", "Rock");
        
        lib1.addSong(song1);
        lib1.addSong(song2);
        lib1.addSong(song3);
        lib1.addSong(song4);
        lib1.addSong(song5);
        lib1.addSong(song6);

        lib1.printLib();

        lib1.rmSong(song3);

        lib1.printLib();

        lib1.playRandomSongs();

    }

    
}
