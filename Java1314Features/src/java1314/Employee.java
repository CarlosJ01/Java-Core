package java1314;

/*
 * Internamente es una clase que hereda de record y el compilador crea los setters, getters, hascode, equals
 * y toString, con los paramentros que le pasemos al principio. 
 * Usan el constructor con los atributos que se use, no pueden heredar pero si implementar
 * 
 * Un Record es una clase que explícitamente tiene como objetivo almacenar datos. 
 * Tradicionalmente si uno quiere crear una clase para ello y tenerla como un Data Transfer Object (DTO) 
 * se debe agregar todos los set/get, el equals, hashcode y el toString().
 */
public record Employee(String name, int sal) {
	
	// Los otros constructores deben de llamar al de default iniciando los datos
	public Employee() {
		this("", 0);
	}
	public Employee(String empData) {
		this(empData, 100);
	}
	
	
	// Solo campos estaticos los demas en la declaracion
	static int id;
	
	// Se pueden declara metodos
	public static void myMethod() {
		System.out.println("myMethod");
	}
	public void myInstanceMethod() {
		System.out.println(this.name);
	}
	

}
