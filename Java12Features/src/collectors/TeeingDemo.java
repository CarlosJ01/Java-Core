package collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TeeingDemo {

	public static void main(String[] args) {
		// Regresar el resultado de 2 filtros
		Result collect = Stream.of(5, 10, 8, 20, 70)
		.collect(Collectors.teeing(
					Collectors.counting(),
					Collectors.filtering(n -> Integer.parseInt(n.toString()) > 10, Collectors.toList()
				), 
				Result::new)
			);
		System.out.println(collect);
	}

}
