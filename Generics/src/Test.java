
public class Test {

	public static void main(String[] args) {
		MyGenericClass<String> s = new MyGenericClass<String>("Hola");
		s.displayObjectDetails();
		System.out.println(s.getObject());
		
		MyGenericClass<Integer> i = new MyGenericClass<Integer>(123);
		i.displayObjectDetails();
		System.out.println(i.getObject());
		
		MyGenericClass<Double> d = new MyGenericClass<Double>(123.5);
		d.displayObjectDetails();
		System.out.println(d.getObject());
	}

}
