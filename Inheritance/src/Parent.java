
public class Parent {
	
	public Parent() {
		System.out.println("Parent object : "+this); // Se instancia primero como
													// la clase padre y luego com hijo
													// En la misma memoria
	}
	
	void f1() {
		System.out.println("Inside parent f1");
	}
}
