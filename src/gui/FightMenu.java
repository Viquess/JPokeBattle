package gui;

import gui.components.CustomBar;
import objects.Battle;
import objects.PokemonImpl;
import objects.Team;
import util.Utils;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.IOException;

public class FightMenu extends JPanel {
    private Battle battle;
    CustomBar playerBar, opponentBar;
    JLabel playerSprite, opponentSprite, playerName, opponentName, playerLv, opponentLv, playerHP, message;

    public FightMenu(Team playerTeam, Team opponentTeam) {
        super(null);
        battle = new Battle(playerTeam, opponentTeam);

        PokemonImpl playerPokemon = battle.getPlayerPokemon();
        PokemonImpl opponentPokemon = battle.getOpponentPokemon();

        playerBar = new CustomBar(0, playerPokemon.getHp(), Color.decode("#6adaaa"), Color.decode("#dac26a"), Color.decode("#da6a6a"));
        playerBar.setBounds(650, 299, 161, 11);
        playerBar.setValue(playerPokemon.getHp());

        opponentBar = new CustomBar(0, opponentPokemon.getHp(), Color.decode("#6adaaa"), Color.decode("#dac26a"), Color.decode("#da6a6a"));
        opponentBar.setBounds(245, 110, 161, 11);
        opponentBar.setValue(opponentPokemon.getHp());

        playerSprite = new JLabel(Utils.resize(playerPokemon.getBackSprite(), 192, 192));
        playerSprite.setBounds(150, 190, 192, 192);

        opponentSprite = new JLabel(Utils.resize(opponentPokemon.getFrontSprite(), 192, 192));
        opponentSprite.setBounds(560, 50, 192, 192);

        playerName = new JLabel(playerPokemon.getDisplayName().toUpperCase());
        playerName.setFont(Utils.getFont("files\\BattleFont.ttf", 36));
        playerName.setBounds(540, 258, 140, 25);

        opponentName = new JLabel(opponentPokemon.getDisplayName().toUpperCase());
        opponentName.setFont(Utils.getFont("files\\BattleFont.ttf", 36));
        opponentName.setBounds(138, 69, 140, 25);

        playerLv = new JLabel("<html><b>Lv1</b></html>");
        playerLv.setFont(Utils.getFont("files\\BattleFont.ttf", 26));
        playerLv.setBounds(725, 260, 85, 25);
        playerLv.setHorizontalAlignment(SwingConstants.CENTER);

        opponentLv = new JLabel("<html><b>Lv1</b></html>");
        opponentLv.setFont(Utils.getFont("files\\BattleFont.ttf", 26));
        opponentLv.setBounds(323, 69, 85, 25);
        opponentLv.setHorizontalAlignment(SwingConstants.CENTER);

        playerHP = new JLabel("<html><b>%s / %s</b></html>".formatted(playerPokemon.getHp(), playerPokemon.getHp()));
        playerHP.setFont(Utils.getFont("files\\BattleFont.ttf", 26));
        playerHP.setBounds(725, 315, 85, 25);
        playerHP.setHorizontalAlignment(SwingConstants.CENTER);

        message = new JLabel("<html>Seleziona la prossima mossa.</html>");
        message.setFont(Utils.getFont("files\\BattleFont.ttf", 36));
        message.setForeground(Color.WHITE);
        message.setBounds(35, 385, 700, 100);

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
