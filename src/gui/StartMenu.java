package gui;

import gui.components.CustomButton;
import util.Utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class StartMenu extends JPanel {
    private JLabel title;
    private JButton startButton;

    /**
     * Inizializza il menù di start
     */
    public StartMenu() {
        super();
        setLayout(null);

        Utils.playMusic("files\\start\\sound.wav");

        title = new JLabel(new ImageIcon(Utils.getURL("files\\start\\JPokeBattle.png")));
        title.setBounds(0,-10, 960, 327);

        startButton = new CustomButton(new ImageIcon(Utils.getURL("files\\start\\start.png")), 430,400, 130,46);
        startButton.setPressedIcon(new ImageIcon(Utils.getURL("files\\start\\startPressed.png")));
        startButton.addActionListener(e -> {
            setVisible(false);
            Utils.playSound("files\\sounds\\pling.wav");
            Application.getInstance().setContentPane(new PokedexMenu());
        });

        add(startButton);
        add(title);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponents(g);

        try {
            g.drawImage(ImageIO.read(Utils.getURL("files\\start\\background.jpg")), 0, 0, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
