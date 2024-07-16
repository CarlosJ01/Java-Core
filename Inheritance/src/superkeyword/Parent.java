package superkeyword;

public class Parent {
	int a,b;
	
	public Parent(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println(this);
	}

	void f1() {
		System.out.println("Inside parent f1()");
	}
}
