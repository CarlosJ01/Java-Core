package p2;

import p1.A;

public class C extends A {

	public static void main(String[] args) {
		A aObj = new A();
//		System.out.println(aObj.a);
//		System.out.println(aObj.b);
//		System.out.println(aObj.c); Solo puede usar los public por que esta en otro paquete
		System.out.println(aObj.d);
		
		C cObj = new C();
		System.out.println(cObj.c); // Pero puede usar los elementos protected
									// De si mismo ya que los hereda de A
									// Solo se heredan los proctected y public
		System.out.println(cObj.d);
	}

}
