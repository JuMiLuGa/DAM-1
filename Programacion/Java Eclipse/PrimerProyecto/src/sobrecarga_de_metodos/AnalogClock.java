package sobrecarga_de_metodos;

import java.awt.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;

public class AnalogClock extends JPanel {
  private int hour;
  private int minute;
  private int second;

  public AnalogClock() {
    setCurrentTime();
  }

  public void setCurrentTime() {
    Calendar calendar = new GregorianCalendar();

    hour = calendar.get(Calendar.HOUR_OF_DAY);
    minute = calendar.get(Calendar.MINUTE);
    second = calendar.get(Calendar.SECOND);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);

    // Dibuja el reloj
    g.setColor(Color.black);
    g.drawOval(10, 10, 200, 200);
    g.drawString("12", 110, 25);
    g.drawString("9", 8, 115);
    g.drawString("3", 210, 115);
    g.drawString("6", 110, 208);

    // Calcula las posiciones de las manecillas del reloj
    int sLength = (int)(100 * 0.8);
    int mLength = (int)(100 * 0.65);
    int hLength = (int)(100 * 0.5);

    int sX = 110 + (int)(sLength * Math.sin(second * (2 * Math.PI / 60)));
    int sY = 110 - (int)(sLength * Math.cos(second * (2 * Math.PI / 60)));
    int mX = 110 + (int)(mLength * Math.sin(minute * (2 * Math.PI / 60)));
    int mY = 110 - (int)(mLength * Math.cos(minute * (2 * Math.PI / 60)));
    int hX = 110 + (int)(hLength * Math.sin((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));
    int hY = 110 - (int)(hLength * Math.cos((hour % 12 + minute / 60.0) * (2 * Math.PI / 12)));

    // Dibuja las manecillas del reloj
    g.setColor(Color.red);
    g.drawLine(110, 110, sX, sY);
    g.setColor(Color.blue);
    g.drawLine(110, 110, mX, mY);
    g.setColor(Color.green);
    g.drawLine(110, 110, hX, hY);
  }

  public static void main(String[] args) {
    JFrame frame = new JFrame();
    AnalogClock clock = new AnalogClock();

    frame.setContentPane(clock);
    frame.setSize(300, 300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    while (true) {
      try {Thread.sleep(1000);
      } catch (InterruptedException e) {}

      clock.setCurrentTime();
      clock.repaint();
    }
  }
}

