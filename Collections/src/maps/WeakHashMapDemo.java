package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {

	public static void main(String[] args) throws InterruptedException {
		// Si se elimina la referencia por afura se borra en el map
		Map<User, String> map = new WeakHashMap<User, String>();
		
		User user = new User();
		map.put(user, "Tom");
		
		System.out.println(map);
		
		user = null;
		
		System.gc();
		Thread.sleep(5000);
		
		System.out.println(map);
	}

}
