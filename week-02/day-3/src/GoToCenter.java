import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class GoToCenter {

    public static void mainDraw(Graphics graphics) {
        Random n = new Random();
        Random z = new Random();
        int low = 0;

        for (int i = 0; i < 3; i++) {
            int startingX = n.nextInt(WIDTH - low) + low;
            int startingY = z.nextInt(HEIGHT - low) + low;
            graphics.drawLine(startingX, startingY, HEIGHT / 2, WIDTH / 2);

        }




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