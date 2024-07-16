
public class ShortCircuitOperators {
	public static void main(String[] args) {
		boolean x = true, y = true;
		
		// &,| => bouth arguments, slow, integers and boolean
		// &&, || => Second argument is opcional, faster, boolean only
		if (x & y) {
			System.out.println("Inside If");
		}
	}
}
