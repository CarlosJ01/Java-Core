package stringbuffer;

public class SBDemo {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity()); // Capacidad inicial
		
		// Como conacatenar
		sb.append("All the power is with you :");
		sb.append("You can do Anything and Everything");
		
		System.out.println(sb);
		System.out.println("Current capacity: "+sb.capacity());
		
		System.out.println(sb.charAt(10));
		
		StringBuffer sb1 = new StringBuffer("abc");
		System.out.println(sb1);
		System.out.println(sb1.reverse()); // Invertir la cadena
		
		System.out.println(sb1.insert(3, "xyz")); // Insertar una cadena en medio
		System.out.println(sb1.delete(3, 6));// Eliminar en la posicion n a la m
	}
	
}
