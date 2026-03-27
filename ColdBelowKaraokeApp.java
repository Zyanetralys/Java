package karaoke;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import javax.sound.sampled.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ColdBelowKaraokeApp extends Application {

    static class Linea {
        String texto;
        long tiempo;

        Linea(String texto, long tiempo) {
            this.texto = texto;
            this.tiempo = tiempo;
        }
    }

    private Label currentLine = new Label("");
    private Label nextLine = new Label("");
    private ProgressBar progressBar = new ProgressBar(0);

    private Clip clip;

    @Override
    public void start(Stage stage) {

        currentLine.setFont(new Font("Consolas", 34));
        nextLine.setFont(new Font("Consolas", 18));

        currentLine.setStyle("-fx-text-fill: #00e5ff;");
        nextLine.setStyle("-fx-text-fill: #666666;");

        progressBar.setPrefWidth(600);

        VBox root = new VBox(25, currentLine, nextLine, progressBar);
        root.setAlignment(Pos.CENTER);
        root.setStyle("-fx-background-color: #000000;");

        Scene scene = new Scene(root, 900, 450);

        stage.setTitle("Karaoke");
        stage.setScene(scene);
        stage.show();

        new Thread(this::reproducir).start();
    }

    private void reproducir() {
        try {
            File audioFile = new File("sleeping_cold_below.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile);

            clip = AudioSystem.getClip();
            clip.open(audioStream);

            List<Linea> song = cargarLetra();

            clip.start();

            long duracion = clip.getMicrosecondLength() / 1000;
            int index = 0;

            while (clip.isRunning()) {

                long tiempoActual = clip.getMicrosecondPosition() / 1000;

                if (index < song.size() && tiempoActual >= song.get(index).tiempo) {
                    int i = index;

                    Platform.runLater(() -> {
                        currentLine.setText(song.get(i).texto);

                        if (i + 1 < song.size()) {
                            nextLine.setText(song.get(i + 1).texto);
                        } else {
                            nextLine.setText("");
                        }
                    });

                    index++;
                }

                double progreso = (double) tiempoActual / duracion;

                Platform.runLater(() -> progressBar.setProgress(progreso));

                Thread.sleep(10);
            }

            clip.stop();

            Platform.runLater(() -> {
                currentLine.setText("END");
                nextLine.setText("");
                progressBar.setProgress(1);
            });

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private List<Linea> cargarLetra() {
        List<Linea> song = new ArrayList<>();

        song.add(new Linea("So it's into the Void", 2000));
        song.add(new Linea("Now me girls and me boys", 5000));
        song.add(new Linea("From Mother's hands we go", 8000));
        song.add(new Linea("We'll be sailing to the Sun", 11000));
        song.add(new Linea("Till the voyage is done", 14000));
        song.add(new Linea("Then we'll be sleeping in the cold below", 17000));

        song.add(new Linea("Sisters! Below, below", 22000));
        song.add(new Linea("We're going where the winds don't blow", 25000));
        song.add(new Linea("Yes we're all bound down", 28000));
        song.add(new Linea("To the deep and we'll all be", 30000));
        song.add(new Linea("Sleeping in the cold below, below", 33000));
        song.add(new Linea("Sleeping in the cold below", 37000));

        song.add(new Linea("Our sailing ship", 42000));
        song.add(new Linea("Is for the hard and the quick", 45000));
        song.add(new Linea("We roll our load and go", 48000));
        song.add(new Linea("There's a living to be made", 51000));
        song.add(new Linea("Or there's Hell to pay", 54000));
        song.add(new Linea("When you're sleeping in the cold below", 57000));

        return song;
    }

    public static void main(String[] args) {
        launch();
    }
}
