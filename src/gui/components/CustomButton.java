package gui.components;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    /**
     * Inizializza un bottone con delle impostazioni predefinite
     *
     * @param image  Immagine del bottone
     * @param x      Posizione x
     * @param y      Posizione y
     * @param width  Larghezza
     * @param height Altezza
     */
    public CustomButton(ImageIcon image, int x, int y, int width, int height) {
        super(image);
        setBounds(x, y, width, height);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setFocusable(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }
}
