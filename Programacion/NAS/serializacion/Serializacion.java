package serializacion;

import java.io.*;
import serializacion.interfaces.*;

public class Serializacion {
	public static void main(String[] args) {
		Figura[] figuras = new Figura[5];
		figuras[0] = new Circulo(4, "rojo");
		figuras[1] = new Triangulo(2, 7, "verde");
		figuras[2] = new Rectangulo(4, 6, "amarillo");
		figuras[3] = new Circulo(3, "azul");
		figuras[4] = new Triangulo(7, 3, "morado");
		
		File directorioProyecto = new File("");
		File archivoSalida = new File(directorioProyecto.getAbsolutePath(), "arrayFiguras.bin");
		
		// SERIALIZAR
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivoSalida))){
			oos.writeObject(figuras);
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el archivo " + archivoSalida.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		Figura[] fDeserializadas= {};
		// DESERIALIZAR
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(archivoSalida))){
			fDeserializadas = (Figura[]) ois.readObject();
		} catch (FileNotFoundException e) {
			System.err.println("No se encuentra el archivo " + archivoSalida.getAbsolutePath());
		}catch(InvalidClassException e) {
			System.err.println("La versión de la clase no coincide.");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("ERROR: clase no encontrada " + e.getMessage());
		}
		
		for(Figura f : fDeserializadas) {
			System.out.println(f);
		}
		
	}
}




