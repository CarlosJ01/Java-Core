
public class IfElseHW {
	public static void main(String[] args) {
		float maths = 56, physics = 100, chemistry = 60;
		float avg = (maths+physics+chemistry)/3;
		if (avg <= 59)
			System.out.println("Grade C");
		else if (avg <= 69)
			System.out.println("Grade B");
		else
			System.out.println("Grade A");
	}
}
