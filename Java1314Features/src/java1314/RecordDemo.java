package java1314;

public class RecordDemo {
	
	/* 
	 * Una especie de clase que ya tiene implicitos(El compilador los crea) 
	 * los setters, getters, hascode, toString y equals
	 * de los parametros con los que los creamos, tambien los creas en otros archivos o como un modelo
	 */
	// record Employee(String name, int sal) {}
	
	public static void main(String[] args) {
		Employee employee = new Employee("carlos", 100);
		System.out.println(employee);
		System.out.println(employee.name());
		System.out.println(employee.sal());
		System.out.println(employee.hashCode());
		
		Employee e2 = new Employee("bob", 1000);
		System.out.println(e2);
		System.out.println(e2.hashCode());
		
		Employee employee1 = new Employee("carlos", 100);
		System.out.println(employee1);
		System.out.println(employee.equals(employee1));
		
		
		employee1 = new Employee();
		employee1 = new Employee("Steve");
		
		Employee.myMethod();
		employee.myInstanceMethod();
		
	}

}
