package methodReference;

public class MethodRefDemo {
	
	public static void myMethod() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
	
	public static void main(String[] args) {
		
		// Con el operador :: puedes mapiar los methodos de una clase para referenciarlos a otros Class::Method
		// en este caso se sobrescribe el methodo run de Runnable referenciando el methodo llamado myMethod
		// Siempre que los tipos que ingresa y regresa sean los mismos
		Runnable r = MethodRefDemo::myMethod;
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread");
		}
	}
	
	

}
