import gui.Application;
import objects.impl.Bulbasaur;
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
        new Bulbasaur().register();
    }
}