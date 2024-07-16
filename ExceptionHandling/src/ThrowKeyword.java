
public class ThrowKeyword {
	
	public static void main(String[] args) {
		// Lanza una expecion cualquiera como un objeto de la clase
		// Se usa para lanzar expeciones controladas
		try {
			throw new RuntimeException("Funds not aviable");			
		} catch (Exception e) {
			System.err.println("Exception");
		}
	}
}
