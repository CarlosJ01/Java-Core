import java.util.ArrayList;
import java.util.List;

public class TypeCastingProblem {
	public static void main(String[] args) {
		String[] arr = new String[10];
		arr[0] = "John";
		arr[1] = "Rob";
		// arr[2] = 123;
		
		List<String> list = new ArrayList<String>();
		list.add("John");
		list.add("Rob");
		//list.add(123);
		
		String name = (String) list.get(0);
		String name1 = (String) list.get(1);
		// String name2 = (String) list.get(2);
	}
}
