package componentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class SeleccionChkRbt {

	public static void main(String[] args) {
		new VentanaSeleccion();
	}

}
class VentanaSeleccion extends JFrame{
	private JTextArea txaTexto;
	private JCheckBox chkNegrita;
	private JCheckBox chkCursiva;
	private Font fuente;
	
	private ButtonGroup bgColorLetra;
	private JPanel pnlColorLetra;
	public VentanaSeleccion() {
		setTitle("Selección");
		setBounds(2010,10,400,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		txaTexto = new JTextArea(12,100);
		txaTexto.setLineWrap(true);
		txaTexto.setWrapStyleWord(true);
		fuente = txaTexto.getFont();
		
		JScrollPane scpTexto = new JScrollPane(txaTexto);
		
		getContentPane().add(scpTexto,BorderLayout.CENTER);
		
		chkNegrita = new JCheckBox("Negrita");
		chkCursiva = new JCheckBox("Cursiva");
		JPanel pnlChecks = new JPanel();
		pnlChecks.add(chkNegrita);
		pnlChecks.add(chkCursiva);
		
		getContentPane().add(pnlChecks, BorderLayout.SOUTH);
		
		chkNegrita.addActionListener(new CambiarEstiloLetra());
		chkCursiva.addActionListener(new CambiarEstiloLetra());
		
		JPanel pnlColorFondo = new JPanel();
		pnlColorFondo.setLayout(new BoxLayout(pnlColorFondo, BoxLayout.Y_AXIS));
		JRadioButton rbtFondoNegro = new JRadioButton("Negro");
		JRadioButton rbtFondoBlanco = new JRadioButton("Blanco", true);
		JRadioButton rbtFondoRojo = new JRadioButton("Rojo");
		JRadioButton rbtFondoAzul = new JRadioButton("Azul");
		
		// Para que los radio buttos adquieran el comportamiento de que tan solo uno de ellos
		// pueda estar seleccionado a la vez, hay que agruparlos en un ButtonGroup.
		ButtonGroup bgColorFondo = new ButtonGroup();
		bgColorFondo.add(rbtFondoNegro);
		bgColorFondo.add(rbtFondoBlanco);
		bgColorFondo.add(rbtFondoRojo);
		bgColorFondo.add(rbtFondoAzul);
		
		pnlColorFondo.add(new JLabel("Color fondo: "));
		pnlColorFondo.add(rbtFondoNegro);
		pnlColorFondo.add(rbtFondoBlanco);
		pnlColorFondo.add(rbtFondoRojo);
		pnlColorFondo.add(rbtFondoAzul);
		
		getContentPane().add(pnlColorFondo, BorderLayout.WEST);
		
		CambiarColorFondo ccf = new CambiarColorFondo();
		rbtFondoNegro.addActionListener(ccf);
		rbtFondoBlanco.addActionListener(ccf);
		rbtFondoRojo.addActionListener(ccf);
		rbtFondoAzul.addActionListener(ccf);
		
		pnlColorLetra = new JPanel();
		pnlColorLetra.setLayout(new BoxLayout(pnlColorLetra, BoxLayout.Y_AXIS));
		
		bgColorLetra = new ButtonGroup();
		pnlColorLetra.add(new JLabel("Color letra: "));
		agregarBoton("Negro",true,Color.BLACK);
		agregarBoton("Blanco",true,Color.WHITE);
		agregarBoton("Rojo",true,Color.RED);
		agregarBoton("Azul",true,Color.BLUE);
		
		JPanel pnlSeleccionColores = new JPanel();
		pnlSeleccionColores.setLayout(new BoxLayout(pnlSeleccionColores, BoxLayout.Y_AXIS));
		pnlSeleccionColores.add(pnlColorFondo);
//		pnlSeleccionColores.add(new JLabel(" "));
		pnlSeleccionColores.add(pnlColorLetra);
		pnlColorFondo.setBorder(new EmptyBorder(5, 5, 5, 5));
		pnlColorLetra.setBorder(new EmptyBorder(15, 5, 5, 5));
		
		getContentPane().add(pnlSeleccionColores,BorderLayout.WEST);
		setVisible(true);
	}
	
	private class CambiarEstiloLetra implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			int estilo = 0; // Font.PLAIN = 0
			if(chkNegrita.isSelected())
				estilo += 1; // Font.BOLD = 1
			if(chkCursiva.isSelected())
				estilo += 2; // Font.ITALIC = 2
			// Negrita + Cursiva = 1 + 2 = 3 
			
			fuente = new Font(fuente.getFamily(), estilo, fuente.getSize());
			txaTexto.setFont(fuente);
		}
		
	}
	private class CambiarColorFondo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			switch(e.getActionCommand()) {
			case "Negro":
				txaTexto.setBackground(Color.BLACK);
				break;
			case "Blanco":
				txaTexto.setBackground(Color.WHITE);
				break;
			case "Rojo":
				txaTexto.setBackground(Color.RED);
				break;
			case "Azul":
				txaTexto.setBackground(Color.BLUE);
				break;
			}
		}
	}
	
	public void agregarBoton(String nombre, boolean estaSeleccionado, Color color) {
		JRadioButton rbt = new JRadioButton(nombre, estaSeleccionado);
		bgColorLetra.add(rbt);
		pnlColorLetra.add(rbt);
		rbt.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				txaTexto.setForeground(color);
			}
		});
	}
}