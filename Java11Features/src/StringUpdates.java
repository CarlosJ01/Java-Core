import java.util.stream.Collectors;

public class StringUpdates {
	
	public static void main(String[] args) {
		String str = "                 ";
		// Metodo para cadenas de puros espacios
		System.out.println(str.isBlank());
		
		str = "I\nam\nthe creator of my destiny";
		// Separar cadenas por el separador de espacions \n
		System.out.println(str.lines().collect(Collectors.toList()));
		
		// Unir unicode
		char c = '\u2000';
		str = str+c;
		System.out.println(str);
		
		// Quita unicode como el trim
		System.out.println(str.strip());
		//System.out.println(str.stripLeading());
		//System.out.println(str.stripTrailing());
		
		// Repetir una cadena :o como python
		System.out.println("-".repeat(100));
	}
	
}
