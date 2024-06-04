package gui.components;

import javax.swing.*;
import javax.swing.plaf.basic.BasicProgressBarUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedBar extends JProgressBar {
    private Timer timer;

    /**
     * Istanzia una nuova AnimatedBar
     *
     * @param min   Valore minimo
     * @param max   Valore massimo
     * @param start Colore quando la AnimatedBar è al 100%
     * @param mid   Colore quando la AnimatedBar è al 50$
     * @param end   Colore quando la AnimatedBar è allo 0%
     */
    public AnimatedBar(int min, int max, Color start, Color mid, Color end) {
        super(min, max);

        setBorderPainted(false);
        setUI(new AnimatedBarUI());

        addChangeListener(e -> {
            int r, g, b;
            float ratio = (float) getValue() / getMaximum();

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

    /**
     * Resetta la AnimatedBar
     * @param value Valore da impostare
     * @param max Valore massimo da impostare
     */
    public void resetBar(int value, int max) {
        setMaximum(max);
        setValue(max);
        decrement(max - value);
    }

    /**
     * Decrementa la AnimatedBar di una certa quantità
     * @param quantity Quantità da decrementare
     */
    public void decrement(int quantity) {
        if (quantity == 0)
            return;

        if (timer != null)
            timer.stop();

        timer = new Timer(350 / quantity, new ActionListener() {
            int count = quantity;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count == 0) {
                    timer.stop();
                    timer = null;
                    return;
                }

                count--;
                setValue(getValue() - 1);
            }
        });

        timer.start();
    }

    /**
     * UI della AnimatedBar
     */
    private static class AnimatedBarUI extends BasicProgressBarUI {

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
