package inmutable;

public class StringPoolDemo {
	
	public static void main(String[] args) {
		User user = new User(1, "Steve");
		User user1 = new User(1, "Steve");
		
		System.out.println(user);
		System.out.println(user1);
		
		String s1 = "Steve";
		String s2 = "Steve";
		String s3 = "steve";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		System.out.println(s1 == s2); // Compara las direcciones de memoria
		System.out.println(s1.equals(s2)); // Compara los caracteres
		System.out.println(s1 == s3);
		
		String s4 = new String("Steve"); // Crea una nueva direccion de memoria aunque usa el pool
		System.out.println(s4.hashCode());
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		
		System.out.println(user == user1);
		System.out.println(user.equals(user1)); // Equals en objetos es igual al ==, al menos que se sobreescriba
		
	}
	
}
