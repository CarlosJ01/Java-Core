package superkeyword;

public class SuperClass {
	int x;
	
	public SuperClass() {
		System.out.println("No arg superclass constructor");
		System.out.println(this);
	}
	
	public SuperClass(int x) {
		this();
		this.x = x;
		System.out.println("One Arg superclass constructor");
		System.out.println(this);
	}
}
