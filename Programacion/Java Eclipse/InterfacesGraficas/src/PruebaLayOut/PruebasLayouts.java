package PruebaLayOut;

import java.awt.*;

import javax.swing.*;

public class PruebasLayouts {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        new VentanaLayout();
    }

}

class VentanaLayout extends JFrame{
    public VentanaLayout() {
        setTitle("Disposición por defecto");
        setBounds(100,100,400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        add(new PanelLayout(), BorderLayout.NORTH);
        add(new PanelLayout2(), BorderLayout.SOUTH);

        setVisible(true);
    }
}

class PanelLayout extends JPanel{
    public PanelLayout() {
        add(new JButton("rojo"));
        add(new JButton("verde"));
        add(new JButton("azul"));
        FlowLayout disposicion = new FlowLayout(FlowLayout.LEFT);
        setLayout(disposicion);
        setLayout(new FlowLayout(FlowLayout.TRAILING));
        setLayout(new FlowLayout(FlowLayout.CENTER, 150,25));
        setLayout(new FlowLayout(FlowLayout.CENTER, -20,-5));
        
        setLayout(new BorderLayout());
        setLayout(new BorderLayout(30, 5));
        add(new JButton("rojo"),BorderLayout.WEST);
        add(new JButton("verde"),BorderLayout.SOUTH);
        add(new JButton("azul"),BorderLayout.EAST);
//        add(new JButton("blanco"),BorderLayout.EAST);
//        add(new JButton("negro"),BorderLayout.CENTER);    
        setBackground(Color.GREEN);

    }
}

class PanelLayout2 extends JPanel{
    public PanelLayout2() {
        add(new JButton("blanco"));
        add(new JButton("negro"));
        setBackground(Color.orange);
    }
}