import gui.Application;
import lombok.SneakyThrows;
import objects.impl.Bulbasaur;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.io.InputStream;

public class Main {

    @SneakyThrows
    public static void main(String[] args) {
        registerPokemons();

        InputStream is = Main.class.getClassLoader().getResourceAsStream("files/PokemonFont.ttf");
        if (is != null)
            setUIFont(new FontUIResource(Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(12f)));

        new Application();
    }

    private static void registerPokemons() {
        new Bulbasaur().register();
    }

    public static void setUIFont(FontUIResource font) {
        UIManager.getDefaults().keys().asIterator().forEachRemaining(k -> {
            if (UIManager.get(k) instanceof FontUIResource)
                UIManager.put(k, font);
        });
    }
}