package arraysutil;

import java.util.Arrays;
import java.util.List;

import collectionUtil.MyComparator;

public class ArraySort {

	public static void main(String[] args) {
		int[] a = { 40, 10, 15, 7 };
		
		for (int i : a)
			System.out.println(i);
		
		// Ordenar un arreglo
		System.out.println("After Sort");
		Arrays.sort(a);
		for (int i : a)
			System.out.println(i);
		
		System.out.println("Custom sort");
		String[] s = {"V","A","Z","P"};
		Arrays.sort(s, new MyComparator());
		for(String string : s)
			System.out.println(string);
		
		//System.out.println(s[Arrays.binarySearch(s, "Z")]);
		
		// Convertir Array => Lista
		List<String> list = Arrays.asList(s);
		System.out.println(list);
		
		s[1] = "Y";
		System.out.println(list);
		
		// Sigue siendo un arreglo no puedes agregar mas
		list.add("O");
		System.err.println(list);
	}
}
