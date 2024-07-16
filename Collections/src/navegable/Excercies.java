package navegable;

import java.util.TreeMap;

public class Excercies {

	public static void main(String[] args) {
		
		TreeMap<String, String> map = new TreeMap<String, String>();
        
        map.put("A", "Arbol");
        map.put("B", "Bebe");
        map.put("C", "Casa");
        map.put("D", "Dedo");
        map.put("E", "Elote");
        
        System.out.println(map.floorKey("C"));
        System.out.println(map.lowerKey("C"));
        
        System.out.println(map.ceilingKey("C"));
        System.out.println(map.higherKey("C"));
        
        System.out.println(map.pollFirstEntry());
        System.out.println(map.pollLastEntry());
        
        System.out.println(map.descendingMap());
	}
	
}
