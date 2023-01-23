package ejercicio15;

class Triangulo {
    private Punto v1;
    private Punto v2;
    private Punto v3;

    public Triangulo(Punto p1, Punto p2, Punto p3) {
        this.v1 = p1;
        this.v2 = p2;
        this.v3 = p3;
     }

    public Punto getV1() {
		return v1;
	}

	public void setV1(Punto v1) {
		this.v1 = v1;
	}

	public Punto getV2() {
		return v2;
	}

	public void setV2(Punto v2) {
		this.v2 = v2;
	}

	public Punto getV3() {
		return v3;
	}

	public void setV3(Punto v3) {
		this.v3 = v3;
	}

	public void mostrarVertices() {
    	v1.mostrarCoordenadas();
    	System.out.print(", ");
    	v2.mostrarCoordenadas();
    	System.out.print(", ");
    	v3.mostrarCoordenadas();
    }

    public double obtenerPerimetro() {
       double lado1 = v1.obtenerDistanciaEntrePuntos(v1, v2);
       double lado2 = v2.obtenerDistanciaEntrePuntos(v2, v3);
       double lado3 = v3.obtenerDistanciaEntrePuntos(v3, v1);
       return lado1 + lado2 + lado3;
    }
    
   public static void main(String[] args) {
	   Punto p1 = new Punto(3, 2);
	   Punto p2 = new Punto(8, 3);
	   Punto p3 = new Punto(7, 5);
	   
	   Triangulo t1 = new Triangulo(p1, p2, p3);
	   
	   t1.mostrarVertices();
	   System.out.println();
	   
	   System.out.printf("%.2f", t1.obtenerPerimetro());
	   
   }
}

