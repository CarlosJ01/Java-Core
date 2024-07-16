
public class MultiCatch {
	public static void main(String[] args) {
		try {
			String input = args[0];
			System.out.println(input);
			int output = Integer.parseInt(input);
			System.out.println(output);
			
		// Multiples catch para cada tipo de Exepcion
		// El padre de todas las Exepciones es Exception => RuntimeException
		// Las Exepciones se comparan como en el Switch
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Input requeret");
		} catch (NumberFormatException e) {
			System.err.println("Invalit input provaider\n");
		} finally {
			System.out.println("Final");
		}
		
		System.out.println("Continue");
	}
}
