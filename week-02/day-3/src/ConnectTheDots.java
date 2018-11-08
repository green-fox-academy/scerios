import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {

    public static void mainDraw(Graphics graphics) {
        int[][] box = {
                {10, 10},
                {290, 10},
                {290, 290},
                {10, 290},
        };
        int[][] fox = {
                {50, 100},
                {70, 70},
                {80, 90},
                {90, 90},
                {100, 70},
                {120, 100},
                {85, 130},
                {50, 100}
        };
        greenBox(graphics, fox);
        greenBox(graphics, box);
    }

    public static void greenBox(Graphics graphics, int[][] box) {
        int[] x = new int[box.length];
        int[] y = new int[box.length];
        for (int i = 0; i < box.length; i++) {
                x[i] = box[i][0];
                y[i] = box[i][1];

        }
        graphics.setColor(Color.GREEN);
        graphics.drawPolygon(x, y, box.length);
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