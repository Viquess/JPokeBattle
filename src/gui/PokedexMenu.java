package gui;

import util.Utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class PokedexMenu extends JPanel {
    public PokedexMenu(){
        super();
        setLayout(null);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        try {
            g.drawImage(ImageIO.read(Utils.getURL("files\\pokedex\\background.png")), 0, 0, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
