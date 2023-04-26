package Ordenacion;

import java.util.Arrays;

public class Ordenacion {

	public static void main(String[] args) {
		Color[] colores = new Color[7];
		colores[0]=new Color("rojo");
		colores[1]=new Color("azul");
		colores[2]=new Color("negro");
		colores[3]=new Color("blanco");
		colores[4]=new Color("amarillo");
		colores[5]=new Color("cian");
		colores[6]=new Color("rosa");
		
		System.out.print("colores: ");
		for(Color color:colores)
			System.out.print(color.toString() + " ");
		Arrays.sort(colores);

		System.out.print("\ncolores ordenados: ");
		for(Color color:colores)
			System.out.print(color + " ");
	}

}
