package AreaDeTexto;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;

public class EjercicioAreaTexto {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new VentanaAreaTextoEj1();
    }

}
class VentanaAreaTextoEj1 extends JFrame{
    
	private static final long serialVersionUID = 1L;

	public VentanaAreaTextoEj1() {
        setTitle("Area de texto");
        setBounds(100,10,380,220);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new PanelAreaTextoEj1());
        

        setVisible(true);
    }
}


class PanelAreaTextoEj1 extends JPanel{
    
	private static final long serialVersionUID = 1L;
	
	JTextArea txaTexto = new JTextArea(8,15);
    JButton btnBorrar = new JButton("Borrar");
    JToggleButton btnAjsLinea = new JToggleButton("Ajuste linea");
    JToggleButton btnEnteras = new JToggleButton("Palabras Enteras");
    JButton btnGenText = new JButton("Generar Texto");
    
    public PanelAreaTextoEj1() {


        
        JScrollPane scpTexto = new JScrollPane(txaTexto);
        setLayout(new BorderLayout());
        add(scpTexto, BorderLayout.CENTER);
        
        
//        add(btnBorrar, BorderLayout.NORTH);
//        btnBorrar.addActionListener(new ActionListener() {
//            
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // TODO Auto-generated method stub
//                txaTexto.setText("");
//            }
//        });
        
        
        add(btnAjsLinea, BorderLayout.NORTH);
        btnAjsLinea.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub

            	txaTexto.setLineWrap(!txaTexto.getLineWrap());
            }
        });
        
        add(btnEnteras, BorderLayout.NORTH);
        btnEnteras.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
               txaTexto.setWrapStyleWord(!txaTexto.getWrapStyleWord());
            }
        });
        
        
        add(btnGenText, BorderLayout.SOUTH);
        btnGenText.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                txaTexto.append("En Abril Aguas Mil ");
            }
        });
        
        JPanel pnlBotones = new JPanel(new GridLayout(1,3));
        pnlBotones.add(btnAjsLinea);
        pnlBotones.add(btnGenText);
//        pnlBotones.add(btnBorrar);
        pnlBotones.add(btnEnteras);
        
        add(pnlBotones, BorderLayout.SOUTH);
    }
}
