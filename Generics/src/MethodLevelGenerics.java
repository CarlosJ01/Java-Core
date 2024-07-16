
public class MethodLevelGenerics {
	
	// Tambien se pueden usar los genericos solo en los methodos
	public <T> void method1( T t) {
		
	}
	
	public<T extends Runnable> void method2(T t) {
		
	}
	
	public<T extends Runnable & Comparable<String>> void method3(T t) {
		
	}
}
