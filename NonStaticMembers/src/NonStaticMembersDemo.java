
public class NonStaticMembersDemo {
	// Variable
	int num;

	// Constructor
	NonStaticMembersDemo() {
		System.out.println("Inside the constructor");
	}

	// Block antes de la creacion de un objeto
	{
		System.out.println("Inside the non static block");
	}

	// Main method
	public static void main(String[] args) {
		System.out.println("Inside the main method");
//		new NonStaticMembersDemo();
//		new NonStaticMembersDemo();
//		new NonStaticMembersDemo();
		NonStaticMembersDemo obj = new NonStaticMembersDemo();
		obj.doSomething();
	}

	// Static block se ejecuta cuando se carga toda la clase
	static {
		System.out.println("Inside the static block");
	}
	
	void doSomething() {
		System.out.println("Inside doSemething");
	}

}
