
public class StringMethods {

	public static void main(String[] args) {
		String s = "Hello World";
		
		System.out.println(s.length()); // Tamaño de la cadena depende de los caracteres
		System.out.println(s.indexOf('o')); // El indese de un caracter
		System.out.println(s.charAt(3));// Caracter en el indese n
		
		System.out.println(s.substring(2)); // Subcadena que empieza en n
		System.out.println(s.substring(0, 3));// Subcadena que empieza en n con longitud m
		
		String[] split = s.split(" "); // Regresa un arreglo de cadanas de la original dividia por el caracter especificado
		for (String string : split) {
			System.out.println(string); 
		}
		
		System.out.println(s.replace("l", "k")); // Remplaza todos los caracteres por otros especificados
		System.out.println(s.toUpperCase()); // Mayusculas
		System.out.println(s.toLowerCase()); // Minusculas
	}
	
}
