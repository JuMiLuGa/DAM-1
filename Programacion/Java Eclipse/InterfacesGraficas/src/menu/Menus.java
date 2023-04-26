package menu;

import javax.swing.*;
import java.awt.*;

public class Menus {

	public static void main(String[] args) {
		new VentanaMenu();
	}
}

class VentanaMenu extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public VentanaMenu() {
		setTitle("Ejemplo de menu");
		setBounds(10, 10, 400, 350);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar mnbBarraMenu = new JMenuBar();
		
		JMenu mnuArchivo = new JMenu("Archivo");
		JMenu mnuEdicion = new JMenu("Edicion");
		JMenu mnuFormato = new JMenu("Formato");
		JMenu mnuVer = new JMenu("Ver");

		
		mnbBarraMenu.setBackground(Color.RED);
		
		
		
		mnbBarraMenu.add(mnuArchivo);
		mnbBarraMenu.add(mnuEdicion);
		mnbBarraMenu.add(mnuFormato);
		mnbBarraMenu.add(mnuVer);
		
		JMenuItem mniAbrir = new JMenuItem("Abrir");
		JMenuItem mniGuardar = new JMenuItem("Guardar");
		JMenuItem mniSalir = new JMenuItem("Salir");
		
		mnuArchivo.add(mniAbrir);
		mnuArchivo.add(mniGuardar);
		mnuArchivo.add(new JSeparator());
		mnuArchivo.add(mniSalir);
		
		
		JMenuItem mniCopiar = new JMenuItem("Copiar");
		JMenuItem mniCortar = new JMenuItem("Cortar");
		JMenuItem mniPegar = new JMenuItem("Pegar");
		
		
		mnuEdicion.add(mniCopiar);
		mnuEdicion.add(mniCortar);
		mnuEdicion.add(mniPegar);
		
		
		JMenuItem mniAjusteLinea = new JMenuItem("Ajuste de Linea");
		JMenuItem mniFuente = new JMenuItem("Fuente");
		
		
		
		mnuFormato.add(mniAjusteLinea);
		mnuFormato.add(mniFuente);
		
		JMenu mnuZoom = new JMenu("Zoom");
		
		mnuVer.add(mnuZoom);
		
		JMenuItem mniAcercar = new JMenuItem("Acercar");
		JMenuItem mniAlejar = new JMenuItem("Alejar");

		mnuZoom.add(mniAcercar);
		mnuZoom.add(mniAlejar);
		
		getContentPane().add(mnbBarraMenu,BorderLayout.NORTH);
		
		setVisible(true);
	}
}
