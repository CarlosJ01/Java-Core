package example;

public class MyCircle implements Circle, Circle2{

	@Override
	public void calculateArea() {
		System.out.println(Circle.pi);
	}

	@Override
	public void calculateArea(float radius) {
		System.out.println(Circle2.pi * radius * radius);
	}
}
