package predicate.joins;

import java.util.function.Predicate;

public class PredicateJoins {

	public static void main(String[] args) {
		int[] x = { 0, 10, 20, 30, 40, 50, 60, 70, 80, 90, 73 };
		
		Predicate<Integer> p1 = i -> i > 10;
		System.out.println("Greater than 10");
		PredicateJoins.method1(p1, x);
		
		Predicate<Integer> p2 = i -> i%2 == 0;		
		System.out.println("Even Numbers");
		method1(p2, x);
		
		// Se puede negar la salida de la funcion
		System.out.println("Not greader than 10");
		method1(p1.negate(), x);
		
		// Se puede unir a otra funcion con & o | tal como las comparaciones
		System.out.println("Greater than 10 and Even");
		method1(p1.and(p2), x);
		
		System.out.println("Greater than 10 or Even");
		method1(p1.or(p2), x);
	}
	
	static void method1(Predicate<Integer> p, int[] x) {
		for (int i : x) {
			if (p.test(i)) {
				System.out.println(i);
			}
		}
	}

}
