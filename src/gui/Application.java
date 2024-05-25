package gui;

import util.Utils;

import javax.swing.*;
import java.util.Arrays;

public class Application extends JFrame {

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
    }
}
