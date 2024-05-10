import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import lombok.Getter;
import lombok.SneakyThrows;
import objects.impl.Bulbasaur;

import javax.swing.*;

public class Main {
    @Getter
    private static JFrame frame;
    private static boolean lightMode = true;

    @SneakyThrows
    public static void main(String[] args) {
        registerPokemons();
        FlatLightLaf.setup();
        FlatDarkLaf.setup();

        UIManager.setLookAndFeel(new FlatLightLaf());

        frame = new JFrame("JPokeBattle");
        frame.setResizable(false);
        frame.setContentPane(new Menu().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void registerPokemons() {
        new Bulbasaur().register();
    }

    @SneakyThrows
    public static void switchMode() {
        UIManager.setLookAndFeel(lightMode ? new FlatDarkLaf() : new FlatLightLaf());
        SwingUtilities.updateComponentTreeUI(Main.getFrame());
        lightMode = !lightMode;
    }
}