package staticinner;

public class Outer {
	
	static void f1() {
		System.out.println("Outers static method");
	}
	
	// Una clase interna estatica
	static class Inner {
		static void f2() {
			System.out.println("Inners static method");
		}
		
		void f3() {
			System.out.println("Non static method inside inner class");
		}
	}
	
	public static void main(String[] args) {
		Outer.f1();
		Outer.Inner.f2();
		
		// Instanciar una clase interna estatica
		Outer.Inner inner = new Outer.Inner();
		inner.f3();
	}
	
}
