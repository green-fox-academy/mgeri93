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


    for (int i = 1 ; i < 50; i++){
      if ((int)(Math.random()*10) == 0) {
        graphics.setColor(Color.BLUE);
      } else if ((int)(Math.random()*7) == 1) {
        graphics.setColor(Color.RED);
      }else if ((int)(Math.random()*7) == 2) {
        graphics.setColor(Color.GREEN);
      }else if ((int)(Math.random()*7) == 3) {
        graphics.setColor(Color.YELLOW);
      }else if ((int)(Math.random()*7) == 4) {
        graphics.setColor(Color.CYAN);
      }else if ((int)(Math.random()*7) == 5) {
        graphics.setColor(Color.ORANGE);
      }else if ((int)(Math.random()*7) == 6) {
        graphics.setColor(new Color(110,10,255));
      }
      squareDrawer((int)(Math.random() * 1920), (int)(Math.random() * 1080), graphics);
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

}    /*for (int i = 1 ; i < 50; i++){
        if ((int)(Math.random()*10) == 0) {
        graphics.setColor(Color.BLUE);
        } else if ((int)(Math.random()*10) == 1) {
        graphics.setColor(Color.RED);
        }else if ((int)(Math.random()*10) == 2) {
        graphics.setColor(Color.GREEN);
        }else if ((int)(Math.random()*10) == 3) {
        graphics.setColor(Color.YELLOW);
        }else if ((int)(Math.random()*10) == 4) {
        graphics.setColor(Color.CYAN);
        }else if ((int)(Math.random()*10) == 5) {
        graphics.setColor(Color.ORANGE);
        }else if ((int)(Math.random()*10) == 6) {
        graphics.setColor(new Color(110,10,255));
        }*/