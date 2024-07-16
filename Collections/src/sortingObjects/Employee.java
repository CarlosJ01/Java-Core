package sortingObjects;

// Para hacer que una clase pueda ser comparable con sus objetos
public class Employee  implements Comparable<Employee>{
	int id;
	String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public int compareTo(Employee o) {
		if(this.id < o.id)
			return -1;
		else if (this.id > o.id)
			return 1;
		return 0;
	}
	
	@Override
	public String toString() {
		return id + " : " + name;
	}
	
}
