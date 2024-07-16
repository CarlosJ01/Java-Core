package collectionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();		
		list.add("Z");
		list.add("A");
		list.add("X");
		list.add("B");
		System.out.println(list);
		
		// Ordenar una lista asendente
		Collections.sort(list);
		System.out.println(list);
		
		// Usar un comparador custom
		Collections.sort(list, new MyComparator());
		System.out.println(list);
		
		// Buscar el index de un elemento
		int index = Collections.binarySearch(list, "X");
		System.out.println(index);
		System.out.println(list.get(index));
	}
	
}
