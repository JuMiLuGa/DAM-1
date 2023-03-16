package prueba4_dam_dual;

import java.io.File;

public class Carpeta {
    private File carpeta;

    public Carpeta(String ruta) {
        carpeta = new File(ruta);

        if (carpeta.exists() && !carpeta.isDirectory()) {
            System.err.println(ruta + " no es un directorio");
        } else if (!carpeta.exists()) {
            if (carpeta.mkdirs()) {
                System.out.println("Carpeta creada correctamente en " + carpeta.getAbsolutePath());
            } else {
                System.err.println("No se ha podido crear la carpeta en " + carpeta.getAbsolutePath());
            }
        }
    }

    public int numHijos() {
        if (!carpeta.isDirectory()) {
            return -1;
        }
        return carpeta.list().length;
    }

    public boolean estaVacio() {
        if (!carpeta.isDirectory()) {
            return false;
        }
        return carpeta.list().length == 0;
    }

    public void listar() {
        if (!carpeta.isDirectory()) {
            System.err.println(carpeta.getAbsolutePath() + " no es un directorio");
            return;
        }
        File[] archivos = carpeta.listFiles();
        for (File archivo : archivos) {
            if (archivo.isDirectory()) {
                System.out.println(archivo.getName() + " (" + archivo.list().length + ")");
            } else {
                System.out.println(archivo.getName());
            }
        }
    }

    public long espacio() {
        if (!carpeta.isDirectory()) {
            return -1;
        }
        long espacio = 0;
        File[] archivos = carpeta.listFiles();
        for (File archivo : archivos) {
            espacio += archivo.length();
        }
        return espacio;
    }

    public void mostrarPropiedades() {
        if (!carpeta.isDirectory()) {
            System.err.println(carpeta.getAbsolutePath() + " no es un directorio");
            return;
        }
        System.out.println("Ruta absoluta: " + carpeta.getAbsolutePath());
        System.out.println("Contiene " + numHijos() + " elementos");
        System.out.println("Espacio ocupado: " + espacio() + " bytes");
    }

    public void cambiarNombre(String nuevoNombre) {
        if (carpeta.renameTo(new File(carpeta.getParentFile(), nuevoNombre))) {
            System.out.println("Carpeta renombrada correctamente a " + nuevoNombre);
        } else {
            System.err.println("No se ha podido renombrar la carpeta a " + nuevoNombre);
        }
    }
}
