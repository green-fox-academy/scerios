import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar {

    public static void mainDraw(Graphics graphics) {
        int grow = 10;
            for (int j = 0; j <= 15; j++) {
                drawLine(graphics, grow, HEIGHT / 2, (WIDTH / 2), (HEIGHT / 2) + grow);
                drawLine(graphics, grow, HEIGHT / 2, (WIDTH / 2), (HEIGHT / 2) - grow);
                drawLine(graphics, WIDTH - grow, HEIGHT / 2, (WIDTH / 2), (HEIGHT / 2) - grow);
                drawLine(graphics, WIDTH - grow, HEIGHT / 2, (WIDTH / 2),(HEIGHT / 2) + grow);
                grow += 10;
            }
    }

    public static void drawLine(Graphics graphics, int x, int y, int z, int n) {
        graphics.setColor(Color.GREEN);
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