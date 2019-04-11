import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PositionSquare {
  public static void squareDrawer(int x, int y, Graphics graphics) {
    graphics.fillRect(x, y, 50, 50);
  }

  public static void mainDraw(Graphics graphics){
    // create a square drawing function that takes 3 parameters:
    // the x and y coordinates of the square's top left corner and the graphics
    // and draws a 50x50 square from that point.
    // draw 3 squares with that function.
    // avoid code duplication.

    for (int i = 1 ; i < 4; i++){

      squareDrawer((int)(Math.random() * 1900), (int)(Math.random() * 1000), graphics);
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