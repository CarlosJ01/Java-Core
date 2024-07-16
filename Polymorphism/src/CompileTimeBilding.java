
public class CompileTimeBilding {
	
	// Sobrecarga - Overloading
	// El compilador eleva los valor de int => float si no existe un metodo especifico de int
	// igual con los objetos que si no existe tomaria el objeto padre String => Object
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(float a, float b) {
		System.out.println((float)a+b);
	}
	void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	public static void main(String[] args) {
		CompileTimeBilding obj = new CompileTimeBilding();
		
		// El mismo metodo recciona diferente a los contextos
		obj.add(10, 10);
		obj.add(13.4f, 132.3f);
		obj.add(10, 10, 10);
	}
}
