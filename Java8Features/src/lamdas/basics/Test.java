package lamdas.basics;

public class Test {
	
	public static void main(String[] args) {
		A a = new C();
		a.myMethod();
		
		// Funcion lamnda => funcion anonima que se declara en el momento
		// () => paramentros, ->, Instruccion si es una o varias se usan los {}
		// Si una interface funcional es igual a una funcion lamda esta funcion lamda es la que sobreescribe
		// el metodo abstracto de la interface y se puede usar como si se hubiera declarado
		A a1 = () -> System.out.println("Lammda method");
		a1.myMethod();
		
		
	}
	
}
