package ventanas_emergentes;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DialogoSeleccionColor {

	public static void main(String[] args) {
		new VentanaSeleccionColor();

	}

}
class VentanaSeleccionColor extends JFrame{
	public VentanaSeleccionColor() {
		setTitle("Selección de color");
		setBounds(2100,100,600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JPanel pnlColor = new JPanel();
		pnlColor.setBackground(Color.RED);
		
		pnlColor.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if(e.getButton() == MouseEvent.BUTTON3) {
					Color colorActual = pnlColor.getBackground();
					Color color = JColorChooser.showDialog(pnlColor, "Cambiar color fondo", colorActual);
					if(color != null)
						pnlColor.setBackground(color);
				}
			}
		});
		
		getContentPane().add(pnlColor);
		setVisible(true);
	}
}
