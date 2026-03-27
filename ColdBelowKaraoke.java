package karaoke;

import java.util.ArrayList;
import java.util.List;

public class ColdBelowKaraoke {

    static class Linea {
        String texto;
        int delay;

        Linea(String texto, int delay) {
            this.texto = texto;
            this.delay = delay;
        }
    }

    public static void main(String[] args) throws InterruptedException {

        List<Linea> song = new ArrayList<>();

        // Intro
        song.add(new Linea("So it's into the Void", 2500));
        song.add(new Linea("Now me girls and me boys", 2500));
        song.add(new Linea("From Mother's hands we go", 2500));
        song.add(new Linea("We'll be sailing to the Sun", 2500));
        song.add(new Linea("Till the voyage is done", 2500));
        song.add(new Linea("Then we'll be sleeping in the cold below", 3500));

        pausa(1500);

        // Chorus
        chorus(song);

        // Verse 2
        song.add(new Linea("Our sailing ship", 2000));
        song.add(new Linea("Is for the hard and the quick", 2500));
        song.add(new Linea("We roll our load and go", 2500));
        song.add(new Linea("There's a living to be made", 2500));
        song.add(new Linea("Or there's Hell to pay", 2500));
        song.add(new Linea("When you're sleeping in the cold below", 3500));

        pausa(1500);
        chorus(song);

        // Verse 3
        song.add(new Linea("There's a man on high", 2500));
        song.add(new Linea("With the Devil in his eye", 2500));
        song.add(new Linea("And a golden hand, I'm told", 2500));
        song.add(new Linea("It can hurt you, it can hold you", 2500));
        song.add(new Linea("He can kick you or console you", 2500));
        song.add(new Linea("When you're sleeping in the cold below", 3500));

        pausa(1500);
        chorus(song);

        // Verse 4
        song.add(new Linea("Oh Sisters you", 2000));
        song.add(new Linea("So wise and true", 2500));
        song.add(new Linea("When it's my time to go", 2500));
        song.add(new Linea("Won't you lay me down", 2500));
        song.add(new Linea("Under Granum Crowns", 2500));
        song.add(new Linea("And I'll be sleeping in the cold below", 3500));

        pausa(1500);
        chorus(song);

        // Outro
        song.add(new Linea("Today we sail", 2000));
        song.add(new Linea("On the Solar Rail", 2500));
        song.add(new Linea("For there's much we just don't know", 2500));
        song.add(new Linea("So farewell with a kiss", 2500));
        song.add(new Linea("Then it's fast for the mist", 2500));
        song.add(new Linea("Till we're sleeping in the cold below", 4000));

        reproducir(song);
    }

    public static void chorus(List<Linea> song) {
        song.add(new Linea("Sisters! Below, below", 2000));
        song.add(new Linea("We're going where the winds don't blow", 2500));
        song.add(new Linea("Yes we're all bound down", 2000));
        song.add(new Linea("To the deep and we'll all be", 2500));
        song.add(new Linea("Sleeping in the cold below, below", 3000));
        song.add(new Linea("Sleeping in the cold below", 3500));
    }

    public static void reproducir(List<Linea> song) throws InterruptedException {
        System.out.println("🎵 INITIALIZING SEQUENCE...\n");
        Thread.sleep(1500);

        for (Linea linea : song) {
            efectoEscritura(linea.texto);
            Thread.sleep(linea.delay);
        }

        System.out.println("\n🎵 END OF TRANSMISSION");
    }

    // Efecto tipo escritura (más inmersivo)
    public static void efectoEscritura(String texto) throws InterruptedException {
        for (char c : texto.toCharArray()) {
            System.out.print(c);
            Thread.sleep(25);
        }
        System.out.println();
    }

    public static void pausa(int ms) throws InterruptedException {
        Thread.sleep(ms);
    }
}
