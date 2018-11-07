import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {

    public static void mainDraw(Graphics graphics){
        for (int i = 0; i < 3; i++) {
            int startX = (int)(Math.random() * (WIDTH - 50));
            int startY = (int)(Math.random() * (HEIGHT - 50));
            drawSquare(graphics, startX, startY);
        }
    }
    public static void drawSquare(Graphics graphics, int startX, int startY) {
        graphics.drawRect(startX, startY, 50, 50);
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