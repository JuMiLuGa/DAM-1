package ejercicio5;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String ruta = "E:\\DAM 1\\Programacion\\Java Eclipse\\POO\\src\\ejercicio5\\numerosRealesDeUsuarioUnoPorLinea.txt";
        double[] numerosReales = new double[10];
        int i = 0;
        
        while (i < numerosReales.length) {
            System.out.print("Introduzca un número real (posición " + i + "): ");
            try {
                numerosReales[i] = ent.nextDouble();
                ent.nextLine();
                i++;
            } catch (InputMismatchException e) {
                System.out.println("Número introducido no válido.");
                ent.nextLine(); 
            }
        }
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            for (int numero : numerosReales) {
                writer.write(Double.toString(numero));
                writer.newLine();
            }
            System.out.println("Se han guardado " + numerosReales.length + " números reales en " + ruta);
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero.");
        }
        
        ent.close();
    }
}
