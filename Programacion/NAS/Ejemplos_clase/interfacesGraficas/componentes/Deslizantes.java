package componentes;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Deslizantes {

	public static void main(String[] args) {
		new VentanaDeslizantes();
	}

}
class VentanaDeslizantes extends JFrame{
	public VentanaDeslizantes() {
		setTitle("Sliders");
		setBounds(2010,10,400,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JSlider sldBarra = new JSlider();
		sldBarra.setMajorTickSpacing(25);
		sldBarra.setMinorTickSpacing(5);
		sldBarra.setPaintTicks(true);
		sldBarra.setPaintLabels(true);
		sldBarra.setValue(37);
		sldBarra.setMinimum(-50);
		sldBarra.setFont(new Font("Verdana", Font.ITALIC, 8));
		sldBarra.setSnapToTicks(true);
		
		
		getContentPane().add(sldBarra,BorderLayout.NORTH);
		
		JLabel lblTexto = new JLabel("O que non mata, enjorda");
		getContentPane().add(lblTexto, BorderLayout.CENTER);
		
		sldBarra.setMinimum(5);
		sldBarra.setValue(lblTexto.getFont().getSize());
		sldBarra.setSnapToTicks(false);
		
		sldBarra.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				System.out.println("Valor slider: " + sldBarra.getValue());
				Font fuenteActual = lblTexto.getFont();
				lblTexto.setFont(new Font(fuenteActual.getFamily(), fuenteActual.getStyle(), sldBarra.getValue()));
			}
		});
		
		setVisible(true);
	}
}
