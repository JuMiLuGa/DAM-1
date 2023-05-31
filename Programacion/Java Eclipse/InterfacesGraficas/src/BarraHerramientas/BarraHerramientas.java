package BarraHerramientas;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class BarraHerramientas {

    public static void main(String[] args) {
        new VentanaBarraHerramientas();
    }

}

class VentanaBarraHerramientas extends JFrame {
    
	private static final long serialVersionUID = 1L;

	public VentanaBarraHerramientas() {
        setTitle("Barra de herramientas");
        setBounds(100,100,500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        AccionColor accionRojo = new AccionColor("rojo", Color.RED, new ImageIcon("recursos/hex16rojo.png"));
        AccionColor accionVerde = new AccionColor("verde", Color.GREEN, new ImageIcon("recursos/hex16verde.png"));
        AccionColor accionAzul = new AccionColor("azul", Color.BLUE, new ImageIcon("recursos/hex16azul.png"));
        
        AbstractAction accionCerrar = new AbstractAction("cerrar", new ImageIcon("recursos/cerrar16.png")) {
			
			private static final long serialVersionUID = 1L;

			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		};
        
        JToolBar tlb = new JToolBar("Colores");
        tlb.add(accionRojo);
        tlb.add(accionVerde);
        tlb.add(accionAzul);
        
        tlb.addSeparator(new Dimension(10, 10));
        
        tlb.add(accionCerrar);
        
        getContentPane().add(tlb, BorderLayout.NORTH);
        
        setVisible(true);
    }
    
    private class AccionColor extends AbstractAction{
        
		private static final long serialVersionUID = 1L;

		public AccionColor(String texto, Color color, Icon icono) {
            putValue(Action.NAME, texto);
            putValue("color", color);
            putValue(Action.LARGE_ICON_KEY, icono);
            putValue(Action.SHORT_DESCRIPTION, "Cambia el color de fondo a "+ texto);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("color");
            getContentPane().setBackground(c);
            
        }
    }
}