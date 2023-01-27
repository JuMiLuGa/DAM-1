package clases_anidadas;

public class ClaseExterna {
	static class ClaseAnidadaEstatica{
		public void imprimir() {
			System.out.println("Clase Anidada Estatica");
		}
		class ClaseAnidadaInterna{
			public void imprimir() {
				System.out.println("Clase Anidada Interna");
			}
		}
	}
	
}
