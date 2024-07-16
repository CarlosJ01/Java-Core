package p2;

import p1.A;
import p1.p3.E;

public class C {

	public static void main(String[] args) {
		A.a1();
		p1.A.a1(); // Es lo mismo que importarla
		
		A aObj = new A();
		p1.A aObjP = new p1.A();
		aObj.a2();
		aObjP.a2();
		
		E eObj = new E();
		eObj.e1();
	}

}
