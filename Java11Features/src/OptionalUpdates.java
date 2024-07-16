import java.util.Optional;

// Optional es un objeto contenedor que puede o no contener un valor no nulo. 
// Si el valor es presente, isPresent() devuelve true y get() retorna el valor. 
public class OptionalUpdates {
	public static void main(String[] args) {
		// Crear un objeto null o vacio
		Optional<String> str = Optional.empty();
		System.out.println(str.isEmpty());
		System.out.println(str.isPresent());
//		System.out.println(str.get()); => Exception
		
		System.out.println("-".repeat(10));
		
		Optional<Integer> i = Optional.of(123);
		System.out.println(i.isEmpty());
		System.out.println(i.isPresent());
		System.out.println(i.get());
		
		System.out.println("-".repeat(10));
		
		// optional no contiene nulos
//		Optional<Double> nu = Optional.of(null);
//		System.out.println(nu.isEmpty());
//		System.out.println(nu.isPresent());
//		System.out.println(nu.get());
	}
}
