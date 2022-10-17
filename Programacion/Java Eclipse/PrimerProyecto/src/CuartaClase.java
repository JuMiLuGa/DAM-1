
public class CuartaClase {
	public static void main(String args[]) {
		
	double obj1, obj2, obj3, obj4, obj5;
	int IVA;
	obj1=0.5;
	obj2=1.5;
	obj3=6.7;
	obj4=5.3;
	obj5=1;
	IVA=21;
	
	System.out.println("El precio sin IVA es de: "+ (obj1+obj2+obj3+obj4+obj5)+ " €");
	System.out.println("A continuacion le añadimos el iva de "+ IVA +"%" );
	System.out.println("El IVA seria equivalente a: "+ (((obj1+obj2+obj3+obj4+obj5)*IVA)/100)+ " €");
	System.out.println("El precio incluyendo el IVA es de: "+ ((((obj1+obj2+obj3+obj4+obj5)*IVA)/100)+(obj1+obj2+obj3+obj4+obj5))+ " €");
	
	
	}
}
