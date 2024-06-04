package gui;

import util.Utils;

import javax.swing.*;
import java.util.Arrays;

public class Application extends JFrame {
    private static Application instance;

    /**
     * Inizializza l'applicazione
     */
    public Application() {
        super("JPokeBattle");
        pack();

        setIconImages(Arrays.asList(new ImageIcon(Utils.getURL("files\\logos\\Logo16.png")).getImage(),
                new ImageIcon(Utils.getURL("files\\logos\\Logo64.png")).getImage()));

        setLayout(null);
        setContentPane(new StartMenu());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(960, 540);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        instance = this;
    }

    /**
     * Ottieni l'istanza attiva dell'applicazione
     *
     * @return istanza dell'applicazione
     */
    public static Application getInstance() {
        return instance;
    }
}
