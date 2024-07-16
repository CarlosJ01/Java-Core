
public class ArrayIndexOOBDemo {
	public static void main(String[] args) {
		int arr[] = {10,20,30};
		
		try {
			// java.lang.ArrayIndexOutOfBoundsException => Salir de arreglo
			for (int i = 0; i < arr.length + 1; i++) {
				System.out.println(arr[i]);
			}			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Salir del rango");
		}
		
	}
	
	void method1() {
		System.out.println("Method One");
	}
}
