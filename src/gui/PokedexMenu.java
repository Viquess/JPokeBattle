package gui;

import enums.Types;
import gui.components.CustomButton;
import objects.PokemonImpl;
import objects.Team;
import util.Datas;
import util.Utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class PokedexMenu extends JPanel {

    private PokemonImpl selected;
    private JLabel infoTitle, infoStats, infoTypes;

    private final Team team;
    private final JButton addButton, fightButton;
    private final List<JComponent> teamComponents = new ArrayList<>();

    /**
     * Inizializza il menù del Pokedex
     */
    public PokedexMenu() {
        super(null);

        team = new Team();

        addButton = new CustomButton(Utils.resize(new ImageIcon(Utils.getURL("files\\pokedex\\add.png")), 100, 35), 281, 360, 100, 35);
        addButton.setPressedIcon(Utils.resize(new ImageIcon(Utils.getURL("files\\pokedex\\add_pressed.png")), 100, 35));
        addButton.setDisabledIcon(Utils.resize(new ImageIcon(Utils.getURL("files\\pokedex\\add_disabled.png")), 100, 35));
        add(addButton);

        fightButton = new CustomButton(new ImageIcon(Utils.getURL("files\\pokedex\\fight.png")), 750, 440, 130, 46);
        fightButton.setPressedIcon(new ImageIcon(Utils.getURL("files\\pokedex\\fight_pressed.png")));
        fightButton.setDisabledIcon(new ImageIcon(Utils.getURL("files\\pokedex\\fight_disabled.png")));
        fightButton.setEnabled(false);
        fightButton.addActionListener(e -> {
            setVisible(false);
            Utils.playSound("files\\sounds\\pling.wav");
            Utils.playMusic("files\\battle\\sound.wav");
            Application.getInstance().setContentPane(new FightMenu(team, Team.getRandom(1)));
        });
        add(fightButton);

        AtomicInteger i = new AtomicInteger();
        Datas.getPokemons().forEach((k, v) -> {
            JButton pokemon = new CustomButton(Utils.resize(v.getFrontSprite(), 70, 70),
                    475 + (i.get() % 4) * 105, 140 + (i.get() / 4) * 90, 80, 80);

            if (i.get() == 0) {
                infoTitle = new JLabel(v.getFrontSprite());
                infoTitle.setText("<html><b>%s</b></html>".formatted(v.getDisplayName()));
                infoTitle.setBounds(270, 135, 125, 80);
                infoTitle.setHorizontalTextPosition(JLabel.CENTER);
                infoTitle.setVerticalTextPosition(JLabel.BOTTOM);
                infoTitle.setForeground(Color.WHITE);

                infoStats = new JLabel("<html><br>PS >> %s<br>Att >> %s<br>Dif >> %s<br>A.Sp >> %s<br>D.Sp >> %s<br>Vel >> %s</html>".formatted(v.getMaxHp(), v.getAttack(), v.getDefense(), v.getSpAtk(), v.getSpDef(), v.getSpeed()));
                infoStats.setFont(Utils.getFont("files\\PokemonFont.ttf", 10.5f));
                infoStats.setBounds(272, 220, 125, 90);
                infoStats.setVerticalAlignment(SwingConstants.TOP);
                infoStats.setForeground(Color.WHITE);

                infoTypes = new JLabel();
                infoTypes.setLayout(new BoxLayout(infoTypes, BoxLayout.X_AXIS));
                infoTypes.setBounds(332, 320, 0, 25);
                for (Types type : v.getTypes()) {
                    Rectangle bounds = infoTypes.getBounds();
                    infoTypes.setBounds(bounds.x - 25, bounds.y, bounds.width + 50, bounds.height);
                    infoTypes.add(new JLabel(type.getTag(50)));
                }

                addButton.addActionListener(e -> {
                    Utils.playSound("files\\sounds\\pling.wav");
                    fightButton.setEnabled(true);
                    addButton.setEnabled(false);
                    team.add(v.newInstance());
                    refreshTeam();
                });

                selected = v;

                add(infoTitle);
                add(infoStats);
                add(infoTypes);
            }

            pokemon.setBorder(new LineBorder(Color.decode("#E86742"), 4, true));
            pokemon.addActionListener(e -> {
                infoTitle.setIcon(v.getFrontSprite());
                infoTitle.setText("<html><b>%s</b></html>".formatted(v.getDisplayName()));

                infoStats.setText("<html><br>PS >> %s<br>Att >> %s<br>Dif >> %s<br>A.Sp >> %s<br>D.Sp >> %s<br>Vel >> %s</html>".formatted(v.getMaxHp(), v.getAttack(), v.getDefense(), v.getSpAtk(), v.getSpDef(), v.getSpeed()));

                infoTypes.setBounds(332, 320, 0, 25);
                infoTypes.removeAll();
                infoTypes.repaint();
                for (Types type : v.getTypes()) {
                    Rectangle bounds = infoTypes.getBounds();
                    infoTypes.setBounds(bounds.x - 25, bounds.y, bounds.width + 50, bounds.height);
                    infoTypes.add(new JLabel(type.getTag(50)));
                }

                addButton.setEnabled(!team.contains(v) && !team.isFull());
                addButton.removeActionListener(addButton.getActionListeners()[0]);
                addButton.addActionListener(event -> {
                    Utils.playSound("files\\sounds\\pling.wav");
                    fightButton.setEnabled(true);
                    addButton.setEnabled(false);
                    team.add(v.newInstance());
                    refreshTeam();
                });

                selected = v;
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

    /**
     * Ricarica i components della squadra
     */
    private void refreshTeam() {
        for (JComponent teamComponent : teamComponents)
            remove(teamComponent);

        teamComponents.clear();

        FontUIResource font = Utils.getFont("files\\PokemonFont.ttf", 10);
        for (int i = 0; i < team.getPokemons().size(); i++) {
            PokemonImpl pokemon = team.getPokemons().get(i);

            JButton rem = new CustomButton(Utils.resize(new ImageIcon(Utils.getURL("files\\pokedex\\minus.png")), 19, 15), 58, 98 + i * 61, 19, 15);
            rem.setPressedIcon(Utils.resize(new ImageIcon(Utils.getURL("files\\pokedex\\minus_pressed.png")), 19, 15));
            rem.addActionListener(e -> {
                if (selected.getId().equalsIgnoreCase(pokemon.getId()) || (team.isFull() && !team.contains(selected)))
                    addButton.setEnabled(true);

                team.remove(pokemon);
                if (team.size() == 0)
                    fightButton.setEnabled(false);

                refreshTeam();
            });

            JLabel label = new JLabel(pokemon.getDisplayName());
            label.setBounds(81, 92 + i * 61, 120, 30);
            label.setForeground(Color.WHITE);
            label.setFont(font);

            add(rem);
            add(label);
            teamComponents.add(rem);
            teamComponents.add(label);
        }

        repaint();
    }
}
