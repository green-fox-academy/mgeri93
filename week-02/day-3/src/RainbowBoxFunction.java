import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;



public class RainbowBoxFunction {
  public static void squareDrawer(int x, Color fillColor ,Graphics graphics) {
   // fillColor = fillColor.toUpperCase();
    graphics.setColor(fillColor);
    graphics.fillRect((WIDTH - x) /2,(HEIGHT -x) /2, x,x);
  }
  public static void mainDraw(Graphics graphics) {
    // Create a square drawing function that takes 3 parameters:
    // The square size, the fill color, graphics
    // and draws a square of that size and color to the center of the canvas.
    // Create a loop that fills the canvas with rainbow colored squares.


    for (int i = WIDTH ; i >= 100; i -= 200){
      squareDrawer( i , new Color(((int)(Math.random()*256)),((int)(Math.random()*256)),((int)(Math.random()*256))), graphics);
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