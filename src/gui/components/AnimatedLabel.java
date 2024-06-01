package gui.components;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedLabel extends JLabel {
    public AnimatedLabel(String text) {
        super(text);
    }

    public void appearText(String text) {
        setText("");

        Timer timer = new Timer(16, new ActionListener() {
            int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count == text.length()) {
                    ((Timer) e.getSource()).stop();
                    return;
                }

                setText("<html>" + text.substring(0, ++count) + "</html>");
            }
        });

        timer.start();
    }

    public void appearTextAndExecute(String text, Runnable runnable) {
        setText("");

        Timer timer = new Timer(16, new ActionListener() {
            int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count == text.length() + 20) {
                    ((Timer) e.getSource()).stop();
                    runnable.run();
                    return;
                } else if (count < text.length())
                    setText("<html>" + text.substring(0, ++count) + "</html>");
                else
                    count++;
            }
        });

        timer.start();
    }
}
