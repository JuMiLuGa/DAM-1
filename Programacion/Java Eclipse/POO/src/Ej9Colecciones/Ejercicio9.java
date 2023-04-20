package Ej9Colecciones;

import java.util.*;

public class Ejercicio9 {
    
    public static void palabrasPorLongitud() {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, List<String>> palabrasPorLongitud = new TreeMap<>();
        Set<Integer> longitudes = new TreeSet<>();
        int palabrasIntroducidas = 0;
        System.out.println("Introduce palabras hasta que haya al menos 5 longitudes distintas:");
        while (longitudes.size() < 5) {
            System.out.print("Introduce una palabra (palabras introducidas: " + palabrasIntroducidas + " longitudes: " + longitudes + "): ");
            String palabra = scanner.next();
            int longitud = palabra.length();
            if (!palabrasPorLongitud.containsKey(longitud)) {
                palabrasPorLongitud.put(longitud, new ArrayList<>());
                longitudes.add(longitud);
            }
            palabrasPorLongitud.get(longitud).add(palabra);
            palabrasIntroducidas++;
        }
        System.out.println("Resultados:");
        for (int longitud : palabrasPorLongitud.keySet()) {
            System.out.println(longitud + ": " + palabrasPorLongitud.get(longitud));
        }
        scanner.close();
    }
    
    public static void main(String[] args) {
        palabrasPorLongitud();
    }
}
