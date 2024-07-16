
public class Passenger {
	
	private int id;
	private String firstName;
	private String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	// Imprimir el objeto o convertirlo a cadena (nombre de la clase @ hashCode)
	@Override
	public String toString() {
		return super.toString() + " => " + this.firstName + " " + this.lastName;
	}
	
	// Imprime el identificador del objeto (la localizacion en memoria)
	@Override
	public int hashCode() {
		return this.id;
	}
	
	// Compara 2 objetos (comapara las direcciones de memoria)
	@Override
	public boolean equals(Object obj) {
		Passenger passenger = (Passenger) obj;
		if (this.id == passenger.id && this.firstName == passenger.firstName 
				&& this.lastName == passenger.lastName)
			return true;
		return false;
	}
}
