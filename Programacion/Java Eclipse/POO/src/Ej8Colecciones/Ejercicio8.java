package Ej8Colecciones;

import java.util.*;

public class Ejercicio8 {
    
    public static void estadisticasPalabras() {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> palabras = new TreeMap<>();
        System.out.println("Introduce 10 palabras:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Introduce la palabra " + (i + 1) + ": ");
            String palabra = scanner.next();
            palabras.put(palabra, palabra.length());
        }
        System.out.println("Resultados:");
        for (String palabra : palabras.keySet()) {
            System.out.println(palabra + ": " + palabras.get(palabra));
        }
        scanner.close();
    }
    
    public static void main(String[] args) {
        estadisticasPalabras();
    }
}
