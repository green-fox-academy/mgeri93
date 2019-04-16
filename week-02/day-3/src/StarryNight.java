import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
  public static void squareDrawer(int x, int y, Graphics graphics) {
    graphics.fillRect(x, y, 20, 20);
  }
  public static void mainDraw(Graphics graphics) {
    // Draw the night sky:
    //  - The background should be black
    //  - The stars can be small squares
    //  - The stars should have random positions on the canvas
    //  - The stars should have random color (some shade of grey)

    for (int i = 1 ; i < 200; i++){
      if ((int)(Math.random()*7) == 0) {
        graphics.setColor(new Color(211,211,211));
      } else if ((int)(Math.random()*7) == 1) {
        graphics.setColor(new Color(220,220,220));
      }else if ((int)(Math.random()*7) == 2) {
        graphics.setColor(new Color(192,192,192));
      }else if ((int)(Math.random()*7) == 3) {
        graphics.setColor(new Color(169,169,169));
      }else if ((int)(Math.random()*7) == 4) {
        graphics.setColor(new Color(128,128,128));
      }else if ((int)(Math.random()*7) == 5) {
        graphics.setColor(new Color(112,128,144));
      }else if ((int)(Math.random()*7) == 6) {
        graphics.setColor(new Color(105,105,105));
      }
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
    panel.setBackground(Color.BLACK);
  }

  static class ImagePanel extends JPanel {
    @Override
    protected void paintComponent(Graphics graphics) {
      super.paintComponent(graphics);
      mainDraw(graphics);
    }
  }
}