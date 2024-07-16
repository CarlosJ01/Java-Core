package methodReference.constructors;

public class MyClass {
	private String s;

	public MyClass(String s) {
		super();
		this.setS(s);
		System.out.println("Iside the constuctor: "+s);
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
}
