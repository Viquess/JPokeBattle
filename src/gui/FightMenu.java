package gui;

import enums.MoveTypes;
import enums.Types;
import gui.components.AnimatedBar;
import gui.components.AnimatedLabel;
import gui.components.CustomButton;
import objects.Battle;
import objects.PokemonImpl;
import objects.Team;
import util.Utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FightMenu extends JPanel {
    private final AnimatedBar playerBar, opponentBar;
    private final AnimatedLabel playerSprite, opponentSprite;
    private final JButton fightButton, pokemonButton, runButton;
    private final AnimatedLabel message = new AnimatedLabel();
    private final JLabel playerName = new JLabel(), opponentName = new JLabel(), playerLv = new JLabel(), opponentLv = new JLabel(), playerHP = new JLabel();

    private final List<JComponent> actualComponents;
    private final Battle battle;

    public FightMenu(Team playerTeam, Team opponentTeam) {
        super(null);
        actualComponents = new ArrayList<>();
        battle = new Battle(playerTeam, opponentTeam);

        playerBar = new AnimatedBar(0, battle.getPlayerPokemon().getMaxHp(), Color.decode("#6adaaa"), Color.decode("#dac26a"), Color.decode("#da6a6a"));
        playerBar.setBounds(650, 298, 162, 12);
        playerBar.setValue(battle.getPlayerPokemon().getHp());

        opponentBar = new AnimatedBar(0, battle.getOpponentPokemon().getMaxHp(), Color.decode("#6adaaa"), Color.decode("#dac26a"), Color.decode("#da6a6a"));
        opponentBar.setBounds(245, 109, 162, 12);
        opponentBar.setValue(battle.getOpponentPokemon().getHp());

        playerSprite = new AnimatedLabel(Utils.resize(new ImageIcon(Utils.getURL("files\\battle\\trainer_back.png")), 192, 192));
        playerSprite.setBounds(150, 190, 192, 192);

        opponentSprite = new AnimatedLabel(Utils.resize(new ImageIcon(Utils.getURL("files\\battle\\trainer_front.png")), 192, 192));
        opponentSprite.setBounds(560, 50, 192, 192);

        playerName.setFont(Utils.getFont("files\\BattleFont.ttf", 36));
        playerName.setBounds(543, 258, 140, 25);

        opponentName.setFont(Utils.getFont("files\\BattleFont.ttf", 36));
        opponentName.setBounds(138, 69, 140, 25);

        playerLv.setFont(Utils.getFont("files\\BattleFont.ttf", 26));
        playerLv.setBounds(725, 260, 86, 25);
        playerLv.setHorizontalAlignment(SwingConstants.CENTER);

        opponentLv.setFont(Utils.getFont("files\\BattleFont.ttf", 26));
        opponentLv.setBounds(323, 69, 86, 25);
        opponentLv.setHorizontalAlignment(SwingConstants.CENTER);

        playerHP.setFont(Utils.getFont("files\\BattleFont.ttf", 26));
        playerHP.setBounds(725, 315, 86, 25);
        playerHP.setHorizontalAlignment(SwingConstants.CENTER);

        message.setFont(Utils.getFont("files\\BattleFont.ttf", 36));
        message.setForeground(Color.WHITE);
        message.setBounds(35, 385, 695, 100);

        fightButton = new CustomButton(new ImageIcon(Utils.getURL("files\\battle\\fight.png")), 735, 389, 130, 46);
        fightButton.setPressedIcon(new ImageIcon(Utils.getURL("files\\battle\\fight_pressed.png")));
        fightButton.setEnabled(false);
        fightButton.addActionListener(e -> {
            message.setVisible(false);
            clearComponents();

            for (int i = 0; i < 4; i++) {
                JButton button = new CustomButton(new ImageIcon(Utils.getURL("files\\battle\\move.png")), 35 + (340 * (i < 2 ? i : i - 2)), i < 2 ? 389 : 435, 340, 46);
                button.setPressedIcon(new ImageIcon(Utils.getURL("files\\battle\\move_pressed.png")));
                button.setFont(Utils.getFont("files\\BattleFont.ttf", 26));
                button.setForeground(Color.WHITE);

                if (i < battle.getPlayerPokemon().getMoves().size()) {
                    MoveTypes moveType = battle.getPlayerPokemon().getMoves().get(i).getMoveType();

                    button.setText(moveType.getDisplayName());
                    button.setHorizontalTextPosition(SwingConstants.CENTER);
                    button.add(new JLabel(moveType.getType().getTag(40)));
                } else
                    button.setEnabled(false);

                actualComponents.add(button);
                add(button);
            }

            repaint();
        });

        pokemonButton = new CustomButton(new ImageIcon(Utils.getURL("files\\battle\\pokemon.png")), 735, 435, 130, 46);
        pokemonButton.setPressedIcon(new ImageIcon(Utils.getURL("files\\battle\\pokemon_pressed.png")));
        pokemonButton.setEnabled(false);
        pokemonButton.addActionListener(e -> {
            message.setVisible(false);
            clearComponents();

            for (int i = 0; i < 6; i++) {
                JButton button = new CustomButton(new ImageIcon(Utils.getURL("files\\battle\\pokemon_swap.png")), 35 + (226 * (i < 3 ? i : i - 3)), i < 3 ? 389 : 435, 226, 46);
                button.setPressedIcon(new ImageIcon(Utils.getURL("files\\battle\\pokemon_swap_pressed.png")));
                button.setFont(Utils.getFont("files\\BattleFont.ttf", 16));
                button.setHorizontalTextPosition(SwingConstants.CENTER);
                button.setForeground(Color.WHITE);

                i:
                if (i < battle.getPlayerTeam().size()) {
                    PokemonImpl pokemon = battle.getPlayerTeam().getPokemons().get(i);
                    button.setText("%s (%s/%s)".formatted(pokemon.getDisplayName(), pokemon.getHp(), pokemon.getMaxHp()));

                    if (pokemon.getId().equalsIgnoreCase(battle.getPlayerPokemon().getId())) {
                        button.setEnabled(false);
                        break i;
                    }

                    button.addActionListener(event -> switchPokemon(pokemon, true));

                    JLabel container = new JLabel();
                    container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
                    container.setBounds(55 + (226 * (i < 3 ? i : i - 3)), i < 3 ? 413 : 459, 38, 0);
                    for (Types type : pokemon.getTypes()) {
                        Rectangle bounds = container.getBounds();
                        ImageIcon tagImg = type.getTag(38);

                        container.setBounds(bounds.x, bounds.y - tagImg.getIconHeight() / 2, bounds.width, bounds.height + tagImg.getIconHeight());
                        container.add(new JLabel(tagImg));
                    }

                    actualComponents.add(container);
                    add(container);
                } else
                    button.setEnabled(false);

                actualComponents.add(button);
                add(button);
            }

            repaint();
        });

        runButton = new CustomButton(new ImageIcon(Utils.getURL("files\\battle\\run.png")), 865, 389, 46, 92);
        runButton.setPressedIcon(new ImageIcon(Utils.getURL("files\\battle\\run_pressed.png")));
        runButton.setEnabled(false);
        runButton.addActionListener(e -> {
            fightButton.setEnabled(false);
            pokemonButton.setEnabled(false);
            runButton.setEnabled(false);

            clearComponents();

            Utils.playSound("files\\sounds\\swish.wav");
            message.appearTextAndExecute("Hai abbandonato lo scontro!", () -> {
                setVisible(false);
                Application.getInstance().setContentPane(new StartMenu());
            });
        });

        add(playerBar);
        add(opponentBar);
        add(opponentSprite);
        add(playerSprite);
        add(playerName);
        add(opponentName);
        add(playerLv);
        add(opponentLv);
        add(playerHP);
        add(message);
        add(fightButton);
        add(pokemonButton);
        add(runButton);

        Timer timer = new Timer(1000, e -> {
            playerSprite.setLocation(-200, 190, 32, 16, () -> {
                fightButton.setEnabled(true);
                pokemonButton.setEnabled(true);
                runButton.setEnabled(true);

                playerSprite.setLocation(150, 190);
                playerLv.setText("<html><b>Lv1</b></html>");
                opponentLv.setText("<html><b>Lv1</b></html>");
                playerName.setText(battle.getPlayerPokemon().getDisplayName().toUpperCase());
                opponentName.setText(battle.getOpponentPokemon().getDisplayName().toUpperCase());
                playerHP.setText("<html><b>%s / %s</b></html>".formatted(battle.getPlayerPokemon().getHp(), battle.getPlayerPokemon().getMaxHp()));

                pokemonAppear(battle.getPlayerPokemon(), playerSprite, true);
                message.appearText("%s scelgo te!".formatted(battle.getPlayerPokemon().getDisplayName().toUpperCase()));
            });
            opponentSprite.setLocation(1000, 50, 32, 16, () -> {
                opponentSprite.setLocation(560, 50);
                pokemonAppear(battle.getOpponentPokemon(), opponentSprite, false);
            });
        });

        timer.setRepeats(false);
        timer.start();
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

    /**
     * Rimuovi tutti i components di troppo
     */
    private void clearComponents() {
        for (JComponent component : actualComponents)
            remove(component);

        actualComponents.clear();
    }

    /**
     * Cambia il Pokemon utilizzato da uno dei giocatori
     *
     * @param pokemon    Pokemon da impostare
     * @param playerTeam True se si tratta del giocatore, false se si tratta dell'NPC
     */
    private void switchPokemon(PokemonImpl pokemon, boolean playerTeam) {
        if (playerTeam) {
            if (!battle.setPlayerPokemon(pokemon))
                return;

            pokemonAppear(pokemon, playerSprite, true);

            playerName.setText(pokemon.getDisplayName().toUpperCase());
            playerHP.setText("<html><b>%s / %s</b></html>".formatted(pokemon.getHp(), pokemon.getMaxHp()));
            playerBar.resetBar(pokemon.getHp(), pokemon.getMaxHp());

            clearComponents();
            message.appearText("%s scelgo te!".formatted(pokemon.getDisplayName().toUpperCase()));
        } else {
            if (!battle.setOpponentPokemon(pokemon))
                return;

            pokemonAppear(pokemon, opponentSprite, false);

            opponentName.setText(pokemon.getDisplayName().toUpperCase());
            opponentBar.resetBar(pokemon.getHp(), pokemon.getMaxHp());

            clearComponents();
            message.appearText("Il tuo avversario ha schierato %s!".formatted(pokemon.getDisplayName().toUpperCase()));
        }
    }

    /**
     * Fai apparire il Pokemon
     *
     * @param pokemon     Pokemon da far apparire
     * @param labelSprite Label dove far apparire il Pokemon
     * @param backSprite  True se va usato lo sprite da dietro, altrimenti false
     */
    private void pokemonAppear(PokemonImpl pokemon, AnimatedLabel labelSprite, boolean backSprite) {
        labelSprite.setIcon(new ImageIcon(Utils.getURL("files\\battle\\smoke.gif")));
        pokemon.cry();

        Timer timer = new Timer(16, new ActionListener() {
            int count = -10;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count == 7) {
                    ((Timer) e.getSource()).stop();
                    return;
                } else if (count > 0) {
                    labelSprite.setIcon(Utils.resize(backSprite ? pokemon.getBackSprite() : pokemon.getFrontSprite(), count * 32, count * 32));
                }

                count++;
            }
        });
        timer.start();
    }
}
