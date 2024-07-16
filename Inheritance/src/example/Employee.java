package example;

public class Employee {
	int id;
	String name;
	String dept;
	double salary;
	
	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	// final => no pueden sobreescribir el metodo
	protected void work() {
		System.out.println("Common work for everyone");
	}
}
