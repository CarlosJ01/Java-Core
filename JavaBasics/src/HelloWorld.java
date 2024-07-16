public class HelloWorld {

	public static void main(String[] args) {
		// Imprimir una linea en consola
		System.out.println("Hello World");
	}
	
	// Los bloques estaticos se ejecutan antes del main
	static {
		System.out.println("Static Block 1");
	}
	
	static {
		System.out.println("Static Block 2");
	}
}
