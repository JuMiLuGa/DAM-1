package EjerciciosInterfacesGraficas;
import javax.swing.*;
import java.awt.*;

public class Ejercicio2 extends JFrame {

    private JPanel panelIzquierdo, panelDerecho;
    private JLabel labelIzquierdo, labelDerecho;
    private JTextField textField;
    private JButton button;
    private JComboBox<String> comboBox;
    
    public Ejercicio2() {
        // Configuramos la ventana principal
        setTitle("Ejemplo de interfaz con Java Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 2));
        
        // Creamos el panel izquierdo
        panelIzquierdo = new JPanel(new GridLayout(2, 1));
        labelIzquierdo = new JLabel("Introduzca una marca de coches");
        panelIzquierdo.setBackground(Color.RED);
        panelIzquierdo.add(labelIzquierdo);
        
        // Creamos un nuevo panel dentro del panel izquierdo
        JPanel panelIzquierdoAbajo = new JPanel(new BorderLayout());
        textField = new JTextField(20);
        panelIzquierdoAbajo.add(textField, BorderLayout.CENTER);
        button = new JButton("Aceptar");
        panelIzquierdoAbajo.add(button, BorderLayout.EAST);
        panelIzquierdo.add(panelIzquierdoAbajo);
        
        add(panelIzquierdo);
        
        // Creamos el panel derecho
        panelDerecho = new JPanel();
        panelDerecho.setBackground(Color.BLUE);
        labelDerecho = new JLabel("Panel Derecho");
        panelDerecho.add(labelDerecho);
        comboBox = new JComboBox<String>(new String[] {"Opción 1", "Opción 2", "Opción 3"});
        panelDerecho.add(comboBox);
        add(panelDerecho);
            
        // Mostramos la ventana
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        Ejercicio2 interfaz = new Ejercicio2();
    }
}
