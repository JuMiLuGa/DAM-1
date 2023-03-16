package prueba4_dam_dual;

import java.util.Scanner;

public class EjercicioA {
    public static void main(String[] args) {

        final int CANTIDAD = 5;

        int[] enteros = new int[CANTIDAD];

        int indice = 0;

        int divisor = 0;

        int contador = 0;

        Scanner entrada = new Scanner(System.in);

        while (contador < CANTIDAD) {
            try {
                System.out.print("Introduzca un índice del array: ");
                indice = Integer.parseInt(entrada.nextLine());

                System.out.print("Introduzca un divisor: ");
                divisor = Integer.parseInt(entrada.nextLine());

                enteros[indice] = 5 / divisor;
                contador++;

            } catch (NumberFormatException e) {
                System.out.println("Error: el valor introducido debe ser un número entero.");
            } catch (ArithmeticException e) {
                System.out.println("Error: no se puede dividir entre cero.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: el índice introducido está fuera del rango del array.");
            }
        }

        System.out.print("enteros: ");
        for (int entero : enteros)
            System.out.print(entero + " ");
        entrada.close();
    }
}
