package comparator;

import java.util.Comparator;

// Usar la interface de comparator para hacer un comparador de clases que se usara para comparar otras clases
public class SBComparator implements Comparator<StringBuffer> {

	// Funcion para comparar objetos y saber quien va adelante o atras o si son iguales
	// -N 0 N
	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		return s1.compareTo(s2);
	}

}
