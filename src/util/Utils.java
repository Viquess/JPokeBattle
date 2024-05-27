package util;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.net.URL;

public class Utils {
    /**
     * Ottieni l'URL di un file
     * @param path Percorso del file
     * @return URL del file
     */
    public static URL getURL(String path) {
        return Utils.class.getResource("..\\".concat(path));
    }

    /**
     * Imposta il font base dell'UI
     * @param font font da impostare
     */
    public static void setUIFont(FontUIResource font) {
        UIManager.getDefaults().keys().asIterator().forEachRemaining(k -> {
            if (UIManager.get(k) instanceof FontUIResource)
                UIManager.put(k, font);
        });
    }

    public static Image resize(Image image, int width, int height) {
        return image.getScaledInstance(width, height, Image.SCALE_DEFAULT);
    }

    /**
     * Avvia la riproduzione di un file .wav
     * @param path Percorso del file
     * @return Clip riprodotta
     */
    public static Clip playMusic(String path) {
        try {
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(Utils.getURL(path));
            Clip clip = AudioSystem.getClip();
            clip.open(audioIn);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
            return clip;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
