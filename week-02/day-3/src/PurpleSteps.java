import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 200; i += 15) {
            int size = i;
            purpleSquare(graphics, size);
        }
    }
    public static void purpleSquare(Graphics graphics, int size) {
        int sum = (WIDTH + HEIGHT) / 2;
        graphics.setColor(new Color(186, 85, 211));
        graphics.fillRect(15 + size, 15 + size, 15, 15);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(15 + size, 15 + size, 15, 15);

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