package gui;

import util.Utils;

import javax.imageio.ImageIO;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class StartMenu extends JPanel {
    private JLabel title;
    private JButton startButton;
    private Clip clip;

    public StartMenu() {
        super();
        setLayout(null);

        clip = Utils.playMusic("files\\start\\sound.wav");

        title = new JLabel(new ImageIcon(Utils.getURL("files\\start\\JPokeBattle.png")));
        title.setBounds(0,-10, 960, 327);

        startButton = new JButton((new ImageIcon(Utils.getURL("files\\start\\start.png"))));
        startButton.setPressedIcon(new ImageIcon(Utils.getURL("files\\start\\startPressed.png")));
        startButton.setBounds(430,400, 130,46);
        startButton.setBorderPainted(false);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clip.stop();
            }
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
