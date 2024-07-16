import java.util.Scanner;

public class Division {

	private static Scanner scanner;

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter two integers");
		
		scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		// Controlar las Exepciones con los bloques Try => donde esta la exepcion
		// Catch => Acciones para cada exepcion
		// Finally => Siempre se ejecuta sin importar que pase, si sucede una expecion
		// y no hay bloques catch falla
		try {
			// Runtime Error o Execption, detiene la ejecucion si no se maneja
			// java.lang.ArithmeticException division entre 0
			c = a/b;
			System.out.println("Result "+c);
		} catch (RuntimeException e) {
			System.err.println("Please not enter 0\n");
		} finally {
			System.out.println("Final");
		}
		
		System.out.println("More code");
	}

}
