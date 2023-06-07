package EjerciciosInterfacesGraficas;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio5v2 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel[][] pixels;
	private int[] colorCounters = new int[6];
	private JLabel[] colorLabels = new JLabel[6];

	public Ejercicio5v2() {
		super("Pixel Panel");

		// configurar el panel principal
		JPanel mainPanel = new JPanel(new GridLayout(50, 50));
		pixels = new JPanel[50][50];
		for (int i = 0; i < 50; i++) {
			for (int j = 0; j < 50; j++) {
				JPanel pixel = new JPanel();
				pixel.setBackground(Color.WHITE);
				pixel.addMouseListener(new PixelClickListener(pixel));
				mainPanel.add(pixel);
				pixels[i][j] = pixel;
			}
		}
		add(mainPanel);

		// configurar los contadores de color
		JPanel countPanel = new JPanel(new GridLayout(6, 2));
		countPanel.add(new JLabel("Rojo:"));
		colorLabels[0] = new JLabel("0");
		countPanel.add(colorLabels[0]);
		countPanel.add(new JLabel("Verde:"));
		colorLabels[1] = new JLabel("0");
		countPanel.add(colorLabels[1]);
		countPanel.add(new JLabel("Azul:"));
		colorLabels[2] = new JLabel("0");
		countPanel.add(colorLabels[2]);
		countPanel.add(new JLabel("Negro:"));
		colorLabels[3] = new JLabel("0");
		countPanel.add(colorLabels[3]);
		countPanel.add(new JLabel("Blanco:"));
		colorLabels[4] = new JLabel("2500");
		countPanel.add(colorLabels[4]);
		countPanel.add(new JLabel("Otros:"));
		colorLabels[5] = new JLabel("0");
		countPanel.add(colorLabels[5]);
		add(countPanel, "South");

		// configurar la ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 550);
		setVisible(true);
	}

	private void updateColorCounters(Color color, int delta) {
	    if (color.equals(Color.RED)) {
	        colorCounters[0] += delta;
	    } else if (color.equals(Color.GREEN)) {
	        colorCounters[1] += delta;
	    } else if (color.equals(Color.BLUE)) {
	        colorCounters[2] += delta;
	    } else if (color.equals(Color.BLACK)) {
	        colorCounters[3] += delta;
	    } else if (color.equals(Color.WHITE)) {
	        colorCounters[4] -= delta; // resta en lugar de sumar
	    } else {
	        colorCounters[5] += delta;
	    }
	    for (int i = 0; i < 6; i++) {
	        colorLabels[i].setText(Integer.toString(colorCounters[i]));
	    }
	}

	private class PixelClickListener extends MouseAdapter {

		private JPanel pixel;

		public PixelClickListener(JPanel pixel) {
			this.pixel = pixel;
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			JPanel pixel = (JPanel) e.getComponent();
			if (e.getButton() == MouseEvent.BUTTON1) { // clic izquierdo
				Color oldColor = pixel.getBackground();
				Color newColor;
				if (oldColor.equals(Color.RED)) {
					newColor = Color.GREEN;
				} else if (oldColor.equals(Color.GREEN)) {
					newColor = Color.BLUE;
				} else {
					newColor = Color.RED;
				}
				pixel.setBackground(newColor);
				updateColorCounters(oldColor, -1);
				updateColorCounters(newColor, 1);
			} else if (e.getButton() == MouseEvent.BUTTON3) { // clic derecho
				Color oldColor = pixel.getBackground();
				Color newColor;
				if (oldColor.equals(Color.BLACK)) {
					newColor = Color.WHITE;
				} else {
					newColor = Color.BLACK;
				}
				pixel.setBackground(newColor);
				updateColorCounters(oldColor, -1);
				updateColorCounters(newColor, 1);
			}
		}
	}

	public static void main(String[] args) {
		new Ejercicio5v2();
	}

}
