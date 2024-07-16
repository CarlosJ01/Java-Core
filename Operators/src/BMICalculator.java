
public class BMICalculator {
	public static void main(String[] args) {
		// bmi = weight in kg / (heigth * heigth)
		
		double height = 1.95,
				weight = 110;
		
		double bmi = height / (height * height);
		System.out.println("BMI: " + bmi);
	}
}
