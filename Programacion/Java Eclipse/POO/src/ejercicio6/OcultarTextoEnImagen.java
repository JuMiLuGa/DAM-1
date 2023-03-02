package ejercicio6;

import java.io.*;
import java.util.Scanner;

public class OcultarTextoEnImagen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Pedir la ruta de la imagen original
        String rutaImagen = "";
        File imagen = null;
        while (imagen == null) {
            System.out.print("Introduce la ruta de la imagen original: ");
            rutaImagen = sc.nextLine();
            imagen = new File(rutaImagen);
            if (!imagen.exists()) {
                System.out.println("El fichero no existe.");
                imagen = null;
            }
        }

        // Leer cada byte del fichero de imagen y almacenarlo en un array
        byte[] bytesImagen = null;
        try (InputStream input = new FileInputStream(imagen)) {
            bytesImagen = input.readAllBytes();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Pedir al usuario que introduzca un texto de como máximo 100 caracteres
        String texto = "";
        while (texto.length() > 100 || texto.length() == 0) {
            System.out.print("Introduce un texto de máximo 100 caracteres: ");
            texto = sc.nextLine();
            if (texto.length() > 100) {
                System.out.println("El texto es demasiado largo.");
            }
        }

        // Pedir al usuario que introduzca un nombre para la imagen de destino
        String nombreImagenDestino = "";
        while (nombreImagenDestino.length() == 0) {
            System.out.print("Introduce el nombre del fichero de imagen de destino: ");
            nombreImagenDestino = sc.nextLine();
        }

        // Crear el nuevo fichero de imagen con el nombre elegido y almacenarle los datos
        File imagenDestino = new File(imagen.getParentFile(), nombreImagenDestino);
        try (OutputStream output = new FileOutputStream(imagenDestino)) {
            // Escribir todos los bytes de la imagen original
            output.write(bytesImagen);

            // Escribir en el fichero cada uno de los caracteres del texto introducido
            output.write(texto.getBytes());

            // Escribir caracteres no visibles hasta completar los 100 caracteres máximos
            int caracteresFaltantes = 100 - texto.length();
            for (int i = 0; i < caracteresFaltantes; i++) {
                output.write(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Se ha ocultado el texto en la imagen.");
        sc.close();
    }
   
}

