package documentos.RRHH;

public class Contrato {

	private String nombre;
    private int duracionMeses;
    
    public Contrato(String nuevoNombre, int nuevaDuracion) {
    	this.nombre = nuevoNombre;
    	this.duracionMeses = nuevaDuracion;
    }
    
    public void imprimirInfo() {
    	System.out.println("Nombre: " + nombre);
    	System.out.println("Duracion: " + duracionMeses);
    	System.out.println();
    }
    
	public static void main(String[] args) {
		

	}

}
