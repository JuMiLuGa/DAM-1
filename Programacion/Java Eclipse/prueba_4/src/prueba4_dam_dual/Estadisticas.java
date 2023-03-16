package prueba4_dam_dual;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Estadisticas {

  public static void generarEstadisticas(String rutaArchivo) {

    File archivo = new File(rutaArchivo);
    File estadisticas = new File(archivo.getParentFile(), "estadisticas.txt");

    int numPalabras = 0;
    int numLineas = 0;

    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {

      String linea;
      while ((linea = br.readLine()) != null) {
        numLineas++;
        String[] palabras = linea.split("\\s+");
        numPalabras += palabras.length;
      }

      String estadisticasTexto = archivo.getAbsolutePath() + ": " + numPalabras + " palabras en " + numLineas + " líneas.\n";

      try (FileWriter fw = new FileWriter(estadisticas, true)) {
        fw.write(estadisticasTexto);
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
