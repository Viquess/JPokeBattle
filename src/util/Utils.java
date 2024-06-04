package util;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;

public class Utils {
    /**
     * Clip attualmente in riproduzione
     */
    private static Clip clip;

    /**
     * Ottieni l'URL di un file
     *
     * @param path Percorso del file
     * @return URL del file
     */
    public static URL getURL(String path) {
        return Utils.class.getResource("..\\".concat(path));
    }


    public static void registerFonts(FontUIResource... fonts) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        for (FontUIResource font : fonts)
            ge.registerFont(font);
    }

    /**
     * Imposta il font base dell'UI
     *
     * @param font font da impostare
     */
    public static void setUIFont(FontUIResource font) {
        UIManager.getDefaults().keys().asIterator().forEachRemaining(k -> {
            if (UIManager.get(k) instanceof FontUIResource)
                UIManager.put(k, font);
        });
    }

    public static FontUIResource getFont(String path, float dimension) {
        try {
            InputStream is = Utils.class.getClassLoader().getResourceAsStream(path);
            return is == null ? null : new FontUIResource(Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(dimension));
        } catch (Exception e) {
        }

        return null;
    }

    public static ImageIcon resize(ImageIcon icon, int width, int height) {
        return new ImageIcon(icon.getImage().getScaledInstance(width, height, Image.SCALE_DEFAULT));
    }

    /**
     * Avvia la riproduzione di un file .wav
     *
     * @param path Percorso del file
     * @return Clip riprodotta
     */
    public static void playMusic(String path) {
        if (clip != null)
            clip.stop();

        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(Utils.getURL(path));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();

            Utils.clip = clip;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Riproduci un effetto sonoro (file .wav)
     *
     * @param path Percorso del file
     * @return Effetto riprodotto
     */
    public static void playSound(String path) {
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(Utils.getURL(path));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.start();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * Ottieni un numero casuale in un intervallo
     *
     * @param min Estremo inferiore dell'intervallo
     * @param max Estremo superiore dell'intervallo
     * @return Numero casuale
     */
    public static int randNumber(int min, int max) {
        return (int) ((Math.random() * ((max - min) + 1)) + min);
    }

    /**
     * Ottieni un elemento casuale da una collezione
     *
     * @param collection Collezione di oggetti
     * @param <T>        Tipo degli elementi nella collezione
     * @return Elemento casuale della collezione
     */
    public static <T> T randOf(Collection<T> collection) {
        return new ArrayList<>(collection).get(randNumber(0, collection.size() - 1));
    }
}
