package componentes;

import java.awt.*;
import javax.swing.*;

public class Spinners {

	public static void main(String[] args) {
		new VentanaSpinners();
	}

}
class VentanaSpinners extends JFrame{
	public VentanaSpinners() {
		setTitle("Spinners");
		setBounds(2010,10,400,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
		JSpinner spnValores = new JSpinner();
		
		spnValores.setPreferredSize(new Dimension(100,20));
		JPanel pnlSpinners = new JPanel();
		pnlSpinners.setLayout(new BoxLayout(pnlSpinners, BoxLayout.Y_AXIS));
		pnlSpinners.add(spnValores);
		
		JPanel pnlCentral = new JPanel();
		pnlCentral.add(pnlSpinners);
		
		
		getContentPane().add(pnlCentral);
		
		
		
		setVisible(true);
	}
}



