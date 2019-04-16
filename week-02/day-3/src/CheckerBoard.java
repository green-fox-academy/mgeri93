import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class CheckerBoard {
  public static void mainDraw(Graphics graphics) {

    int row;
    int col;
    int x,y;

    for ( row = 0;  row < WIDTH/20;  row++ ) {
      for ( col = 0;  col < HEIGHT/20;  col++) {
        x = col * 20;
        y = row * 20;
        if ( (row % 2) == (col % 2) ) {
          graphics.fillRect(x, y, 20, 20);
        }
      }

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
