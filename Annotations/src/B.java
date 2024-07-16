import java.util.ArrayList;
import java.util.List;

public class B {
	
	// Elimina Warnings del codigo, se especifican
	@SuppressWarnings(value = { "deprecation", "rawtypes" })
	public static void main(String[] args) {
		A a = new A();
		a.myMethod();
		a.myMethod2();
		System.out.println(a);
		
		System.out.println(a.name);
		System.out.println(a.newName);
		
		@SuppressWarnings("unused")
		List list = new ArrayList();
	}

}
