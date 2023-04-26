package prueba4_dam_dual;

import java.io.*;
public class Serializacion {

	public static void serializar(CargadorMovil cm, String rutaFichero) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(rutaFichero))){
			oos.writeObject(cm);
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el fichero " + rutaFichero);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static CargadorMovil deserializar(String rutaFichero) {
		CargadorMovil cm = null;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(rutaFichero))){
			cm =(CargadorMovil) ois.readObject();
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el fichero " + rutaFichero);
		}catch(InvalidClassException e) {
			System.err.println("Clase no compatible " + e.getMessage());
		}catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("No se encuentra la clase.");
			e.printStackTrace();
		}
		
		return cm;
	}
	public static void main(String[] args) {		
//		CargadorMovil cm = deserializar("C:\\Users\\aespasandin\\java\\prueba4_dam_dual\\src\\cargadorMovilSerializado.ser");
//		System.out.println(cm);
		
		CargadorMovil cm = new CargadorMovil("Xiaomi", 2024, 30,true);
//		System.out.println(cm);
//		serializar(cm, "C:\\Users\\aespasandin\\java\\prueba4_dam_dual\\src\\xiaomi.ser");
		CargadorMovil cmDeser = deserializar("C:\\Users\\aespasandin\\java\\prueba4_dam_dual\\src\\xiaomi.ser");
		System.out.println(cmDeser);
	}

}
