import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import util.Datas;

import javax.swing.*;

public class Menu {
    private JButton start;
    private JLabel title;
    private JPanel panel;

    public Menu() {
        panel.setOpaque(false);
        start.addActionListener(e -> {
            Main.switchMode();
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}
