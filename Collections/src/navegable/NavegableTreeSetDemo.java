package navegable;

import java.util.TreeSet;

public class NavegableTreeSetDemo {
	
	public static void main(String[] args) {
		TreeSet<Integer> s = new TreeSet<Integer>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60);
		s.add(70);
		
		System.out.println(s);
		
		System.out.println(s.ceiling(20)); // Regresa el valor igual o mas cercano hacia arriba que encuentre
		System.out.println(s.higher(40)); // El siguiente valor mas grande que el dado
		
		System.out.println(s.floor(30)); // Regresa el valor igual o mas cercano hacia abajo que encuentre
		System.out.println(s.lower(30)); // Regresa el siguiente valor mas pequeño que el dado
		
		// Extraen y quitan el primer o ultimo elemento de la lista
		System.out.println(s.pollFirst());
		System.out.println(s.pollLast());
		System.out.println(s);
		
		// Cambia el orden de asendiente a desendiente
		System.out.println(s.descendingSet());
		
	}
	
}
