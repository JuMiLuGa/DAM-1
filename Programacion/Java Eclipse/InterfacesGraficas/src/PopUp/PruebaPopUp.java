package PopUp;



import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;

public class PruebaPopUp {

    public static void main(String[] args) {
        new VentanaMenu();
    }

}
class VentanaMenu extends JFrame{
    
	private static final long serialVersionUID = 1L;

	public VentanaMenu() {
        setTitle("Ejemplo de menú");
        setBounds(100, 10, 400, 350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JMenuBar mnbBarraMenu = new JMenuBar();
        JMenu mnuArchivo = new JMenu("Archivo");
        JMenu mnuEdicion = new JMenu("Edicion");
        JMenu mnuFormato = new JMenu("Formato");
        JMenu mnuVer = new JMenu("Ver");
        
        mnbBarraMenu.add(mnuArchivo);
        mnbBarraMenu.add(mnuEdicion);
        mnbBarraMenu.add(mnuFormato);
        mnbBarraMenu.add(mnuVer);
        

//        mnbBarraMenu.setBackground(Color.RED);
        
        JMenuItem mniAbrir = new JMenuItem("Abrir", 'A');
        JMenuItem mniGuardar = new JMenuItem("Guardar", new ImageIcon("save.png"));
        mniGuardar.setHorizontalTextPosition(JMenuItem.LEFT);
        JMenuItem mniSalir = new JMenuItem("Salir", 'S');
        
        mnuArchivo.add(mniAbrir);
        mnuArchivo.add(mniGuardar);
        mnuArchivo.add(new JSeparator());
        mnuArchivo.add(mniSalir);
        
        JMenuItem mniCopiar = new JMenuItem("Copiar");
        JMenuItem mniPegar = new JMenuItem("Pegar");
        
        mnuEdicion.add(mniCopiar);
        mnuEdicion.add(mniPegar);
        
        JCheckBoxMenuItem mniAjusteLinea = new JCheckBoxMenuItem("Ajustar Linea");
        JMenuItem mniFuente = new JMenuItem("Fuente");
        
        mnuFormato.add(mniAjusteLinea);
        mnuFormato.add(mniFuente);
        
        JMenu mnuZoom = new JMenu("Zoom");
        JMenuItem mniAcercar = new JMenuItem("Acercar");
        JMenuItem mniAlejar = new JMenuItem("Alejar");
        mnuVer.add(mnuZoom);
        
        mnuZoom.add(mniAcercar);
        mnuZoom.add(mniAlejar);

        //MNEMONICOS    
        mnuArchivo.setMnemonic('A');
        mnuEdicion.setMnemonic('E');
        mnuFormato.setMnemonic('F');
        mnuVer.setMnemonic('V');
        
        mniAbrir.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ejecutando el menu abrir");
            }
        });
        mniSalir.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        
        getContentPane().add(mnbBarraMenu, BorderLayout.NORTH);
        
        mniSalir.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        
        JPopupMenu pupSaludo = new JPopupMenu();
        JMenuItem mniSaludoConsola = new JMenuItem("Saludo por consola");
        JMenuItem mniSaludoPopup = new JMenuItem("Saludo por JOptionPne");
        pupSaludo.add(mniSaludoPopup);
        pupSaludo.add(mniSaludoConsola);
        
        JPanel pnlPrincipal = new JPanel();
        pnlPrincipal.setComponentPopupMenu(pupSaludo);
        
        
        getContentPane().add(pnlPrincipal);
        
        mniSaludoConsola.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                System.out.println("Holaaa!!!");
            }
        });
        
        mniSaludoPopup.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                JOptionPane.showMessageDialog(pnlPrincipal, "Holaaa!!!");
            }
        });
        
        
        
        setVisible(true);
    }
}