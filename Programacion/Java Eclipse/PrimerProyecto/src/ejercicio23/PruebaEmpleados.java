package ejercicio23;

public class PruebaEmpleados {

	public static void main(String[] args ) {
		EmpleadoProduccion ep = new EmpleadoProduccion("Juan", 78965415, 30, 1300, "tarde");
		
		System.out.println(ep.getNombre() + " con NIF " + ep.getNif() + " es un empleado de produccion");
		System.out.printf("Tiene %d dias de vacaciones y un salario de %.2f €", ep.getDiasVacaciones(), ep.getSalario());
		System.out.println();
		System.out.println("Trabaja en el turno de " + ep.getTurno());
		
		
EmpleadoDistribucion ed = new EmpleadoDistribucion("Manuel", 73574441, 25, 1300, "prueba");
		
		System.out.println(ed.getNombre() + " con NIF " + ed.getNif() + " es un empleado de produccion");
		System.out.printf("Tiene %d dias de vacaciones y un salario de %.2f €", ed.getDiasVacaciones(), ed.getSalario());
		System.out.println();
		System.out.println("Trabaja en el turno de " + ed.getRegion());
	}
}
