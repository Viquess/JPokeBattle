import util.Datas;

import javax.swing.*;

public class Menu {
    private JButton start;
    private JLabel title;
    private JPanel panel;

    public Menu() {
        start.addActionListener(e -> {
            System.out.println(Datas.getPokemons());
            System.exit(0);
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}
