package gui;

import gui.components.CustomButton;
import util.Utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class StartMenu extends JPanel {

    /**
     * Istanzia il menù di start
     */
    public StartMenu() {
        super();
        setLayout(null);

        Utils.playMusic("files\\start\\sound.wav");

        JLabel title = new JLabel(new ImageIcon(Utils.getURL("files\\start\\JPokeBattle.png")));
        title.setBounds(0, -10, 960, 327);

        JButton startButton = new CustomButton(new ImageIcon(Utils.getURL("files\\start\\start.png")), 391, 400, 130, 46);
        startButton.setPressedIcon(new ImageIcon(Utils.getURL("files\\start\\start_pressed.png")));
        startButton.addActionListener(e -> {
            setVisible(false);
            Utils.playSound("files\\sounds\\pling.wav");
            Application.getInstance().setContentPane(new PokedexMenu());
        });

        JButton leaderboardButton = new CustomButton(new ImageIcon(Utils.getURL("files\\start\\leaderboard.png")), 525, 400, 46, 46);
        leaderboardButton.setPressedIcon(new ImageIcon(Utils.getURL("files\\start\\leaderboard_pressed.png")));
        leaderboardButton.addActionListener(event -> new LeaderboardDialog());

        add(title);
        add(startButton);
        add(leaderboardButton);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        try {
            g.drawImage(ImageIO.read(Utils.getURL("files\\start\\background.jpg")), 0, 0, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
