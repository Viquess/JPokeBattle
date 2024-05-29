package gui;

import gui.components.CustomBar;
import gui.components.CustomButton;
import util.Utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class FightMenu extends JPanel {
    JProgressBar playerBar;
    JButton button;

    public FightMenu() {
        super(null);

        playerBar = new CustomBar(0, 100, Color.decode("#6adaaa"), Color.decode("#da6a6a"));
        playerBar.setValue(9);
        playerBar.setBorderPainted(false);
        playerBar.setBounds(650, 299, 162, 11);
        add(playerBar);

        button = new CustomButton(Utils.resize(new ImageIcon(Utils.getURL("files\\pokedex\\add.png")), 100, 35), 281, 360, 100, 35);
        setBounds(400, 100, 30, 10);
        button.addActionListener(e -> {
            playerBar.setValue(52);
        });
        add(button);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        try {
            g.drawImage(ImageIO.read(Utils.getURL("files\\battle\\background.png")), 0, 0, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
