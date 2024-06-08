package gui;

import util.Datas;
import util.Utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class LeaderboardDialog extends JDialog {
    public LeaderboardDialog() {
        super(Application.getInstance(), "Classifica", true);

        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);

                try {
                    g.drawImage(ImageIO.read(Utils.getURL("files\\start\\leaderboard_background.png")), 0, 0, null);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };

        panel.setLayout(null);
        panel.setPreferredSize(new Dimension(270, 480));

        AtomicInteger i = new AtomicInteger();
        Datas.getLeaderboard().forEach((k, v) -> {
            JLabel label = new JLabel();
            label.setForeground(Color.WHITE);
            label.setBounds(55, 80 + (35 * i.getAndIncrement()), 160, 30);
            label.setFont(Utils.getFont("files\\BattleFont.ttf", 24));
            label.setText("%s) %s [%s pt.]".formatted(i, k, v));
            label.setHorizontalAlignment(SwingConstants.CENTER);
            panel.add(label);
        });

        setContentPane(panel);
        setResizable(false);
        pack();

        setLocationRelativeTo(null);
        setVisible(true);
    }
}
