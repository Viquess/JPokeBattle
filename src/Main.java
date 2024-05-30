import gui.Application;
import objects.impl.*;
import util.Utils;

import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.io.IOException;
import java.io.InputStream;

public class Main {

    public static void main(String[] args) throws IOException, FontFormatException {
        registerPokemons();

        InputStream isFont = Main.class.getClassLoader().getResourceAsStream("files\\PokemonFont.ttf");
        InputStream isBattleFont = Main.class.getClassLoader().getResourceAsStream("files\\BattleFont.ttf");
        if (isFont != null && isBattleFont != null) {
            FontUIResource font = new FontUIResource(Font.createFont(Font.TRUETYPE_FONT, isFont));
            FontUIResource battleFont = new FontUIResource(Font.createFont(Font.TRUETYPE_FONT, isBattleFont));
            Utils.registerFonts(font, battleFont);
            Utils.setUIFont(new FontUIResource(font.deriveFont(12f)));
        }

        new Application();
    }

    /**
     * Registra tutti i tipi di Pokemon
     */
    private static void registerPokemons() {
        new Arbok().register();
        new Bulbasaur().register();
        new Charmander().register();
        new Gengar().register();
        new Lapras().register();
        new Meowth().register();
        new Ninetales().register();
        new Pidgeot().register();
        new Raichu().register();
        new Rapidash().register();
        new Squirtle().register();
        new Umbreon().register();
    }
}