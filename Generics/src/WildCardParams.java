import java.util.ArrayList;

public class WildCardParams {
	
	public static void main(String[] args) {
		WildCardParams wcp = new WildCardParams();
		wcp.myMethod(new ArrayList<A>());
	}
	
	// Cuando se usa el ? solo añade valores nulos, pero puede ser de cualquier tipo
	// extends para solo clases que extienden de thread
	// Super para marcar que una clase es padre de otra
	// Solo lectura
	public void myMethod(ArrayList<? super B> l) {
		l.add(null);
//		l.add("Hola");
	}
}
