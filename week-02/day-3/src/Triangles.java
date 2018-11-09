import javax.swing.*;
import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {

    public static void mainDraw(Graphics graphics) {
        int grow = 10;
        int growSide = 0;
        for (int i = 0; i <= 152; i += 8) {
            drawTriangle(graphics, (WIDTH / 2) - i, 110 + grow, (WIDTH / 2) + i, 110 + grow);
            drawTriangle(graphics, 8 + (i * 2), 310,8 + i, 310 - growSide);
            drawTriangle(graphics, 312 - (i * 2), 310,312 - i, 310 - growSide);
            grow += 10;
            growSide += 10;
        }

    }

    public static void drawTriangle(Graphics graphics, int x, int y, int z, int n) {
        graphics.drawLine(x, y, z, n);
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