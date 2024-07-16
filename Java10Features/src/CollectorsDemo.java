import java.util.List;
import java.util.stream.Collectors;

public class CollectorsDemo {

	public static void main(String[] args) {
		List<Integer> list = List.of(15,20,17,30);
		
		// Crear listas estaticas en los streams
		var list2 = list.stream().filter(i->i%3 == 0).collect(Collectors.toUnmodifiableList());
		list2.add(40);
	}
	
}
