package flujos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Flujos {

	public static void leerFicheroTextoPreJava7() {
		String rutaFichero = "C:\\Users\\aespasandin\\java\\postPoo\\src\\flujos\\datos.txt";
		FileReader lector = null;
		try {
			lector = new FileReader(rutaFichero);
			int valor = lector.read();
			while (valor != -1) {
				System.out.print((char) valor);
				valor = lector.read();
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se ha encontrado el fichero.");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (lector != null)
				try {
					lector.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}

	// Con try-with-resources
	public static void leerFicheroTexto() {
		String rutaFichero = "C:\\Users\\aespasandin\\java\\postPoo\\src\\flujos\\datos.txt";
		try (FileReader lector = new FileReader(rutaFichero)) {
			int valor;
			while ((valor = lector.read()) != -1)
				System.out.print((char) valor);
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void escribirFicheroTexto() {
		String rutaFichero = "C:\\Users\\aespasandin\\java\\postPoo\\src\\flujos\\escribiendo.txt";
		String cadena = "Escribiendo una cadena desde Java";
		try (FileWriter escritor = new FileWriter(rutaFichero)) {
			for (int i = 0; i < cadena.length(); i++)
				escritor.write(cadena.charAt(i));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void leerConBuffer() {
		String rutaFichero = "C:\\Users\\aespasandin\\java\\postPoo\\src\\flujos\\codigo.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(rutaFichero))) {
			String linea = null;
			while ((linea = br.readLine()) != null)
				System.out.println(linea);
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void escribirConBuffer() {
		String cadena1 = "escribiendo una cadena desde Java";
		String cadena2 = "Segunda frase";
		String cadena3 = "Tercera línea";
		
		StringBuilder sb = new StringBuilder();
		sb.append("Texto procedente de ");
		sb.append("un StringBuilder");
		sb.append("\n");
		sb.append("Ya incluye los saltos de línea.");
		
		String rutaFichero = "C:\\Users\\aespasandin\\java\\postPoo\\src\\flujos\\escribiendoConBuffer.txt";
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(rutaFichero))){
			bw.append(cadena1);
			bw.newLine();
			bw.append(cadena2);
			bw.newLine();
			bw.append(cadena3);
			bw.append("\n");
			bw.append(sb);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static byte[] leerFicheroBinario() {
		String rutaFichero = "C:\\Users\\aespasandin\\java\\postPoo\\src\\flujos\\Java-logo.png";
		byte[] datos = {};
		try(FileInputStream fis = new FileInputStream(rutaFichero)){
			datos = new byte[fis.available()];
			int contador=0;
			while(fis.available()>0) 
				datos[contador++]=(byte)fis.read();
			
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return datos;
	}
	
	public static void escribirFicheroBinario(byte[] datos) {
		String rutaFichero = "C:\\Users\\aespasandin\\java\\postPoo\\src\\flujos\\nuevoBinario.png";
		try(FileOutputStream fos = new FileOutputStream(rutaFichero)){
			for(int i = 0; i<datos.length;i++)
				fos.write(datos[i]);
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
//		leerFicheroTexto();
//		escribirFicheroTexto();
//		leerConBuffer();
//		escribirConBuffer();
		 escribirFicheroBinario(leerFicheroBinario());


	}
}
