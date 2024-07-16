
package p2;

import p1.A;

public class D {
	public static void main(String[] args) {
		A aObj = new A();
//		System.out.println(aObj.a);
//		System.out.println(aObj.b);
//		System.out.println(aObj.c); Solo puede usar los public por que 
									// esta en otro paquete
		System.out.println(aObj.d);
	}
}
