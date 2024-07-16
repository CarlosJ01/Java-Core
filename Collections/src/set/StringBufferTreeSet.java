package set;

import java.util.Set;
import java.util.TreeSet;

import comparator.SBComparator;

public class StringBufferTreeSet {
	
	public static void main(String[] args) {
		// Esta clase no puede estar ordenada ya que no implementa la interface Comparable
		// Se puede parasar un objeto para que sea el comparador de las clases que no se pueden compara facil
		Set<StringBuffer> set = new TreeSet<StringBuffer>(new SBComparator());
		
		set.add(new StringBuffer("abc"));
		set.add(new StringBuffer("xyz"));
		set.add(new StringBuffer("def"));
		
		for (StringBuffer string : set) {
			System.out.println(string);
		}
	}
	
}
