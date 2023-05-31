package componentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class Menus {

	public static void main(String[] args) {
		new VentanaMenu();
	}

}
class VentanaMenu extends JFrame{
	public VentanaMenu() {
		setTitle("Ejemplo de menú");
		setBounds(2010, 10, 400, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar mnbBarraMenu = new JMenuBar();
		JMenu mnuArchivo = new JMenu("Archivo");
		JMenu mnuEdicion = new JMenu("Edición");
		JMenu mnuFormato = new JMenu("Formato");
		JMenu mnuVer = new JMenu("Ver");
		
		mnbBarraMenu.add(mnuArchivo);
		mnbBarraMenu.add(mnuEdicion);
		mnbBarraMenu.add(mnuFormato);
		mnbBarraMenu.add(mnuVer);
//		mnbBarraMenu.setBackground(Color.RED);
		
		JMenuItem mniAbrir = new JMenuItem("Abrir", 'A');
//		mniAbrir.setIcon(new ImageIcon("recursos/guardar16.png"));
		JMenuItem mniGuardar = new JMenuItem("Guardar", new ImageIcon("recursos/guardar16.png"));
		mniGuardar.setHorizontalTextPosition(JMenuItem.LEFT);
		JMenuItem mniSalir = new JMenuItem("Salir",'S');
		mnuArchivo.add(mniAbrir);
		mnuArchivo.add(mniGuardar);
		mnuArchivo.add(new JSeparator());
		mnuArchivo.add(mniSalir);
		
		JMenuItem mniCopiar = new JMenuItem("Copiar");
		JMenuItem mniPegar = new JMenuItem("Pegar");
		mnuEdicion.add(mniCopiar);
		mnuEdicion.add(mniPegar);
		
		JCheckBoxMenuItem mniAjusteLinea = new JCheckBoxMenuItem("Ajuste de línea");
//		JRadioButtonMenuItem mniAjusteLinea = new JRadioButtonMenuItem("Ajuste de línea");
		JMenuItem mniFuente = new JMenuItem("Fuente...");
		mnuFormato.add(mniAjusteLinea);
		mnuFormato.add(mniFuente);
		
		JMenu mnuZoom = new JMenu("Zoom");
		JMenuItem mniAcercar = new JMenuItem("Acercar");
		JMenuItem mniAlejar = new JMenuItem("Alejar");
		mnuZoom.add(mniAcercar);
		mnuZoom.add(mniAlejar);
		mnuVer.add(mnuZoom);
		
		mnuArchivo.setMnemonic('A');
		
		mniAbrir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ejecutando el menú abrir");
				
			}
		});
		mniSalir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		getContentPane().add(mnbBarraMenu,BorderLayout.NORTH);
		
		mniSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
//		mniSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK, true));
		
		JPopupMenu pupSaludo = new JPopupMenu();
		JMenuItem mniSaludoConsola = new JMenuItem("Saludo por consola");
		JMenuItem mniSaludoPopup = new JMenuItem("Saludo por JOptionPne");
		pupSaludo.add(mniSaludoConsola);
		pupSaludo.add(mniSaludoPopup);
		
		JPanel pnlPrincipal = new JPanel();
		pnlPrincipal.setComponentPopupMenu(pupSaludo);
		
		getContentPane().add(pnlPrincipal);
		
		mniSaludoConsola.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Hola a todos");
			}
		});
		
		mniSaludoPopup.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(pnlPrincipal, "Hola a todos");
			}
		});
		
		
		JPopupMenu pupColores = new JPopupMenu();
		JMenuItem mniRojo = new JMenuItem("Rojo");
		JMenuItem mniVerde = new JMenuItem("Verde");
		JMenuItem mniAzul = new JMenuItem("Azul");
		pupColores.add(mniRojo);
		pupColores.add(mniVerde);
		pupColores.add(mniAzul);
		
//		pnlPrincipal.setComponentPopupMenu(pupColores);
		
		mniRojo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				pnlPrincipal.setBackground(Color.RED);
				
			}
		});
		
		pnlPrincipal.setLayout(new GridLayout(2,2));
		JPanel pnl11 = new JPanel();
		JPanel pnl12 = new JPanel();
		JPanel pnl21 = new JPanel();
		JPanel pnl22 = new JPanel();
		pnlPrincipal.add(pnl11);
		pnlPrincipal.add(pnl12);
		pnlPrincipal.add(pnl21);
		pnlPrincipal.add(pnl22);
		
		pnl11.setComponentPopupMenu(pupColores);
		pnl22.setComponentPopupMenu(pupColores);
		
		mniRojo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JMenuItem mni = (JMenuItem)e.getSource();
				JPopupMenu pup = (JPopupMenu) mni.getParent();
				JPanel pnl = (JPanel)pup.getInvoker();
				pnl.setBackground(Color.RED);
				
			}
		});
		
		mniRojo.addActionListener(new AsignarColorFondo(Color.RED));
		mniVerde.addActionListener(new AsignarColorFondo(Color.GREEN));
		mniAzul.addActionListener(new AsignarColorFondo(Color.BLUE));
		
		
		setVisible(true);
	}
}

class AsignarColorFondo implements ActionListener {
	private Color c;
	
	public AsignarColorFondo(Color c) {
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		((JPanel)((JPopupMenu)((JMenuItem)e.getSource()).getParent()).getInvoker()).setBackground(c);
	}
	
}















