package seralizationClasses;

import java.io.Serializable;

//Serializable =>  Hacerle saber a la JVM que puede leer/escribir los objetos
public class Employee implements Serializable{ 
	
	private static final long serialVersionUID = 1L;
	
	int id;
	String name;
	double salary;
	transient int nss; // transient => para que no se escriba ni lea ese campo
	
	public Employee(int id, String name, double salary, int nss) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.nss = nss;
	}
	
}
