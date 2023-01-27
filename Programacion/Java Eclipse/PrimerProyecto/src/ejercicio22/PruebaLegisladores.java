package ejercicio22;

public class PruebaLegisladores {
	public static void main(String[] args) {
		int indice = 0;
		Legislador[] legisladores = new Legislador[7];
		
		legisladores[indice++] = new Diputado("Carlos", "Pérez Galdós", 49, true, "Asturias", "PSOE", 506, 25);
		legisladores[indice++] = new Diputado("Diego", "Ramírez Suárez", 51, false, "Huesca", "Podemos", 208, 95);
		legisladores[indice++] = new Diputado("Alberto", "Sánchez Garay", 19, false, "Badajoz", "PP", 774, 104);
		legisladores[indice++] = new Diputado("María", "López Lopérfido", 39, true, "Sevilla", "VOX", 225, 100);
		legisladores[indice++] = new Senador("Luisina", "Marlon Brando", 62, false, "Cantabria", "PSOE", 58, 97);
		legisladores[indice++] = new Senador("Nestor Andrés", "Plis Plas", 61, true, "Alicante", "PSOE", 012, 41);
		legisladores[indice++] = new Senador("Cristina", "Peláez Fernández", 60, false, "León", "PP", 013, 42);

		for (Legislador l : legisladores) {
			System.out.println("\n" + l.toString());
			l.mostrarCamaraEnQueTrabaja();
		}
	}
}