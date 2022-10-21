import java.util.Scanner;
public class EjercicioCond4 {

	public static void main(String[] args) {
		
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca primer número: ");
        int a=entrada.nextInt();
        System.out.print("Introduzca segundo número: ");
        int b=entrada.nextInt();
        System.out.print("Introduzca tercer número: ");
        int c=entrada.nextInt();

        if(a>b && b>c)
            System.out.println( c + ", " + b + ", "+a);
        else{
            if(a>c && c>b)
                System.out.println(b + ", " + c + ", " + a);
            else{
               if(b>a && a>c)
                   System.out.println(c + ", " + a + ", " + b);
               else{
                  if(b>c && c>a)
                      System.out.println(a + ", " + c + ", " + b);
                  else{
                      if(c>a && a>b)
                         System.out.println(b + ", " + a + ", " + c);
                      else{
                         if(c>b && b>a)
                            System.out.println(a + ", " + b + ", " + c);
                        }
                      }
                   }
                }
            }
        entrada.close();
        }
    }