package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i <= 10; i++)
			list.add(i);
		
		System.out.println(list);
		
//		List<Integer> list2 = new ArrayList<Integer>();
//		for (Integer integer : list) {
//			if (integer % 2 == 0) {
//				list2.add(integer);
//			}
//		}
		
		// Usando Streams
		// Sacando el stream del arreglo y pasando por un filtro que resive un predicado y collect que resive
		// una funcion que este nos dara a que colleccion quiero sacar el resultado
		List<Integer> list2 = list.stream().filter(i -> i%2 == 0).collect(Collectors.toList());
		System.out.println(list2);
		
		// Numeros del filtro
		long length = list.stream().filter(i -> i%2 == 0).count();
		System.out.println(length);
		
		// Ordenar asendente
		List<Integer> sorted = list.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);
		
		// Custom ordenar
		Comparator<Integer> comp = (i1, i2) -> i2.compareTo(i1);
		List<Integer> customSorted = list.stream().sorted(comp).collect(Collectors.toList());
		System.out.println(customSorted);
		
		// Maximo y Menor custom
		Integer max = list.stream().max(comp).get();
		Integer min = list.stream().min(comp).get();
		System.out.println(max);
		System.out.println(min);
		
		// Foreach -> no afecta los elementos
		list.stream().forEach(i -> System.out.println(i));
	}

}
