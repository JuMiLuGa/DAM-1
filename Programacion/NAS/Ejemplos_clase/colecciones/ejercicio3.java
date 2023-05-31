package colecciones;

import java.util.*;

public class ejercicio3 {

	public static void eliminaRepetidos(List<Integer> enteros) {
//		Set<Integer> enterosSinRepetir = new HashSet<>();
		List<Integer> enterosNoRepetidos = new ArrayList<>();
		for(Integer entero : enteros) {
			if(!enterosNoRepetidos.contains(entero))
				enterosNoRepetidos.add(entero);
		}
		System.out.println("enterosNoRepetidos (dentro método): " + enterosNoRepetidos);
		
//		enterosSinRepetir.addAll(enteros);
		
//		enteros = enterosNoRepetidos;
		enteros.clear();
		enteros.addAll(enterosNoRepetidos);
		System.out.println("enteros (dentro método): " + enteros);
	}
	
	public static void metodoPrimitivos(int valor) {
		System.out.println("valor antes asignacion: " + valor);
		valor = 7;
		System.out.println("valor después de asignación: " + valor);
	}
	
	public static void metodoArrays(int[] valores) {
		if(valores.length>1)
			valores[1] = 7;
		System.out.println("valores dentro del método: " + Arrays.toString(valores));
	}
	
	public static void metodoSB(StringBuilder sb) {
//		sb=new StringBuilder("Se está asignando otra referencia. ");
//		sb.append("No se reflejará fuera del método");
		sb.append("Esto sí aparece");
		System.out.println("sb dentro del método: " + sb.toString());
	}
	
	public static void metodoWTF() {
		{ // BLOQUE A
			int cuatro = 4;
			List<Integer> nums = new ArrayList<>(Arrays.asList(4, 8, 15, 16, 23, 42));
			System.out.println("original: " + nums);
			nums.remove(cuatro);
//			nums.remove(Integer.valueOf(cuatro));
//			nums.remove((Integer)cuatro);
			System.out.println("BLOQUE A: " + nums);
		}
		
		{ // BLOQUE B
			Integer cuatro = 4;
			List<Integer> nums = new ArrayList<>(Arrays.asList(4, 8, 15, 16, 23, 42));
			System.out.println("original: " + nums);
//			nums.remove(cuatro);
			nums.remove((int)cuatro);
			System.out.println("BLOQUE B: " + nums);
		}
	}
	
	
	public static void main(String[] args) {
		List<String> listaColores = new ArrayList<>(Arrays.asList("rojo", "verde","azul"));
		String[] colores = listaColores.toArray(new String[0]);
		
		listaColores.add("violeta");
		listaColores.add("amarillo");
		listaColores.add("zapato");
		listaColores.add("Verde");
		listaColores.add("azul");
		listaColores.add("azul");
		for(String color : colores) {
			System.out.println(color);
		}
		System.out.println("array: " + Arrays.toString(colores));
		System.out.println("lista: " + listaColores);
		
		System.out.println(String.join("<->", colores));
		System.out.println(String.join("<->", listaColores));
		
		
		String frase = "En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
		String[] palabras = frase.split(" ");
		
		System.out.println(Arrays.toString(palabras));
		Arrays.sort(palabras, Collections.reverseOrder());
		
//		Arrays.fill(palabras, "Sancho");
		System.out.println(Arrays.toString(palabras));
		
		System.out.println(Collections.min(listaColores));
		System.out.println(listaColores);
		Collections.shuffle(listaColores);
		System.out.println(listaColores);
		System.out.println(Collections.frequency(listaColores, "Verde"));
		

		
		
		
		
//		metodoWTF();
		
//		List<Integer> enteros = new ArrayList<>(Arrays.asList(1, 2, 3, 3, 3, 4, 2, 5));
//	    System.out.println("enteros (main) (antes de eliminar repetidos): " + enteros);
//	    eliminaRepetidos(enteros);
//	    System.out.println("enteros (main) (después de eliminar repetidos): " + enteros);
		
//		int entero = 9;
//		metodoPrimitivos(entero);
//		System.out.println(entero);
		
//		
//		int[] nums = {1,2,3};
//		System.out.println("\nnums antes de la llamada al método: " + Arrays.toString(nums));
//		metodoArrays(nums);
//		System.out.println("\nnums después de la llamada al método: " + Arrays.toString(nums));
		
//		StringBuilder sb = new StringBuilder("Hola que tal?");
//		System.out.println("sb antes del método: " + sb.toString());
//		metodoSB(sb);
//		System.out.println("sb después del método: " + sb.toString());

	}

}
