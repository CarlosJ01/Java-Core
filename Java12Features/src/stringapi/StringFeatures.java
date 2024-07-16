package stringapi;

public class StringFeatures {
	
	public static void main(String[] args) {
		String s = "   All the power is with you";
		System.out.println(s);
		
		System.out.println("-".repeat(100));
		
		// Identacion espacios al inicio
		System.out.println(s.indent(5));
		System.out.println(s.indent(-3));
		
		// Transformar la cadena con una funcion
		String s1 = "10";
		System.out.println(s1.transform(Integer::parseInt));
		
		
	}
	
}
