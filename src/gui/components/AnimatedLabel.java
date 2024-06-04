package gui.components;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimatedLabel extends JLabel {
    private Timer timer;

    public AnimatedLabel() {
        super();
    }

    public AnimatedLabel(ImageIcon icon) {
        super(icon);
    }

    public void appearText(String text) {
        if (timer != null)
            timer.stop();

        setText("");
        setVisible(true);

        timer = new Timer(16, new ActionListener() {
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
        if (timer != null)
            timer.stop();

        setText("");
        setVisible(true);

        timer = new Timer(16, new ActionListener() {
            int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count == text.length() + 20) {
                    ((Timer) e.getSource()).stop();
                    runnable.run();
                } else if (count < text.length())
                    setText("<html>" + text.substring(0, ++count) + "</html>");
                else
                    count++;
            }
        });

        timer.start();
    }

    public void setLocation(int x, int y, int frames, int delay, Runnable runnable) {
        Point oldPoint = new Point(getLocation().x, getLocation().y);
        Point animFrame = new Point((x - oldPoint.x) / frames, (y - oldPoint.y) / frames);

        new Timer(delay, new ActionListener() {
            int actualFrame = 0;

            public void actionPerformed(ActionEvent e) {
                setLocation(oldPoint.x + (animFrame.x * actualFrame), oldPoint.y + (animFrame.y * actualFrame));

                if (actualFrame != frames)
                    actualFrame++;
                else {
                    ((Timer) e.getSource()).stop();
                    if (runnable != null)
                        runnable.run();
                }
            }
        }).start();
    }
}
