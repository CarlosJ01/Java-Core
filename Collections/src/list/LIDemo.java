package list;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LIDemo {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		list.add("abc");
		list.add("def");
		list.add("xyz");
		
		// Iterador para recorrer las listas
		ListIterator<String> listIterator = list.listIterator();
		while (listIterator.hasNext()) {
			String string = (String) listIterator.next();
			System.out.println(string);
		}
		
		// Puede recorrer las listas al reves
		System.out.println("Travesing the list in the backward dirrection");
		while (listIterator.hasPrevious()) {
			String string = (String) listIterator.previous();
			System.out.println(string);
		}
	}
	
}
