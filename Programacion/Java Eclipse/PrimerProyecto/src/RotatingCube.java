import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class RotatingCube extends JFrame {
  private static final int WIDTH = 400;
  private static final int HEIGHT = 400;

  private double angleX = 0;
  private double angleY = 0;

  public RotatingCube() {
    setSize(WIDTH, HEIGHT);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setTitle("Rotating Cube");

    Timer timer = new Timer(30, new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        angleX += 0.2;
        angleY += 0.3;
        repaint();
      }
    });
    timer.start();
  }

  @Override
  public void paint(Graphics g) {
    super.paint(g);
    Graphics2D g2d = (Graphics2D)g;

    // Clear window
    g2d.clearRect(0, 0, WIDTH, HEIGHT);

    // Apply rotations
    g2d.rotate(angleX, WIDTH / 2, HEIGHT / 2);
    g2d.rotate(angleY, WIDTH / 2, HEIGHT / 2);

    // Draw cube
    g2d.setColor(Color.BLUE);
    g2d.fillRect(WIDTH / 2 - 50, HEIGHT / 2 - 50, 100, 100);
    g2d.setColor(Color.RED);
    g2d.fillRect(WIDTH / 2 - 50, HEIGHT / 2 - 150, 100, 100);
    g2d.setColor(Color.GREEN);
    g2d.fillRect(WIDTH / 2 - 150, HEIGHT / 2 - 50, 100, 100);
    g2d.setColor(Color.YELLOW);
    g2d.fillRect(WIDTH / 2 + 50, HEIGHT / 2 - 50, 100, 100);
    g2d.setColor(Color.MAGENTA);
    g2d.fillRect(WIDTH / 2 - 50, HEIGHT / 2 + 50, 100, 100);
    g2d.setColor(Color.CYAN);
    g2d.fillRect(WIDTH / 2 - 150, HEIGHT / 2 - 150, 100, 100);
  }

  public static void main(String[] args) {
    RotatingCube frame = new RotatingCube();
    frame.setVisible(true);
  }
}
