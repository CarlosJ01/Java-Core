
public class Test {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setFirstName(null);
		customer.setLastName("Castro");
		customer.setCreditCard("123456789");
		
		System.out.println(customer.getFirstName());
		System.out.println(customer.getLastName());
		System.out.println(customer.getCreditCard());
	}
}
