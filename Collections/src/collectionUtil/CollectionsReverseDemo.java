package collectionUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsReverseDemo {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(8);
		list.add(50);
		list.add(78);
		System.out.println(list);
		
		// Invertir una lista
		System.out.println("Reversing");
		Collections.reverse(list);
		System.out.println(list);
	}

}
