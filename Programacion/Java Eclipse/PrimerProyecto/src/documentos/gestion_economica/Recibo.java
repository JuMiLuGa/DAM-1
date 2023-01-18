package documentos.gestion_economica;

public class Recibo {

	public int dia;
    public int mes;
    public int año;
    public String concepto;
    
    public Recibo(String nuevoConcepto, int nuevoDia, int nuevoMes, int nuevoAño) {
    	this.concepto = nuevoConcepto;
    	this.dia = nuevoDia;
    	this.mes = nuevoMes;
    	this.año = nuevoAño;
    }
    public void imprimirInfo() {
    	System.out.println("Concepto: " + concepto);
    	System.out.println("Fecha: " + dia + "/" + mes + "/" + año);
    	System.out.println();
    }
	
	public static void main(String[] args) {
		

	}

}
