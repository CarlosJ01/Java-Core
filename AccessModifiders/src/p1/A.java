package p1;

public class A {

	private int a = 30; // Llega solo dentro de la clase
	int b = 40; // Llega solo hasta las clases dentro del mismo paquete
	protected int c = 50; // Llega hasta el paquete y por clases hijas en otro paquete
	public int d = 60; // Todos lo pueden usar

	public static void main(String[] args) {
		A aObj = new A();
		System.out.println(aObj.a);
		System.out.println(aObj.b);
		System.out.println(aObj.c);
		System.out.println(aObj.d);
	}

}
