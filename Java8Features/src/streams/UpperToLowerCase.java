package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class UpperToLowerCase {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("JOHN");
		list.add("CARLOS");
		list.add("FATIMA");
		list.add("CITCLALI");
		list.add("JIM");
		System.out.println(list);
		
		// Map lo que hace es aplicarle el codigo a cada uno de los elementos de la colleccion
		List<String> list2 = list.stream().map(s->s.toLowerCase()).collect(Collectors.toList());
		System.out.println(list2);
	}

}
