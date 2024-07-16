package example;

public class Manager extends Employee{
	String[] projects;
	double salary; //Shadowing => sobre escribir un campo, con diferente referencia al del padre
	
	public Manager(int id, String name, String dept, double salary, 
			String[] projects, double salary2) {
		super(id, name, dept, salary);
		this.projects = projects;
		this.salary = salary2;
	}
	
	@Override
	protected void work() {
		super.work();
		System.out.println("Manager is managing ");
		for (String project : this.projects) {
			System.out.println(project);
		}
	}
}
