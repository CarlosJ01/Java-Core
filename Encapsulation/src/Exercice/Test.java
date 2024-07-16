package Exercice;

public class Test {
	public static void main(String[] args) {
		Patient patient = new Patient();
		patient.setId(123);
		patient.setName("Marcos");
		patient.setNss("123456789");
		
		System.out.println(patient.getId());
		System.out.println(patient.getName());
		System.out.println(patient.getNss());
	}
}
