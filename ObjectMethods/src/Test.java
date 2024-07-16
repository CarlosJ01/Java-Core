
public class Test {
	
	public static void main(String[] args) {
		Passenger passenger = new Passenger();
		passenger.setId(123);
		passenger.setFirstName("Jonh");
		passenger.setLastName("Week");
		
		System.out.println(passenger); // en print siempre se llama al toString de la clase
		System.out.println(passenger.hashCode());
		
		Passenger passenger2 = new Passenger();
		passenger2.setId(123);
		passenger2.setFirstName("Jonh");
		passenger2.setLastName("Week");
		
		System.out.println(passenger2);
		System.out.println(passenger2.hashCode());
		System.out.println(passenger.equals(passenger2));
	}
	
}
