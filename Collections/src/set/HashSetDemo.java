package set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		Random random = new Random();
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			int number = random.nextInt(5);
			list.add(number);
		}
		System.out.println("List: "+list);
		
		// Set no permite duplicados y se puede crear desde una lista
		Set<Integer> set = new HashSet<Integer>(list);
		System.out.println("Set" + set);
	}

}
