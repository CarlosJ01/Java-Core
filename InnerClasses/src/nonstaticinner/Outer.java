package nonstaticinner;

public class Outer {
	
	private static int x = 50;
	private int y;
	
	public Outer(int y) {
		this.y = y;
	}
	
	public void f1() {
		System.out.println("Outer classes non static method");
	}
	
	class Inner {
		
		private int y;
		
		public Inner(int y) {
			this.y = y;
		}
		
		// No hay metodos estaticos en clases internas no estaticas
		void f1() {
			System.out.println("Inner class non static method");
		}
		
		private void f2() {
			// Usando variables de la externa
			System.out.println(Outer.x);
			System.out.println(Outer.this.y);
			
			// Usasndo variables internas
			System.out.println(this.y);
		}
	}
	
	public static void main(String[] args) {
		Outer outer = new Outer(80);
		outer.f1();
		
		// Instanciar una clase interna no estatica, se necesita una instancia de la original
		Outer.Inner inner = outer.new Inner(30);
		inner.f1();
		inner.f2();
	}
	
}
