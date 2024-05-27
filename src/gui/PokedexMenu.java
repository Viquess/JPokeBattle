package gui;

import gui.components.CustomButton;
import util.Datas;
import util.Utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class PokedexMenu extends JPanel {

    private JLabel infoSprite;
    private JLabel infoName;

    public PokedexMenu() {
        super();
        setLayout(null);

        infoSprite = new JLabel(new ImageIcon(Utils.getURL("files\\sprites\\arbok.png")));
        infoSprite.setBounds(295, 140, 64, 64);
        infoName = new JLabel("<html>Prova<br>Pokedex</html>");
        infoName.setForeground(Color.WHITE);
        infoName.setBounds(270, 210, 125, 190);
        infoName.setBorder(new LineBorder(Color.black ,2));
        add(infoSprite);
        add(infoName);

        AtomicInteger i = new AtomicInteger();
        Datas.getPokemons().forEach((k, v) -> {
            JButton pokemon = new CustomButton(new ImageIcon(Utils.resize(new ImageIcon(Utils.getURL("files\\sprites\\%s.png".formatted(k))).getImage(), 70, 70)),
                    475 + (i.get() % 4) * 105, 140 + (i.get() / 4) * 90, 80, 80);

            pokemon.setBorder(new LineBorder(Color.decode("#E86742"), 4, true));
            pokemon.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

            pokemon.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    pokemon.setBorderPainted(true);
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    pokemon.setBorderPainted(false);
                }
            });

            add(pokemon);
            i.getAndIncrement();
        });
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
