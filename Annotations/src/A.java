
// Deprecated => que la classe o methodo ya esta descontinuado pero puede usarse, en el futuro se eliminara
//@Deprecated // Si afecta a la clase afecta a todo en su interior
public class A {
	
	@Deprecated
	public String name = "A";
	public String newName = "A2";
	
	@Deprecated // Solo afecta al metodo
	public void myMethod() {
		System.out.println("myMethod");
	}
	
	public void myMethod2() {
		System.out.println("myMethod2");
	}
}
