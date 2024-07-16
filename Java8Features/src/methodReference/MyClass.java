package methodReference;

public class MyClass {
	
	public void myMethod(int i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		MyInterface f = i -> System.out.println(i);
		f.myMethod(100);
		
		MyClass c = new MyClass();
		MyInterface f1 = c::myMethod; // Referenciar desde una instancia objeto::method
		f1.myMethod(155);
	}
	
}
