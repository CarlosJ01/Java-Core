package p1;

public class B {

	public static void main(String[] args) {
		A aObj = new A();
//		System.out.println(aObj.a); //No se pueden usar privates
		System.out.println(aObj.b);
		System.out.println(aObj.c);
		System.out.println(aObj.d);
	}

}
