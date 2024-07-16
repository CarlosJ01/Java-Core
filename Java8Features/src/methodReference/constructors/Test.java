package methodReference.constructors;

public class Test {

	public static void main(String[] args) {
		// Si solo es una linea y es una varible lo toma como return
		MyInterface f1 = s -> new MyClass(s);
		f1.get("Using lambdas");
		
		// Mapiar el constructor
		MyInterface f2 = MyClass::new;
		f2.get("using constructor mapping");
	}

}
