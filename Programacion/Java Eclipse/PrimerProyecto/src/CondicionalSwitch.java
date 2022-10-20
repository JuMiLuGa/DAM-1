import java.util.Scanner;

public class CondicionalSwitch {

	public static void main(String[] args) {
	//ABRIMOS LA ENTRADA DE TEXTO
Scanner entrada = new Scanner(System.in);
//PONEMOS LA OPCIONES POSIBLES PARA QUE SE VEAN
System.out.println("CALCULO DE AREAS");
System.out.println("1. CUADRADO");
System.out.println("2. RECTANGULO");
System.out.println("3. TRIANGULO");
System.out.println("4. CIRCULO");
System.out.print("ELIJA UNA OPCION");
int opcion = entrada.nextInt();
//SE ABRE SWITCH
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
	break;	//BREAK ES PARA QUE EL CODIGO NO CONTINUE 
case 4:
	System.out.print("Introduzca el radio");
	double radio = entrada.nextDouble();
		System.out.printf("El area del circulo es : %.2f" , (Math.PI*Math.pow(radio, 2))); 
		//%.2f ES PARA QUE EL FORMATO DEL NUMERO TENGA 2 DECIMALES (IMPORTANTE EL "PRINTF") Y LA , ES PARA NO CONCATENAR
	break;
	
default:
	System.out.println("La opcion no es valida");
		//EN ESTE CASO NO SE PONE BREAK POR QUE NO HAY MAS CODIGOS EN EL SWITCH POR DEBAJO DE ESTE

				}
entrada.close(); //CERRAMOS LA ENTRADA DE TEXTO !!!FUERA DEL SWITCH¡¡¡
		}

}
