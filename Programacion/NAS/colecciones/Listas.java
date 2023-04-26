package colecciones;

import java.util.*;
public class Listas {

	public static void main(String[] args) {
//		ArrayList<String> colores = new ArrayList<String>();
		ArrayList<String> colores = new ArrayList<>();
		
		colores.add("rojo");
		System.out.println("colores: " + colores);
		colores.add("azul");
		System.out.println("colores: " + colores);
		
		colores.add(1, "verde");
		System.out.println("colores: " + colores);
		
		System.out.println("2º color: " + colores.get(1));
		
		System.out.println("Eliminar 2º color: " + colores.remove(1));
		System.out.println("colores: " + colores);
		
		System.out.println("Buscando \"azul\": " + colores.indexOf("azul"));
		System.out.println("Buscando \"verde\": " + colores.indexOf("verde"));
	
		String cor = colores.set(1, "verde");
		System.out.println("cor (color reemplazado): " + cor);
		System.out.println("colores: " + colores);
		
		System.out.println("Nº de elementos: " + colores.size());
		colores.clear();
		System.out.println("Nº de elementos (después del clear): " + colores.size());
		System.out.println("colores: " + colores);
		
		System.out.println("--------------");
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		colores.add("amarillo");
		colores.add("verde");
		colores.add("naranja");
		colores.add("verde");
		colores.add("violeta");
		System.out.println("colores: " + colores);
		System.out.println("índice del primer verde: " + colores.indexOf("verde"));
		System.out.println("índice del último verde: " + colores.lastIndexOf("verde"));
		
		System.out.println("eliminar Verde: " + colores.remove("Verde"));
		System.out.println("colores: " + colores);
		System.out.println("eliminar verde: " + colores.remove("verde"));
		System.out.println("colores: " + colores);
		
		List<String> sublistaColores = colores.subList(2, 4);
		System.out.println(sublistaColores);
		
		ArrayList<String> colorcillos = new ArrayList<>(colores.subList(1, 5));
		System.out.println("colorcillos: " + colorcillos);
		
		System.out.println("colores.contains(\"naranja\"): " + colores.contains("naranja"));
		System.out.println("colorcillos.contains(\"Azul\"): " + colorcillos.contains("Azul"));
		
		Collections.reverse(colores);
		System.out.println("colores (invertidos): " + colores);
		Collections.reverse(colores);
		System.out.println("colores: " + colores);
		Collections.sort(colores);
		System.out.println("colores (ordenado): " + colores);
		
//		colores.removeIf(n -> (n.equals("verde")));
//		colores.removeIf(n -> (n.charAt(0)=='v'));
//		colores.removeIf(n -> (n.charAt(n.length()-1)=='a'));
//		colores.removeIf(n -> (n.charAt(n.length()-2)=='j' && n.charAt(n.length()-1)=='o'));
		colores.removeIf(n -> (n.endsWith("jo")));
//		colores.removeIf(n -> (n.length()<6));
		System.out.println(colores);
		
//		String[] arrayColores = new String[colores.size()];
//		String[] arrayColores = new String[9];
		String[] arrayColores = new String[3];
		
		arrayColores = colores.toArray(arrayColores);
		
		System.out.println("\narrayColores");
		for(String color:arrayColores)
			System.out.print(color + " ");	
		
		System.out.println("\n-----------ITERADORES------------");
		
		Iterator<String> it = colores.iterator();
		while(it.hasNext()) {
//			System.out.println(it.next() + " " + it.next().toUpperCase());
//			String color = it.next();
//			System.out.println(color + " " + color.toUpperCase());
	
			if(it.next().equals("verde"))
				it.remove();
		}
		System.out.println(colores);
		
//		ArrayList<int> enteros = new ArrayList<>();
		ArrayList<Integer> enteros = new ArrayList<>();
		enteros.add(7);
		enteros.add(4);
		enteros.add(6);
		enteros.add(3);
		enteros.add(9);
		System.out.println("enteros: " + enteros);
		
		Iterator<Integer> iterador = enteros.iterator();
//		while(iterador.hasNext()) {
//			if((iterador.next() % 2) == 0)
//				iterador.remove();
//		}
		System.out.println("enteros: " + enteros);
		
//		for(Integer num : enteros) {
//			if(num % 2 == 0)
//				enteros.remove(num);
//		}
//		System.out.println("enteros: " + enteros);
		
		for(int i = 0; i<enteros.size();i++) {
			if(enteros.get(i) % 2 == 0) {
				enteros.remove(i);
			}
		}
		System.out.println("enteros: " + enteros);
		
	}

}




















