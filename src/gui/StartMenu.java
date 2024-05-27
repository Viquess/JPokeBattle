package gui;

import util.Utils;

import javax.imageio.ImageIO;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
        startButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        startButton.setContentAreaFilled(false);
        startButton.setBorderPainted(false);
        startButton.addActionListener(e -> {
            clip.stop();
            setVisible(false);
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
