package componentes;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DesplegablesCmb {

	public static void main(String[] args) {
		new VentanaDesplegables();
	}

}
class VentanaDesplegables extends JFrame{
	public VentanaDesplegables() {
		setTitle("Deplegables");
		setBounds(2010,10,400,350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		String[] fuentes = ge.getAvailableFontFamilyNames();
		
		JComboBox<String> cmbFuentes = new JComboBox<>(fuentes);
		getContentPane().add(cmbFuentes, BorderLayout.NORTH);
		
		cmbFuentes.addItem("Arial");
		cmbFuentes.addItem("Serif");
		cmbFuentes.addItem("Comic Sans MS");
		cmbFuentes.addItem("Times New Roman");
		cmbFuentes.addItem("Courier");
		cmbFuentes.addItem("Verdana");
		cmbFuentes.addItem("Algerian");
		
		cmbFuentes.setEditable(true);
		cmbFuentes.setMaximumRowCount(4);
		
		JLabel lblTexto = new JLabel("Lo que no te mata, te hace más fuerte");
		getContentPane().add(lblTexto,BorderLayout.CENTER);
		
		cmbFuentes.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				System.out.println(cmbFuentes.getSelectedItem());
				lblTexto.setFont(new Font((String)cmbFuentes.getSelectedItem(), Font.BOLD,18));
			}
		});
		
		setVisible(true);
	}
}