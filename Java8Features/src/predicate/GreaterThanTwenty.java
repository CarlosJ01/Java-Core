package predicate;

import java.util.function.Predicate;

public class GreaterThanTwenty {
	
	public static void main(String[] args) {
		// Un predicado es una funcion que solo regresa un valor booleano, en java se puede usar la interface
		// predicate para declarar estas funciones con lambdas si solo resive un parametro la lambda se define
		// parametro -> expresion sin return 
		Predicate<Integer> p = i -> (i>20);
		
		System.out.println(p.test(15));
		System.out.println(p.test(24));
		System.out.println(p.test(30));
		
		
	}
	
}
