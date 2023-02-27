package GestorFicheros;

import java.io.*;

public class GestionFicheros {

	public static void main(String[] args) {
		File fichero = new File("ejemplo.txt");
		System.out.println("¿existe ejemplo.txt?: " + fichero.exists());
		System.out.println("Ruta absoluta de ejemplo.txt: " + fichero.getAbsolutePath());

		File directorioProyecto = new File("").getAbsoluteFile();
		System.out.println("Ruta absoluta directorioProyecto: " + directorioProyecto.getAbsolutePath());

		String[] listado = directorioProyecto.list();
		System.out.println("Nº elementos en " + directorioProyecto.getAbsolutePath() + ": " + listado.length);

		for (String item : listado) {
			System.out.print(item);
			File elemento = new File(directorioProyecto, item);
			if (elemento.isDirectory())
				System.out.println(" (directorio)");
			else if (elemento.isFile())
				System.out.println(" (fichero) ");
			else
				System.out.println();
			if (elemento.isDirectory()) {
				String[] listadoSubdirectorio = elemento.list();
				for (int i = 0; i < listadoSubdirectorio.length; i++) {
					System.out.println(" " + listadoSubdirectorio[i]);

				}
			}

		}
		File d = new File(directorioProyecto, "pruebas");
		System.out.println(d.mkdir());
		File f = new File(d, "ejemplo.txt");

		try {
			if (f.createNewFile())
				System.out.println("Fichero creado correctamente");
			else
				System.out.println("No se ha podido crear el fichero");

		} catch (IOException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			System.err.println("No hay permisos suficientes para crear el fichero");
		}

		try (FileWriter escritor = new FileWriter(f)) {
			escritor.write("Texto de ejemplo despues de crear el fichero");
		} catch (IOException e) {
			e.printStackTrace();
		}

		File f2 = new File(d, "renombrado.txt");
		if (f.renameTo(f2))
			System.out.println("fichero renombrdo correctamente");
		else
			System.out.println("no se ha podido renombrar el fichero");

		if (f.delete())
			System.out.println("Se ha borrado correctamente");
		else
			System.out.println("no se hapodido borrar el fichero");
	}

}
