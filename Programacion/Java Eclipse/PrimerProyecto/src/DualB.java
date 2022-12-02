import java.util.Scanner;

public class DualB {

	public static void main(String[] args) {
		
		//variables inicio
		int numP;
		int sumaPi = 0;
		int sumaPu = 0;
		int diff;
		//variables fin
		
		//Pedir numero de piezas por teclado
		System.out.print("Introduzca el numero de piezas que componen el puzle: ");
		Scanner ent = new Scanner(System.in);
		numP = ent.nextInt();
		
		//Definimos eltamaño del array a partir del numero de piezas
		
		int[] puzle = new int[numP];
		for(int i = 0 ; i<puzle.length ; i++ ) {
			puzle[i] = (i+ 1) ;
		}
		
		//Pedir por teclado las piezas
		int[] pieza = new int[(numP-1)];
		for(int i = 0 ; i < (puzle.length-1) ; i++ ) {
			System.out.print("Introduzca la pieza nº " + (i+1) + ": ");
			pieza[i] = ent.nextInt();
		}
		
		//Realizar la suma de lo dos arrays
		//PUZLE
		for(int i = 0 ; i<puzle.length ; i++ ) {
			sumaPu = sumaPu + puzle[i];
		}
		//PIEZAS
		for(int i = 0 ; i < (puzle.length-1) ; i++ ) {
			sumaPi = sumaPi + pieza[i];
		}
		
		//Obtener diferencia = pieza que falta
		diff = sumaPu - sumaPi;
		
		//Decir que pieza falta
		System.out.println("La pieza que falta es la pieza " + diff);
	

		ent.close();
	}

}
