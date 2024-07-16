package classloading;

public class MultipleObjects {
	
	public static void main(String[] args) {
		User u1 = new User();
		Class c1 = u1.getClass();
		
		User u2 = new User();
		Class c2 = u2.getClass();
		
		// Las clases solo se cargan una vez que son invocadas y se reutilizan
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1 == c2);
		
		// Quien lo cargo
		System.out.println(c1.getClassLoader());
		System.out.println(String.class.getClassLoader()); //Bootstrap loader => null => son default nadie los carga
	}
	
}
