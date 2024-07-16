package defaultmethods;

public interface A {
	
	// Default methods en interface puedes declarar codigo en una interface, si no se sobrescriben se usa la
	// de la interface, si se sobrescriben pasan igual
	default void m1() {
		System.out.println("m1 => A");
	}
	
}
