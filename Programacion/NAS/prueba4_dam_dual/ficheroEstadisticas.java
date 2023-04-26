package prueba4_dam_dual;

import java.io.*;

public class ficheroEstadisticas {

	public static void engadirEstadisticas(String rutaFichero) {
		File fOriginal = new File(rutaFichero);
		File fEstadisticas = new File(fOriginal.getParent(),"estadisticas.txt");
		int numPalabras = 0;
		int numLineas = 0;
		String linea = "";
		try(BufferedReader br = new BufferedReader(new FileReader(rutaFichero))){
			while((linea = br.readLine()) != null) {
				numLineas++;
				String[] palabras = linea.split(" ");
				numPalabras += palabras.length;
			}
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el fichero: " + rutaFichero);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(fEstadisticas,true))){
			bw.append(rutaFichero);
			bw.append(": ");
			bw.append(numPalabras + " palabras en ");
			bw.append(numLineas + " líneas.");
			bw.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		engadirEstadisticas("C:\\Users\\aespasandin\\java\\prueba4_dam_dual\\src\\poo.txt");
		engadirEstadisticas("C:\\Users\\aespasandin\\java\\prueba4_dam_dual\\src\\java.txt");
	}

}
