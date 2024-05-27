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

        InputStream is = Main.class.getClassLoader().getResourceAsStream("files/PokemonFont.ttf");
        if (is != null)
            Utils.setUIFont(new FontUIResource(Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(12f)));

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