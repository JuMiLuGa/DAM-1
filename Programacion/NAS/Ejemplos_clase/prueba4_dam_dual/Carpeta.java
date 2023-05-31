package prueba4_dam_dual;

import java.io.File;

public class Carpeta {
	private File carpeta;

	public Carpeta(String rutaCarpeta) {
		this.carpeta = new File(rutaCarpeta);
		if (carpeta.exists()) {
			if (!carpeta.isDirectory())
				System.err.println("La ruta " + rutaCarpeta + " no se corresponde con un directorio.");
		} else {
			if (carpeta.mkdirs())
				System.out.println("Carpeta creada correctamente.");
			else
				System.err.println("No se ha podido crear la carpeta.");
		}
	}

	public int numHijos() {
		return carpeta.list().length;
	}

	public boolean estaVacio() {
		return numHijos() == 0;
	}

	public void listar() {
		for (File elemento : carpeta.listFiles()) {
			if (elemento.isDirectory())
				System.out.println(elemento.getName() + "(" + elemento.list().length + ")");
			else
				System.out.println(elemento.getName());
		}
	}

	public int espacio() {
		int totalBytes = 0;
		for (File elemento : carpeta.listFiles()) {
			if (elemento.isFile())
				totalBytes += elemento.length();
		}
		return totalBytes;
	}
	
	public void mostrarPropiedades() {
		System.out.println("Ruta absoluta: " + carpeta.getAbsolutePath());
		System.out.println("Contiene: " + numHijos() + " elementos.");
		System.out.println("Espacio ocupado: " + espacio() + " bytes.");
	}

	public void cambiarNombre(String nuevoNombre) {
		File carpetaDestino = new File(carpeta.getParent(),nuevoNombre);
		if(carpetaDestino.exists())
			System.err.println("No se puede renombrar porque ya existe un elemento con dicho nombre.");
		else if(carpeta.renameTo(carpetaDestino))
			System.out.println("Carpeta renombrada correctamente.");
		else
			System.err.println("No se ha podido renombrar la carpeta.");
	}
	
	public static void main(String[] args) {
		
		Carpeta d = new Carpeta("C:\\Users\\aespasandin\\java\\prueba4_dam_dual\\src");
		
		System.out.println("¿está vacía?: " + d.estaVacio());
		d.listar();
		System.out.println("Nº elementos que contiene: " + d.numHijos());
		System.out.println("Espacio ocupado (bytes): " + d.espacio());
		
	}

}







