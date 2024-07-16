package list;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	
	public static void main(String[] args) {
		// Podemos usar la interface como variable
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 100; i+=10) {
			list.add(i);
		}
		System.out.println(list);
		
		// Insertar valores en un indice
		list.add(2, 100);
		System.out.println(list);
		
		// Cambiar los valores
		list.set(3, 200);
		System.out.println(list);
		
		List<Integer> secondList = new ArrayList<Integer>();
		secondList.add(111);
		secondList.add(222);
		secondList.add(333);
		System.out.println(secondList);
		
		// Unir dos listas con o sin indice
		list.addAll(4, secondList);
		System.out.println(list);
		
		// Si la lista contiene un objeto
		if (list.contains(222)) {
			System.out.println("List have the value");
		} else {
			System.out.println("List doesn't have the value");
		}
		
		// Tamño de la lista y obtener los elementos en un indice
		System.out.println("Elements in the list");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		// Eliminar un elemento por si o por indice
		list.remove(3);
		System.out.println(list);
		
	}
	
}
