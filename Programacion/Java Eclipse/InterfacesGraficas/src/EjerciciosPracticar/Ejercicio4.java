package EjerciciosPracticar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio4 {

	public static void main(String[] args) {
		new VentanaEj4();
	}

}

class VentanaEj4 extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel pnlPrincipal;
	private int contadorBlancas = 0;
	private int contadorNegras = 0;

	
	private JLabel lblContadorBlancas;
	private JLabel lblContadorNegras;

	public VentanaEj4() {
		setTitle("Casillas pulsadas");
		setBounds(100, 10, 400, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		pnlPrincipal = new JPanel(new GridLayout(9, 9));
		for (int i = 1; i <= 81; i++) {
//            JPanel pnl = new JPanel();
			JLabel lbl = new JLabel("0");
//            pnl.add(lbl);
			lbl.setOpaque(true);
			lbl.setHorizontalAlignment(JLabel.CENTER);
			pnlPrincipal.add(lbl);
			if (i % 2 == 0) {
				lbl.setBackground(Color.BLACK);
				lbl.setForeground(Color.WHITE);
			} else {
				lbl.setBackground(Color.WHITE);
				lbl.setForeground(Color.BLACK);
			}

			final boolean esBlanca = i % 2 != 0;
			lbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int valor = Integer.parseInt(lbl.getText()) + 1;
				lbl.setText("" + valor);
//				lbl.setText(String.valueOf(valor)); hace lo mismo que la linea anterior, pasar a cadena
				if (esBlanca) {
					
					contadorBlancas++;
					lblContadorBlancas.setText("TotalClicks Blancas" + contadorBlancas);
				}else {
					contadorNegras++;
					lblContadorNegras.setText("TotalClicks Negras" + contadorNegras);
				}
			}
			});
		}

		getContentPane().add(pnlPrincipal);

		lblContadorBlancas = new JLabel("TotalClicks Blancas" + contadorBlancas);
		lblContadorNegras = new JLabel("TotalClicks Negras" + contadorNegras);
		
		JPanel pnlEstado = new JPanel(new GridLayout(1,2));
		
		pnlEstado.add(lblContadorBlancas);
		pnlEstado.add(lblContadorNegras);
		
		getContentPane().add(pnlEstado,BorderLayout.SOUTH);
		setVisible(true);

	}
}