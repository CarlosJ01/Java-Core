package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkListDemo {

	public static void main(String[] args) {
		Object objects[] = new Object[1000000];
		
		for (int i = 0; i < objects.length; i++) {
			objects[i] = new Object();
		}
		
		// Buena para manpular los datos  CRUD pero mas lento
		List<Object> list = new LinkedList<Object>();
		long start = System.currentTimeMillis();
		for (Object object : objects) {
			list.add(object);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken : " + (end-start));
	}

}
