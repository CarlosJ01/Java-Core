package safevarargs;

import java.util.Arrays;
import java.util.List;

public class SafeVarArgsDemo {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		List<String> l1 = Arrays.asList("abc", "xyz");
		List<String> l2 = Arrays.asList("nyc", "lon");
		
		SafeVarArgsDemo.myMethod(l1, l2);
		
		SafeVarArgsDemo sva = new SafeVarArgsDemo();
		sva.myMethod(l1, l2);
	}
	
	@SafeVarargs // Prevenir errores con el ... y usar un metodo estatico en instancias
	public static void myMethod(List<String>...l) { // List<string>[] => ...		
		String name = (String)l[0].get(0);
		System.out.println(name);
	}
	
}
