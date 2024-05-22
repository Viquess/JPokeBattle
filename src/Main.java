import lombok.SneakyThrows;
import objects.impl.Bulbasaur;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
import java.awt.*;
import java.io.InputStream;
import java.net.URL;

public class Main {
    private static JFrame frame;

    @SneakyThrows
    public static void main(String[] args) {
        registerPokemons();

        InputStream is = Main.class.getClassLoader().getResourceAsStream("files/PokemonFont.ttf");
        if (is != null)
            setUIFont(new FontUIResource(Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(12f)));

        frame = new JFrame("JPokeBattle");
        frame.pack();

        URL icon = Main.class.getResource("files/Logo.png");
        if (icon != null)
            frame.setIconImage(new ImageIcon(icon).getImage());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(new Dimension(700, 400));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
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