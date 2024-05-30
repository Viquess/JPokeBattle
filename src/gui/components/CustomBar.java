package gui.components;

import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomBar extends JProgressBar {
    private boolean isDecrementing = false;

    public CustomBar(int min, int max, Color start, Color mid, Color end) {
        super(min, max);
        setBorderPainted(false);
        setUI(new CustomBarUI());

        addChangeListener(e -> {
            int r, g, b;
            float ratio = (float) getValue() / max;

            if (ratio > 0.5) {
                r = (int) (mid.getRed() + (start.getRed() - mid.getRed()) * (ratio - 0.5) * 2);
                g = (int) (mid.getGreen() + (start.getGreen() - mid.getGreen()) * (ratio - 0.5) * 2);
                b = (int) (mid.getBlue() + (start.getBlue() - mid.getBlue()) * (ratio - 0.5) * 2);
            } else {
                r = (int) (end.getRed() + (mid.getRed() - end.getRed()) * ratio * 2);
                g = (int) (end.getGreen() + (mid.getGreen() - end.getGreen()) * ratio * 2);
                b = (int) (end.getBlue() + (mid.getBlue() - end.getBlue()) * ratio * 2);
            }

            setForeground(new Color(r, g, b));
        });
    }

    public void decrement(int quantity) {
        if (isDecrementing)
            return;

        isDecrementing = true;
        Timer timer = new Timer(16, new ActionListener() {
            int count = quantity;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count == 0) {
                    ((Timer) e.getSource()).stop();
                    isDecrementing = false;
                    return;
                }

                count--;
                setValue(getValue() - 1);
            }
        });

        timer.start();
    }

    private static class CustomBarUI extends BasicProgressBarUI {

        @Override
        protected void paintDeterminate(Graphics g, JComponent c) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            Insets insets = progressBar.getInsets();
            int width = progressBar.getWidth() - insets.left - insets.right;
            int height = progressBar.getHeight() - insets.top - insets.bottom;

            int arc = 6;
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
