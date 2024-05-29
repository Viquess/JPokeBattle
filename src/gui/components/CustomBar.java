package gui.components;

import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;

public class CustomBar extends JProgressBar {

    public CustomBar(int min, int max, Color start, Color end) {
        super(min, max);
        setUI(new CustomBarUI());
        setBackground(new Color(0, 0, 0, 0));
        setForeground(Color.decode("#da6a6a"));

        addChangeListener(e -> {
            int red = (start.getRed() * getValue() / 100) + (end.getRed() * (100 - getValue()) / 100);
            int green = (start.getGreen() * getValue() / 100) + (end.getGreen() * (100 - getValue()) / 100);
            int blue = (start.getBlue() * getValue() / 100) + (end.getBlue() * (100 - getValue()) / 100);

            setForeground(new Color(red, green, blue));
        });
    }

    private class CustomBarUI extends BasicProgressBarUI {
        private int arc = 6;

        @Override
        protected void paintDeterminate(Graphics g, JComponent c) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            Insets insets = progressBar.getInsets();
            int width = progressBar.getWidth() - insets.left - insets.right;
            int height = progressBar.getHeight() - insets.top - insets.bottom;

            g2d.setColor(progressBar.getBackground());
            g2d.fillRoundRect(insets.left, insets.top, width, height, arc, arc);

            int progressWidth = (int) ((width / (float) progressBar.getMaximum()) * progressBar.getValue());
            g2d.setColor(progressBar.getForeground());
            g2d.fillRoundRect(insets.left, insets.top, progressWidth, height, arc, arc);
        }

        @Override
        protected void paintIndeterminate(Graphics g, JComponent c) {
            super.paintIndeterminate(g, c);
        }
    }
}
