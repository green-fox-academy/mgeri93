import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CenterBoxFunction {

    public static void squareDrawer(int x, Graphics graphics) {
      graphics.drawRect((WIDTH - x) /2,(HEIGHT -x) /2, x,x);
    }

    public static void mainDraw(Graphics graphics) {
      // create a square drawing function that takes 2 parameter:
      // the square size and the graphics
      // and draws a square of that size to the center of the canvas.
      // draw 3 squares with that function.
      // avoid code duplication.
      for (int i = 100; i < 400; i+= 100 ) {
        squareDrawer(i, graphics);
      }



    }

    // Don't touch the code below
    static int WIDTH = 1920;
    static int HEIGHT = 1080;

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
