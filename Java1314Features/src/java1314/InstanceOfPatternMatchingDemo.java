package java1314;

public class InstanceOfPatternMatchingDemo {

	public static void main(String[] args) {
		Object object = get();
		
		// Saber si un objeto es una instancia de una clase y declar su conversion
		if (object instanceof String str) {
			System.out.println(str);
		}
	}
	
	public static Object get() {
		return "Pattern Matchin in action";
	}

}
