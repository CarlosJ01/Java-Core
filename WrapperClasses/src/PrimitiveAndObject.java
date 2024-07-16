
public class PrimitiveAndObject {
	public static void main(String[] args) {
		int x = 100;
		// Boxing
		Integer y = Integer.valueOf(x);
		// Unboxing
		int z = y.intValue();
	}
}
