package lamdas.parameters;

public class Test {

	public static void main(String[] args) {
		// Puedes pasar parametros a las funciones lambdas
		Sum s = (x,y) -> System.out.println(x+y); 
		s.add(10, 20);
	}
	
}
