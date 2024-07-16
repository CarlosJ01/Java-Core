package finalkeyword;

// Una clase final no puede ser heredada
public final class A {
	
	// Una variable final no puede ser cambiada el valor o objeto (constante)
	// Se puede convinar con static
	final static float pi = 3.14f;
	
	public A() {
//		this.pi = 3.14f; // Solo se puede cambiar el valor de una variable final
						// en el constructor cuando se inicia por primera vez
	}
	
	public static void main(String[] args) {
		final A a = new A();
		System.out.println(a.pi);
//		a = new A();
//		a.pi=3.12f;
	}
	
	// Un metodo final no pude ser sobreescrito cuando se hereada
	public final void method() {
		System.out.println("Metodo estatico");
	}
}
