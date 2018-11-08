import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i % 2) == 0 && (j % 2) == 0) {
                    board(graphics, i * (WIDTH / 8), j * (HEIGHT / 8), WIDTH / 8);
                } else if ((i % 2) != 0 && (j % 2) != 0) {
                    board(graphics, i * (WIDTH / 8), j * (HEIGHT / 8), WIDTH / 8);
                }
            }
        }
    }

        public static void board(Graphics graphics, int x, int y, int size) {

            graphics.setColor(Color.BLACK);
            graphics.fillRect(x,y,size,size);


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