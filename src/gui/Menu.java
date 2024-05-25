package gui;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Arrays;

public class Menu extends JFrame {
    public Menu() {
        super("JPokeBattle");
        pack();

        URL icon16 = Menu.class.getResource("../files/logos/Logo16.png");
        URL icon64 = Menu.class.getResource("../files/logos/Logo64.png");
        if (icon16 != null && icon64 != null)
            setIconImages(Arrays.asList(new ImageIcon(icon16).getImage(), new ImageIcon(icon64).getImage()));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(new Dimension(700, 400));
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
