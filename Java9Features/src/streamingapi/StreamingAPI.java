package streamingapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamingAPI {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 14, 40, 7, 18, 23, 50, null);
		System.out.println(list);
		//System.out.println(list.stream().filter(x -> x % 5 == 0).collect(Collectors.toList()));

		// Filtra por la condicion hata que uno lo rompa y se detiene
		System.out.println(list.stream().takeWhile(x -> x % 5 == 0).collect(Collectors.toList()));
		// Elimina elementos mientras cumplan la condicion y se rompe con el primero que
		// no lo cumple se queda con el resto
		System.out.println(list.stream().dropWhile(x -> x % 5 == 0).collect(Collectors.toList()));
		// Elimina los nulos
		System.out.println(list.stream().flatMap(x -> Stream.ofNullable(x)).collect(Collectors.toList()));
	}

}
