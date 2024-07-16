
public class AnyRunnableTest {

	public static void main(String[] args) {
		AnyRunnable<MyClass> t = new AnyRunnable<MyClass>();
		
		// No puede por que no implementa runnable
		// AnyRunnable<String> t = new AnyRunnable<String>();
	}

}
