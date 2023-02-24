package flujos;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class ejercicio4 {

	public static void crearTXT() {
		try {
			BufferedWriter writer = new BufferedWriter(
					new FileWriter("E:\\DAM 1\\Programacion\\Java Eclipse\\PrimerProyecto\\src\\flujos\\numeros.txt"));
			Random random = new Random();
			int decimalPlaces;
			BigDecimal number;

			for (int i = 0; i < 10; i++) {
				decimalPlaces = random.nextInt(5) + 1;
				double scaleFactor = Math.pow(10, decimalPlaces);
				number = new BigDecimal((random.nextDouble() * 200 - 100) * scaleFactor / scaleFactor).setScale(2,
						RoundingMode.HALF_UP);
				writer.write(number.toString().replace(",", ".") + " ");
			}

			writer.close();
			System.out.println("Fichero creado correctamente.");
		} catch (IOException e) {
			System.err.println("Error al crear el fichero.");
			e.printStackTrace();
		}
	}

	public static void leerTXT() {
		String rutaFichero = "E:\\DAM 1\\Programacion\\Java Eclipse\\PrimerProyecto\\src\\flujos\\numeros.txt";
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

	public static void main(String[] args) {

		crearTXT();

		System.out.println();

		leerTXT();
	}
}
