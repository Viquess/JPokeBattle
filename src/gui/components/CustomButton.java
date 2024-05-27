package gui.components;

import javax.swing.*;
import java.awt.*;

public class CustomButton extends JButton {
    public CustomButton(ImageIcon image, int x, int y, int width, int height) {
        super(image);
        setBounds(x,y, width,height);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        setFocusable(false);
        setContentAreaFilled(false);
        setBorderPainted(false);
    }
}
