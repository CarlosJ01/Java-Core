
// Si una funcion es abstracta la clase tambien lo es
// Una clase absatracta solo es parcialmente abstracta puede tener implementaciones
public abstract class BMW { // No se pueden instanciar, no se puede conbinar con final
	void commonFunc() {
		System.out.println("Inside commonFunc method");
	}
	
	abstract void accelerate(); // Los metodos abstractos no pueden ser staticos ni final
	
	public static void main(String[] args) {
		System.out.println("Inside the main method");
	}
}
