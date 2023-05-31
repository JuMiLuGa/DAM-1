package ejercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio4 {

	public static void main(String[] args) {
		new VentanaEj4();
	}

}
class VentanaEj4 extends JFrame {
	private JPanel pnlPrincipal;
	private int contadorBlancas = 0;
	private int contadorNegras = 0;
	
	private JLabel lblContadorBlancas;
	private JLabel lblContadorNegras;
	
	public VentanaEj4() {
		setTitle("Casillas pulsadas");
		setBounds(2010,10,400,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pnlPrincipal=new JPanel(new GridLayout(9,9));
		for(int i = 1; i <= 81; i++) {
//			JPanel pnl = new JPanel();
			JLabel lbl = new JLabel("0");
//			pnl.add(lbl);
			lbl.setOpaque(true);
			lbl.setHorizontalAlignment(JLabel.CENTER);
			pnlPrincipal.add(lbl);
			if(i%2==0) {
				lbl.setBackground(Color.BLACK);
				lbl.setForeground(Color.WHITE);
			} else {
				lbl.setBackground(Color.WHITE);
				lbl.setForeground(Color.BLACK);
			}
			
			 boolean esBlanca = i % 2 != 0;
			lbl.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					int valor = Integer.parseInt(lbl.getText())  + 1;
					lbl.setText(String.valueOf(valor));
					if(esBlanca) {
						lblContadorBlancas.setText("Total clicks casillas blancas: " + (++contadorBlancas));
					}else {
						lblContadorNegras.setText("Total clicks casillas negras: " + (++contadorNegras));
					}
				}
			});
		}
		
		getContentPane().add(pnlPrincipal);
		
		lblContadorBlancas = new JLabel("Total clicks casillas blancas: " + contadorBlancas);
		lblContadorNegras = new JLabel("Total clicks casillas negras: " + contadorNegras);
		JPanel pnlEstado = new JPanel(new GridLayout(1,2));
		pnlEstado.add(lblContadorBlancas);
		pnlEstado.add(lblContadorNegras);
		
		getContentPane().add(pnlEstado,BorderLayout.SOUTH);
		
		
		setVisible(true);
	}
}






