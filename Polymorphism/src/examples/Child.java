package examples;

public class Child extends Parent {
	
	String s = "Child";
	// Los metodos static no se pueden sobre escribir ni usar la anotacion
	// pero su hijo puede tener su propio metodo llamada igual
	// como sobreescibir pero sin @overriding
	public static void doSomething() {
		System.out.println("Child method");
	}
}
