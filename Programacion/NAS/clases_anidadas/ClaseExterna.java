package clases_anidadas;

public class ClaseExterna {
	
	static class ClaseAnidadaEstatica{	
		
		public void imprimir() {
			System.out.println("Clase Anidada Estática");
		}
	}
	
	 class ClaseAnidadaInterna{
		public void imprimir() {
			System.out.println("Clase Anidada Interna");
		}
	}
	
	 public void metodoExterno() {
		 
		 class ClaseLocal{
			 public void metodoLocal() {
				 System.out.println("Método local de Clase local");
			 }
		 }
		 
		 ClaseLocal cl = new ClaseLocal();
		 cl.metodoLocal();
		 System.out.println("Fin del método metodoExterno de la ClaseExterna ");
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	
}









