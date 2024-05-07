import objects.impl.Bulbasaur;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        registerPokemons();

        JFrame frame = new JFrame("JPokeBattle");
        frame.setContentPane(new Menu().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void registerPokemons() {
        new Bulbasaur().register();
    }
}