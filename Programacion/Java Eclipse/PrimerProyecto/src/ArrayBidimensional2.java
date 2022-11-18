
public class ArrayBidimensional2 {
	public static void main(String[] args) {
		
		double[][] matriz = new double[4][3];
		
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length;j++) {
				matriz[i][j]=Math.random() * 101;
			}
		}
		
		System.out.println("For");
		System.out.println();
		
		for(int i=0; i<matriz.length;i++) {
			for(int j=0 ; j<matriz[i].length;j++) {
				System.out.printf("%.2f\t",matriz[i][j]);
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("For each");
		System.out.println();
		
		for(double[] fila : matriz) {
			for(double item : fila) {
				System.out.printf("%.2f\t" ,item);
			}
			System.out.println();
		}
	}

}

