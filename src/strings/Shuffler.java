package strings;

import java.util.Random;

public class Shuffler {
    public static void main(String[] args) {
        String[] songs = {"ColdPlay", "Aagadu", "Indra", "Bommarillu", "Bhadra"};
        String[] copied = songs.clone();
        shufflePlaylist(copied);
    }

    private static final Random random = new Random();

    public static void shufflePlaylist(String[] playlist) {
        String[] copiedPlaylist = playlist.clone();

        for (int i = copiedPlaylist.length - 1; i > 0; i--) {
            int randomIndex = random.nextInt(i + 1);
            swap(copiedPlaylist, i, randomIndex);
        }

        // Play the shuffled playlist
        playPlaylist(copiedPlaylist);
    }

    private static void swap(String[] array, int i, int j) {
        String temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void playPlaylist(String[] playlist) {
        for (String song : playlist) {
            System.out.println("Playing song: " + song);
        }
    }
}
