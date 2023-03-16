package prueba4_dam_dual;

import java.io.*;

public class Deserializador {

	public static void serializar(CargadorMovil cm, String rutaFichero) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaFichero))) {
			oos.writeObject(cm);
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el fichero " + rutaFichero);
		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	public static CargadorMovil deserializar(String ruta) {
		try (FileInputStream fis = new FileInputStream(ruta); ObjectInputStream ois = new ObjectInputStream(fis)) {
			CargadorMovil cm = (CargadorMovil) ois.readObject();
			return cm;
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error al deserializar: " + e.getMessage());
			return null;
		}
	}

	public static void main(String[] args) {
		CargadorMovil cm = deserializar(
				"E:\\DAM 1\\Programacion\\Java Eclipse\\prueba_4\\src\\prueba4_dam_dual\\cargadorMovilSerializado.ser");
		System.out.println(cm);
	}
}
