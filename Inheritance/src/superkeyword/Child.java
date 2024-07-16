package superkeyword;

public class Child extends Parent{
	int c,d;
	
	public Child(int a, int b, int c, int d) {
		super(a, b); // Enviar valores al constructor padre si este tiene constructor
		this.c = c;
		this.d = d;
		System.out.println(this);
	}
	
	void displayDetails() {
		System.out.println("Parents a "+super.a);
		System.out.println("Parents b "+super.b);
		System.out.println("Child c "+this.c);
		System.out.println("Child d "+this.d);
	}
	
	void f1() {
		super.f1(); // Super referencia a su forma de padre dentro de JVM
		System.out.println("Inside childs f1()");
	}
}
