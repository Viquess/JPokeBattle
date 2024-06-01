package gui;

import enums.MoveTypes;
import enums.Types;
import gui.components.AnimatedLabel;
import gui.components.CustomBar;
import gui.components.CustomButton;
import objects.Battle;
import objects.PokemonImpl;
import objects.Team;
import util.Utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FightMenu extends JPanel {
    private Battle battle;
    CustomBar playerBar, opponentBar;
    JLabel playerSprite, opponentSprite, playerName, opponentName, playerLv, opponentLv, playerHP;
    AnimatedLabel message;
    JButton fightButton, pokemonButton, runButton;
    List<JButton> actualButtons;

    public FightMenu(Team playerTeam, Team opponentTeam) {
        super(null);
        actualButtons = new ArrayList<>();
        battle = new Battle(playerTeam, opponentTeam);

        PokemonImpl playerPokemon = battle.getPlayerPokemon();
        PokemonImpl opponentPokemon = battle.getOpponentPokemon();

        playerBar = new CustomBar(0, playerPokemon.getHp(), Color.decode("#6adaaa"), Color.decode("#dac26a"), Color.decode("#da6a6a"));
        playerBar.setBounds(650, 298, 162, 12);
        playerBar.setValue(playerPokemon.getHp());

        opponentBar = new CustomBar(0, opponentPokemon.getHp(), Color.decode("#6adaaa"), Color.decode("#dac26a"), Color.decode("#da6a6a"));
        opponentBar.setBounds(245, 109, 162, 12);
        opponentBar.setValue(opponentPokemon.getHp());

        playerSprite = new JLabel(Utils.resize(playerPokemon.getBackSprite(), 192, 192));
        playerSprite.setBounds(150, 190, 192, 192);

        opponentSprite = new JLabel(Utils.resize(opponentPokemon.getFrontSprite(), 192, 192));
        opponentSprite.setBounds(560, 50, 192, 192);

        playerName = new JLabel(playerPokemon.getDisplayName().toUpperCase());
        playerName.setFont(Utils.getFont("files\\BattleFont.ttf", 36));
        playerName.setBounds(543, 258, 140, 25);

        opponentName = new JLabel(opponentPokemon.getDisplayName().toUpperCase());
        opponentName.setFont(Utils.getFont("files\\BattleFont.ttf", 36));
        opponentName.setBounds(138, 69, 140, 25);

        playerLv = new JLabel("<html><b>Lv1</b></html>");
        playerLv.setFont(Utils.getFont("files\\BattleFont.ttf", 26));
        playerLv.setBounds(725, 260, 86, 25);
        playerLv.setHorizontalAlignment(SwingConstants.CENTER);

        opponentLv = new JLabel("<html><b>Lv1</b></html>");
        opponentLv.setFont(Utils.getFont("files\\BattleFont.ttf", 26));
        opponentLv.setBounds(323, 69, 86, 25);
        opponentLv.setHorizontalAlignment(SwingConstants.CENTER);

        playerHP = new JLabel("<html><b>%s / %s</b></html>".formatted(playerPokemon.getHp(), playerPokemon.getHp()));
        playerHP.setFont(Utils.getFont("files\\BattleFont.ttf", 26));
        playerHP.setBounds(725, 315, 86, 25);
        playerHP.setHorizontalAlignment(SwingConstants.CENTER);

        message = new AnimatedLabel("<html>ARBOK è strafatto di codeina, non è proprio in grado di attaccare brother.</html>");
        message.setFont(Utils.getFont("files\\BattleFont.ttf", 36));
        message.setForeground(Color.WHITE);
        message.setBounds(35, 385, 695, 100);

        fightButton = new CustomButton(new ImageIcon(Utils.getURL("files\\battle\\fight.png")), 735, 389, 130, 46);
        fightButton.setPressedIcon(new ImageIcon(Utils.getURL("files\\battle\\fight_pressed.png")));
        fightButton.addActionListener(e -> {
            message.setVisible(false);

            for (JButton actualButton : actualButtons)
                remove(actualButton);

            actualButtons.clear();
            for (int i = 0; i < 4; i++) {
                JButton button = new CustomButton(new ImageIcon(Utils.getURL("files\\battle\\move.png")), 35 + (340 * (i < 2 ? i : i - 2)), i < 2 ? 389 : 435, 340, 46);
                button.setPressedIcon(new ImageIcon(Utils.getURL("files\\battle\\move_pressed.png")));
                button.setFont(Utils.getFont("files\\BattleFont.ttf", 26));
                button.setForeground(Color.WHITE);

                if (i < playerPokemon.getMoves().size()) {
                    MoveTypes moveType = playerPokemon.getMoves().get(i).getMoveType();
                    button.setText(moveType.getDisplayName());
                    button.setHorizontalTextPosition(SwingConstants.CENTER);
                    button.add(new JLabel(moveType.getType().getTag(40)));
                } else
                    button.setEnabled(false);

                actualButtons.add(button);
                add(button);
            }

            repaint();
        });

        pokemonButton = new CustomButton(new ImageIcon(Utils.getURL("files\\battle\\pokemon.png")), 735, 435, 130, 46);
        pokemonButton.setPressedIcon(new ImageIcon(Utils.getURL("files\\battle\\pokemon_pressed.png")));
        pokemonButton.addActionListener(e -> {
            message.setVisible(false);

            for (JButton actualButton : actualButtons)
                remove(actualButton);

            actualButtons.clear();
            for (int i = 0; i < 6; i++) {
                JButton button = new CustomButton(new ImageIcon(Utils.getURL("files\\battle\\pokemon_swap.png")), 35 + (226 * (i < 3 ? i : i - 3)), i < 3 ? 389 : 435, 226, 46);
                button.setPressedIcon(new ImageIcon(Utils.getURL("files\\battle\\pokemon_swap_pressed.png")));
                button.setFont(Utils.getFont("files\\BattleFont.ttf", 26));
                button.setForeground(Color.WHITE);

                if (i < battle.getPlayerTeam().size()) {
                    button.setText(battle.getPlayerTeam().getPokemons().get(i).getDisplayName());
                    button.setHorizontalTextPosition(SwingConstants.CENTER);
                    button.add(new JLabel(Types.NORMAL.getTag(40)));
                } else
                    button.setEnabled(false);

                actualButtons.add(button);
                add(button);
            }

            repaint();
        });

        runButton = new CustomButton(new ImageIcon(Utils.getURL("files\\battle\\run.png")), 865, 389, 46, 92);
        runButton.setPressedIcon(new ImageIcon(Utils.getURL("files\\battle\\run_pressed.png")));
        runButton.addActionListener(e -> {
            if (message.isAppearingText())
                return;

            for (JButton actualButton : actualButtons)
                remove(actualButton);

            actualButtons.clear();

            Utils.playSound("files\\sounds\\swish.wav");
            message.setVisible(true);
            message.appearTextAndExecute("Hai abbandonato lo scontro (speriamo per sempre figa, hai rotto).", () -> {
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
