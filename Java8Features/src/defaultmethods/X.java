package defaultmethods;

public interface X {
	
	default void m1() {
		System.out.println("m1 => X");
	}
}
