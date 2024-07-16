package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.TreeSet;

public class DiferentsSets {

	public static void main(String[] args) {
		Random random = new Random();
		
		// Todos los set no admiten repeticiones
		
		// No mantiene el orden en el que se ingresan
		HashSet<Integer> set = new HashSet<Integer>();
		// Matiene el orden en el que son ingresados
		LinkedHashSet<Integer> setLinked = new LinkedHashSet<Integer>();
		// Ordena los numeros asendente
		TreeSet<Integer> setTree = new TreeSet<Integer>();
		
		for (int i = 0; i < 5; i++) {
			int number = random.nextInt(100);
			System.out.println(number);
			
			set.add(number);
			setLinked.add(number);	 			
			setTree.add(number);
		}
		
		System.out.println("Hashset : " + set);
		System.out.println("LinkedHashSet : " + setLinked);
		System.out.println("TreeSet : " + setTree);
		
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.println(integer);
		}
	}

}
