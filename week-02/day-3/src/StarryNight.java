import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        background(graphics);
        for (int i = 0; i < 300; i++) {
            int size = (int)((Math.random() * 10));
            int color = 102 + (int)((Math.random() * 102));
            int startX = (int)(Math.random() * (WIDTH - 5));
            int startY = (int)(Math.random() * (HEIGHT - 5));
            graphics.setColor(new Color(color, color, color));
            graphics.fillRect(startX, startY, size, size);

        }

        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
    }
    public static void background(Graphics graphics) {
        graphics.setColor(Color.BLACK);
        graphics.fillRect(0,0, WIDTH, HEIGHT);
    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}