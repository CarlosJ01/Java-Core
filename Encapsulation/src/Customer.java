
public class Customer {
	// Encapsulacion en la misma clase
	private String firstName;
	private String lastName;
	private String creditCard;
	
	// Acceder a los datos desde el exterior setters and getters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		// Mantener el control de los campos en la misma clase
		if (firstName == null) {
			System.err.println("Invalit name");
			return;
		}
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getCreditCard() {
		return creditCard;
	}
	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	
	
}
