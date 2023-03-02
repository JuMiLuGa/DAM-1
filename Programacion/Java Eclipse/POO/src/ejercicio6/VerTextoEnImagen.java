package ejercicio6;

import java.io.*;
import java.util.*;

public class VerTextoEnImagen {

    public static void main(String[] args) {

        // Pedir la ruta de la imagen con el texto oculto
    	Scanner sc = new Scanner(System.in);
        String rutaImagen = "";
        File imagen = null;
        while (imagen == null) {
            System.out.print("Introduce la ruta de la imagen con el texto oculto: ");
            rutaImagen = sc.nextLine();
            imagen = new File(rutaImagen);
            if (!imagen.exists()) {
                System.out.println("El fichero no existe.");
                imagen = null;
            }
        }

        // Leer los últimos 100 bytes del fichero de imagen
        byte[] bytesTexto = null;
        try (InputStream input = new FileInputStream(imagen)) {
            input.skip(imagen.length() - 100);
            bytesTexto = input.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Convertir los bytes a una cadena de caracteres
        String texto = new String(bytesTexto).trim();

        System.out.println("El texto oculto en la imagen es: " + texto);
        sc.close();
    }
}

