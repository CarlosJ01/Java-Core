
// Se inician los campos
@MyAnnotation(num1 = "123")
public class Calculator {

	private int num;
	
	public Calculator() {
		System.out.println("Constructor");
	}
	
	public Calculator(int num) {
		super();
		this.setNum(num);
	}
	
	public Calculator(int num, int num2) {
		super();
		this.setNum(num);
	}

	public void myMethod() {
		System.out.println("MyMethod");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public double sum(int n, int m) {
		return n + m;
	}
}
