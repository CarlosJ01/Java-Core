
public class SingleInheritance extends Object{ // Todas extienden de Object
	void m1() {
		System.out.println("Inside m1");
	}
	
	public static void main(String[] args) {
		SingleInheritance s =  new SingleInheritance();
		s.m1();
		s.hashCode();
		s.getClass();
	}
	
}
