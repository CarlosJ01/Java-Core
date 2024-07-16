package list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// Puedes agregar varios objetos o tipos, todos son object, rapido par alectura y no para alteraciones
		// Pero es mejor solo entrar un tipo ya que al leerlos puede haber errores
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(new Integer(20));
		list.add(10);// Solo agrega objetos o con AutoBoxing
//		list.add(30.45);
//		list.add("Hello");
		
		System.out.println("Iteradores ...");
		// Iterador para recorrer la lista
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.println(integer);
		}
		System.out.println(list);
		
		
	}

}
