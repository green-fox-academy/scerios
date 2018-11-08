import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i <= WIDTH / 20; i++) {
            for (int j = 0; j <= HEIGHT / 20; j++) {
                if ((i == 0 || j == 0) || ((i == WIDTH / 20) || (j == HEIGHT / 20))) {
                    drawLineZ(graphics, i * 20, j * 20);
                }
            }
        }
    }

    public static void drawLineZ(Graphics graphics, int x, int y) {
        graphics.drawLine(x , y, WIDTH / 2, HEIGHT / 2);
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