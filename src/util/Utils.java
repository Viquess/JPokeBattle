package util;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
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
