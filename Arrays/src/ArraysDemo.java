
public class ArraysDemo {
	
	public static void main(String[] args) {
		// Crear arreglos
		int arr[];
		
		int arr1[] = {1,2,3,4,5};
		
		int arr2[] = new int[5];
		arr2[0] = 1;
		arr2[1] = new Integer(2); // Autoboxing
		// arr2[2] = 30.52; => Solo del mismo tipo
		arr2[2] = 3;
		
		// arr2[7] = 7; no puedes salirte del rango del arrelo el tamaño es estatico 
		
		System.out.println("Elements of Array");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);	
		}
		
		// Foreach
		System.out.println("Foreach");
		for (int n : arr2) {
			System.out.println(n);
		}
		
		
		System.out.println("Other array");
		float[] arrL = new float[4];
		for (float l : arrL) {
			System.out.println(l);
		}
	}
	
}
