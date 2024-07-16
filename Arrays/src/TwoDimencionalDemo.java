
public class TwoDimencionalDemo {
	
	public static void main(String[] args) {
		// Una matriz de enteros
		int[][] matrix = new int[3][3];
		int[][] matrix1 = {{1,2,3}, {1,2,3}, {1,2,3}};
		
		// For Each
		for (int[] fil : matrix1) {
			for (int col : fil) {
				System.out.println(col);
			}
		}
		
		System.out.println("\n");
		
		// For
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix1[i].length; j++) {
				System.out.println(matrix1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(matrix);
		
	}
	
}
