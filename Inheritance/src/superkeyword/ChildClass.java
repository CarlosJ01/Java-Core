package superkeyword;

public class ChildClass extends SuperClass{
	public ChildClass() {
		this(10);
		System.out.println("No arg childclass constructor");
		System.out.println(this);
	}
	
	public ChildClass(int x) {
		super(x);
		System.out.println("One arg childclass constructor");
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		ChildClass childClass = new ChildClass();
	}
}
