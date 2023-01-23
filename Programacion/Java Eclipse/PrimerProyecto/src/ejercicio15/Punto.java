package ejercicio15;

import java.lang.Math;

class Punto {
    private int x;
    private int y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String obtenerCadenaCoordenadas() {
        return "(" + x + "," + y + ")";
    }

    public void mostrarCoordenadas() {
        System.out.print("(" + x + "," + y + ")");
    }

    public void cambiarCoordenadas(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double obtenerDistanciaEntrePuntos(Punto A, Punto B) {
    	int x = (B.getX() - A.getX());
    	int y = (B.getY() - A.getY());
        return  Math.sqrt((x*x + y*y));
    }
}