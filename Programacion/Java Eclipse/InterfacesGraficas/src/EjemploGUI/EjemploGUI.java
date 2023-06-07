package EjemploGUI;



import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.*;

	public class EjemploGUI extends JFrame implements ActionListener, ChangeListener {
	    
		private static final long serialVersionUID = 1L;
		
		private JRadioButton radioButton1, radioButton2;
	    private JCheckBox checkBox1, checkBox2;
	    private JSpinner spinner;
	    private JSlider slider;
	    private JButton button1, button2;

	    public EjemploGUI() {
	        // Configuración de la ventana
	        setTitle("Ejemplo GUI");
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setResizable(false);
	        setSize(400, 300);
	        setLocationRelativeTo(null);
	        
	        // Creación del panel
	        JPanel panel = new JPanel();
	        panel.setLayout(null); // Desactivamos el layout manager para posicionar los componentes manualmente
	        
	        // Creación de los componentes
	        radioButton1 = new JRadioButton("Opción 1");
	        radioButton1.setBounds(20, 20, 100, 20);
	        radioButton1.addActionListener(this);
	        panel.add(radioButton1);
	        
	        radioButton2 = new JRadioButton("Opción 2");
	        radioButton2.setBounds(20, 40, 100, 20);
	        radioButton2.addActionListener(this);
	        panel.add(radioButton2);
	        
	        ButtonGroup group = new ButtonGroup();
	        group.add(radioButton1);
	        group.add(radioButton2);
	        
	        checkBox1 = new JCheckBox("Opción 1");
	        checkBox1.setBounds(20, 70, 100, 20);
	        checkBox1.addActionListener(this);
	        panel.add(checkBox1);
	        
	        checkBox2 = new JCheckBox("Opción 2");
	        checkBox2.setBounds(20, 90, 100, 20);
	        checkBox2.addActionListener(this);
	        panel.add(checkBox2);
	        
	        spinner = new JSpinner(new SpinnerNumberModel(0, 0, 10, 1)); // Valores mínimos, máximos e incrementos
	        spinner.setBounds(20, 120, 50, 20);
	        spinner.addChangeListener(this);
	        panel.add(spinner);
	        
	        slider = new JSlider(JSlider.HORIZONTAL, 0, 100, 50); // Valores mínimos, máximos y predeterminados
	        slider.setBounds(20, 150, 200, 20);
	        slider.addChangeListener(this);
	        panel.add(slider);
	        
	        button1 = new JButton("Botón 1");
	        button1.setBounds(20, 180, 100, 30);
	        button1.addActionListener(this);
	        panel.add(button1);
	        
	        button2 = new JButton("Botón 2");
	        button2.setBounds(130, 180, 100, 30);
	        button2.addActionListener(this);
	        panel.add(button2);
	        
	        // Agregamos el panel a la ventana
	        getContentPane().add(panel);
	        
	        // Mostramos la ventana
	        setVisible(true);
	    }
	    
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == radioButton1) {
	            System.out.println("Radio button 1 seleccionado");
	        } else if (e.getSource() == radioButton2) {
	            System.out.println("Radio button 2 seleccionado");
	        } else if (e.getSource() == checkBox1) {
	            System.out.println("Checkbox 1 seleccionado");
	        } else if (e.getSource() == checkBox2) {
	            System.out.println("Checkbox 2 seleccionado");
	        } else if (e.getSource() == button1) {
	            System.out.println("Botón 1 pulsado");
	        } else if (e.getSource() == button2) {
	            System.out.println("Botón 2 pulsado");
	        }
	    }
	


		@Override
		public void stateChanged(ChangeEvent e) {
		    if (e.getSource() == spinner) {
		        int valor = (int) spinner.getValue();
		        System.out.println("Spinner: " + valor);
		    } else if (e.getSource() == slider) {
		        int valor = slider.getValue();
		        System.out.println("Slider: " + valor);
		    }
		}
		public static void main(String[] args) {
		    new EjemploGUI();
		}
	}
		