package ventanas_emergentes;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.filechooser.FileNameExtensionFilter;

public class DialogoSeleccionFichero {

	public static void main(String[] args) {
		new VentanaSeleccionFichero();

	}

}
class VentanaSeleccionFichero extends JFrame{
	private File fichero;
	private JTextArea txaTexto;
	private JLabel lblEstado;
	public VentanaSeleccionFichero() {
		setTitle("Selección de ficheros");
		setBounds(2100,100,600,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JMenuBar mnbBarra = new JMenuBar();
		JMenu mnuArchivo = new JMenu("Archivo");
		JMenuItem mniAbrir = new JMenuItem("Abrir", 'A');
		JMenuItem mniGuardar = new JMenuItem("Guardar", 'G');
		JMenuItem mniGuardarComo = new JMenuItem("Guardar como...", 'C');
		
		mnuArchivo.add(mniAbrir);
		mnuArchivo.add(mniGuardar);
		mnuArchivo.add(mniGuardarComo);
		mnbBarra.add(mnuArchivo);
		
		getContentPane().add(mnbBarra,BorderLayout.NORTH);
		
		txaTexto = new JTextArea();
		JScrollPane scpTexto = new JScrollPane(txaTexto);
		getContentPane().add(scpTexto);
		
		lblEstado = new JLabel(" ");
		getContentPane().add(lblEstado, BorderLayout.SOUTH);
		
		mniAbrir.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				fc.setFileFilter(new FileNameExtensionFilter("Archivos java", "txt","log", "java"));
				fc.setCurrentDirectory(new File("").getAbsoluteFile());
				fc.setFileHidingEnabled(false);
				
				int resultado = fc.showOpenDialog(VentanaSeleccionFichero.this);
				if(resultado == JFileChooser.APPROVE_OPTION) {
					fichero = fc.getSelectedFile();
					txaTexto.setText(obtenerTextoFichero(fichero));
					lblEstado.setText(fichero.getAbsolutePath());
				}
				
			}
		});
		
		mniGuardar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (fichero != null) {
					String texto = txaTexto.getText();
					guardarTextoEnFichero(texto, fichero);
				} else {
					guardarComo();
				}
			}
		});
		
		mniGuardarComo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				guardarComo();
			}
		});
		
		setVisible(true);
	}
	
	private String obtenerTextoFichero(File fichero) {
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(fichero))){
			String linea;
			while((linea = br.readLine()) != null) {
				sb.append(linea);
				sb.append(System.lineSeparator());
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el archivo.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return sb.toString();
	}
	
	private void guardarTextoEnFichero(String texto, File fichero) {
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))){
			bw.write(texto);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void guardarComo() {
		JFileChooser fc = new JFileChooser();
		fc.setCurrentDirectory(new File("").getAbsoluteFile());
		int resultado = fc.showSaveDialog(VentanaSeleccionFichero.this);
		
		if(resultado == JFileChooser.APPROVE_OPTION) {
			fichero = fc.getSelectedFile();
			String texto = txaTexto.getText();
			guardarTextoEnFichero(texto, fichero);
			lblEstado.setText(fichero.getAbsolutePath());
		}
	}
	
	
}
















