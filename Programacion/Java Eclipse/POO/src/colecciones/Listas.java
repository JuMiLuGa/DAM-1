package colecciones;

import java.util.*;

public class Listas {

	public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<>();
        
        colores.add("rojo");
        System.out.println("colores: "+colores);
        colores.add("azul");
        System.out.println("colores: "+colores);
        
        colores.add(1, "verde");
        System.out.println("colores: "+colores);
        
        System.out.println("2º color: "+colores.get(1));
        
        System.out.println("Eliminar 2º color: "+colores.remove(1));
        System.out.println("colores: "+colores);
        
        System.out.println("Buscando \"azul\": "+colores.indexOf("azul"));
        System.out.println("Buscando \"rojo\": "+colores.indexOf("rojo"));
        
        String cor = colores.set(1,  "verde");
        System.out.println("cor (color remplazado): " + cor);
        System.out.println("colores: "+colores);
    
        System.out.println("Nº Elementos: "+colores.size());
        colores.clear(); // Vacia la lista
        System.out.println("Nº Elementos: "+colores.size());
        System.out.println("colores: "+colores);
        
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        colores.add("amarillo");
        colores.add("verde");
        colores.add("naranja");
        colores.add("verde");
        colores.add("violeta");
        
        System.out.println("colores: "+colores);
        
        System.out.println("Índice del primer verde: "+ colores.indexOf("verde")); //primer verde
        System.out.println("Índice del último verde: "+ colores.lastIndexOf("verde")); //último verde
        
        System.out.println("Eliminar Verde: "+ colores.remove("Verde")); //false porque no lo consigue eliminar.
        System.out.println("colores: "+colores);
        System.out.println("Eliminar Verde: "+ colores.remove("verde")); //true porque lo consigue eliminar.
        System.out.println("colores: "+colores);
        
        List<String> sublistaColores = colores.subList(1, 5);
        System.out.println(sublistaColores);
        
        ArrayList<String> colorcillos = new ArrayList<>(sublistaColores);
        System.out.println("colorcillo: "+colorcillos);
        
        System.out.println("colores.contais(\"naranja\"):"+ colores.contains("naranja"));
        System.out.println("colorcillos.contais(\"naranja\"):"+ colorcillos.contains("Azul"));
        
        
        Collections.reverse(colores);
        System.out.println("colores (invertidos): "+ colores);
        Collections.reverse(colores);
        System.out.println("colores (ordenado): "+ colores);
        
//        colores.removeIf(n -> (n.equals("verde"))); BORRA TODOS LOS VERDES
//        colores.removeIf(n -> (n.charAt(0)=='v')); BORRA TODOS LOS QUE EMPIEZAN POR "V"
//        colores.removeIf(n -> (n.charAt(n.length()-1)=='a')); BORRA TODOS LOS QUE ACABAN POR "A"
//        colores.removeIf(n -> (n.endsWith("jo"))); BORRA LOS QUE ACABAN EN "JO"
//        colores.removeIf(n -> (n.length() < 6)); BORRA LOS QUE TIENE MENOS DE X LETRAS
        System.out.println(colores);
        
        String[] arrayColores = new String[colores.size()];
        
        arrayColores = colores.toArray(arrayColores);
        
        System.out.println("\narrayColores");
        for (String color : arrayColores) {
            System.out.println(color+" ");
        }
        System.out.println("\n-----------ITERADORES--------");
        
        Iterator<String> it = colores.iterator();
        while(it.hasNext()) {
//            System.out.println(it.next());
//            String color = it.next();
//            System.out.println(color + " " + color.toUpperCase());
            
            if (it.next().equals("verde"))
                it.remove();
        }
        System.out.println(colores);
        
    }

}
