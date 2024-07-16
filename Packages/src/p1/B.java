package p1;

import p1.p3.E; // Las clases de subpaquetes se tienen que importar
				// Anque estes en el paquete padre

public class B {
	public static void main(String[] args) {
		A.a1();
		
		A aObj = new A();
		aObj.a2();
		
		E eObj = new E();
		eObj.e1();
	}
}
