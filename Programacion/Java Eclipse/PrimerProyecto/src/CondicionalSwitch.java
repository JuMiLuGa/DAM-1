import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
		
Scanner entrada = new Scanner(System.in);
System.out.println("CALCULO DE AREAS");
System.out.println("1. CUADRADO");
System.out.println("2. RECTANGULO");
System.out.println("3. TRIANGULO");
System.out.println("4. CIRCULO");
System.out.print("ELIJA UNA OPCION");
int opcion = entrada.nextInt();

switch (opcion) {
case 1:
	System.out.print("Introduzca el tamaño del lado");
	double lado = entrada.nextDouble();
		System.out.println("El area del cuadrado es: " + (lado*lado));
	break;
case 2:
	System.out.print("Introduzca el alto");
	double alto = entrada.nextDouble();
	System.out.print("Introduzca el ancho");
	double ancho = entrada.nextDouble();
		System.out.println("El area del rectangulo es: " + (alto*ancho));
	break;	
case 3:
	System.out.print("Introduzca la base");
	double base = entrada.nextDouble();
	System.out.print("Introduzca la altura");
	double altura = entrada.nextDouble();
		System.out.print("El area del triangulo es: " + ((base*altura)/2));
	break;	
case 4:
	System.out.print("Introduzca el radio");
	double radio = entrada.nextDouble();
		System.out.printf("El area del circulo es : %.2f" , (Math.PI*Math.pow(radio, 2)));
	break;
	
default:
	System.out.println("La opcion no es valida");
		

				}
entrada.close();
		}

}
