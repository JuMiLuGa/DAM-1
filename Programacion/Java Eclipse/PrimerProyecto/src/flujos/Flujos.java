package flujos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Flujos {

	public static void leerFicheroTextoPreJava7() {
		String rutaFichero = "E:\\DAM 1\\Programacion\\Java Eclipse\\PrimerProyecto\\src\\flujos\\pruebatexto.txt";
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
		String rutaFichero = "E:\\DAM 1\\Programacion\\Java Eclipse\\PrimerProyecto\\src\\flujos\\pruebatexto.txt";
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
		String rutaFichero = "E:\\DAM 1\\Programacion\\Java Eclipse\\PrimerProyecto\\src\\flujos\\escribiendo.txt";
		String cadena = "Escribiendo una cadena desde Java";
		try (FileWriter escritor = new FileWriter(rutaFichero)) {
			for (int i = 0; i < cadena.length(); i++)
				escritor.write(cadena.charAt(i));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void leerConBuffer() {
		String rutaFichero = "E:\\DAM 1\\Programacion\\Java Eclipse\\PrimerProyecto\\src\\flujos\\pruebatextoB.txt";
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

		String rutaFichero = "E:\\DAM 1\\Programacion\\Java Eclipse\\PrimerProyecto\\src\\flujos\\escribiendoConBuffer.txt";
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(rutaFichero))) {
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

	public static void sumarNumerosEnFicheroTexto() {
		String rutaFichero = "E:\\DAM 1\\Programacion\\Java Eclipse\\PrimerProyecto\\src\\flujos\\pruebatexto.txt";
		try (FileReader lector = new FileReader(rutaFichero)) {
			int valor;
			double suma = 0.0;
			String numeroActual = "";
			boolean encontradoIgual = false;
			while ((valor = lector.read()) != -1) {
				char c = (char) valor;
				if (encontradoIgual) {
					// Si ya se ha encontrado el signo igual, no se suman más números
					continue;
				} else if (c == '=') {
					// Si se encuentra el signo igual, se establece encontradoIgual a true
					encontradoIgual = true;
				} else if (Character.isDigit(c) || c == '.') {
					numeroActual += c;
				} else {
					if (!numeroActual.isEmpty()) {
						double numero = Double.parseDouble(numeroActual);
						suma += numero;
						numeroActual = "";
					}
				}
			}
			if (!numeroActual.isEmpty()) {
				double numero = Double.parseDouble(numeroActual);
				suma += numero;
			}
			System.out.println();
			System.out.printf("La suma de los números en el fichero es: " + "%.2f", suma);
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void sumarNumerosEnFicheroTextoConBuffer() {
		String rutaFichero = "E:\\DAM 1\\Programacion\\Java Eclipse\\PrimerProyecto\\src\\flujos\\pruebatexto.txt";
		try (BufferedReader lector = new BufferedReader(new FileReader(rutaFichero))) {
			int valor;
			double suma = 0.0;
			String numeroActual = "";
			boolean encontradoIgual = false;
			while ((valor = lector.read()) != -1) {
				char c = (char) valor;
				if (encontradoIgual) {
					// Si ya se ha encontrado el signo igual, no se suman más números
					continue;
				} else if (c == '=') {
					// Si se encuentra el signo igual, se establece encontradoIgual a true
					encontradoIgual = true;
				} else if (Character.isDigit(c) || c == '.') {
					numeroActual += c;
				} else {
					if (!numeroActual.isEmpty()) {
						double numero = Double.parseDouble(numeroActual);
						suma += numero;
						numeroActual = "";
					}
				}
			}
			if (!numeroActual.isEmpty()) {
				double numero = Double.parseDouble(numeroActual);
				suma += numero;
			}
			System.out.printf("La suma de los números en el fichero es: " + "%.2f", suma);
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void mediaNumerosEnFicheroTextoConBuffer() {
		String rutaFichero = "E:\\DAM 1\\Programacion\\Java Eclipse\\PrimerProyecto\\src\\flujos\\numerosparamedia.txt";
		String linea = "";
		double suma = 0;
		int contador = 0;
		boolean primerNumero = true;
		try (BufferedReader lector = new BufferedReader(new FileReader(rutaFichero))) {
			while ((linea = lector.readLine()) != null) {

				if (primerNumero) {
					System.out.print(linea);
					primerNumero = false;
				} else {
					System.out.print(", " + linea);
				}

				String[] subcadenas = linea.split("/n");
				contador++;
				for (String cadena : subcadenas) {
					double numero = Double.parseDouble(cadena);
					suma = suma + numero;
				}
			}
			System.out.println();
			System.out.printf("La media de los números es: " + "%.2f", suma / contador);

		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

//		System.out.println("Sin Buffer:");
//		System.out.println();
//		
//		leerFicheroTexto();
//		escribirFicheroTexto();
//		sumarNumerosEnFicheroTexto();
//		
//		System.out.println();
//		System.out.println();
//		
//		System.out.println("Con Buffer:");
//		System.out.println();
//		
//		leerConBuffer();
//		escribirConBuffer();
//		sumarNumerosEnFicheroTextoConBuffer();
//
//		System.out.println();
//		System.out.println();
//		System.out.println("Media con Buffer:");
//		System.out.println();
//		
//		leerConBuffer();
//		escribirConBuffer();
		mediaNumerosEnFicheroTextoConBuffer();
	}
}
