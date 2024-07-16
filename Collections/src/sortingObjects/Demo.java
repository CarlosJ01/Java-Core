package sortingObjects;

import java.util.Set;
import java.util.TreeSet;

public class Demo {
	
	public static void main(String[] args) {
		// Compararse con sigo mismo es Comparable
		Set<Employee> set = new TreeSet<Employee>();
		set.add(new Employee(2, "Obanma"));
		set.add(new Employee(1, "Steve"));
		set.add(new Employee(3, "Alex"));
		set.add(new Employee(1, "Rambo"));
		
		System.out.println(set);
		
		// Usar otra clase para compara es con Comparator
		Set<Employee> set2 = new TreeSet<Employee>(new EmployeeNameComparator());
		set2.add(new Employee(2, "Obanma"));
		set2.add(new Employee(1, "Steve"));
		set2.add(new Employee(3, "Alex"));
		set2.add(new Employee(1, "Rambo"));
		System.out.println(set2);
	}
	
}
