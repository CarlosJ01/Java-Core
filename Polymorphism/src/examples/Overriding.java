package examples;

public class Overriding {
	// Se puede sobreescribir el metodo main ya que si un hijo no tiene este metodo
	// al ejecutarlo toma el del padre.
	public static void main(String[] args) {
		Parent.doSomething();
		Child.doSomething();
		
		Parent parent = new Parent();
		System.out.println(parent.s);
		
		Child child = new Child();
		System.out.println(child.s);
		
		Parent child2 = new Child();
		System.out.println(child2.s); // Se muestra la variable de la referencia
		main(1); // LLamando a la sobrecarga del metodo
	}
	
	// Se puede sobrecargar el metodo main pero JVM simpre toma el del arrglo
	public static void main(int arg) {
		System.out.println("Overloaded main");
	}
}
