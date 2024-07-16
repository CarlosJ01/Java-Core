package localinner;

public class Outer {
	
	public void f1() {
		System.out.println("Inside  Outer f1");
		// Clases locales internas que pueden estar dentro del mismo codigo
		class LocalInner {
			public void f2() {
				System.out.println("Inside  LocalInner f2");
			}
		}
		LocalInner inner = new LocalInner();
		inner.f2();
		
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.f1(); 
	}

}
