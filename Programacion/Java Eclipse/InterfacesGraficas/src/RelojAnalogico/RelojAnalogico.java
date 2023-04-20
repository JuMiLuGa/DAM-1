package RelojAnalogico;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class RelojAnalogico extends JFrame {

	private static final long serialVersionUID = 1L;
	private RelojPanel relojPanel;

    public RelojAnalogico() {
        // Configurar la ventana del reloj
        setTitle("Reloj Analógico");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Crear el panel del reloj
        relojPanel = new RelojPanel();
        add(relojPanel, BorderLayout.CENTER);

        // Iniciar el temporizador para actualizar la hora cada segundo
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                relojPanel.repaint();
            }
        });
        timer.start();

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private class RelojPanel extends JPanel {

		private static final long serialVersionUID = 1L;
		private int radio = 100;
        private int centroX = radio;
        private int centroY = radio;

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            // Obtener la hora actual
            Calendar calendario = new GregorianCalendar();
            int hora = calendario.get(Calendar.HOUR);
            int minuto = calendario.get(Calendar.MINUTE);
            int segundo = calendario.get(Calendar.SECOND);

            // Dibujar el fondo del reloj
            g.setColor(Color.WHITE);
            g.fillOval(centroX - radio, centroY - radio, radio * 2, radio * 2);

            // Dibujar los números del reloj
            g.setColor(Color.BLACK);
            g.setFont(new Font("Arial", Font.BOLD, 18));
            for (int i = 1; i <= 12; i++) {
                double angulo = Math.toRadians(30 * (i - 3));
                int x = centroX + (int) (Math.cos(angulo) * (radio - 20));
                int y = centroY + (int) (Math.sin(angulo) * (radio - 20));
                g.drawString(Integer.toString(i), x, y);
            }

            // Dibujar la aguja de las horas
            double anguloHoras = Math.toRadians((hora * 30) - 90);
            int xHora = centroX + (int) (Math.cos(anguloHoras) * (radio - 50));
            int yHora = centroY + (int) (Math.sin(anguloHoras) * (radio - 50));
            g.setColor(Color.BLACK);
            g.drawLine(centroX, centroY, xHora, yHora);

            // Dibujar la aguja de los minutos
            double anguloMinutos = Math.toRadians((minuto * 6) - 90);
            int xMinuto = centroX + (int) (Math.cos(anguloMinutos) * (radio - 30));
            int yMinuto = centroY + (int) (Math.sin(anguloMinutos) * (radio - 30));
            g.setColor(Color.BLACK);
            g.drawLine(centroX, centroY, xMinuto, yMinuto);
            // Dibujar la aguja de los segundos
            double anguloSegundos = Math.toRadians((segundo * 6) - 90);
            int xSegundo = centroX + (int) (Math.cos(anguloSegundos) * (radio - 10));
            int ySegundo = centroY + (int) (Math.sin(anguloSegundos) * (radio - 10));
            g.setColor(Color.RED);
            g.drawLine(centroX, centroY, xSegundo, ySegundo);

            // Dibujar el centro del reloj
            g.setColor(Color.BLACK);
            g.fillOval(centroX - 5, centroY - 5, 10, 10);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new RelojAnalogico();
            }
        });
    }
}
