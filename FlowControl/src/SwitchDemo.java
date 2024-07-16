
public class SwitchDemo {
	public static void main(String[] args) {
		int x = 1;
		final int b = 20;
		
		switch (x) {
		case 1:
			System.out.println("Case 1");
			break;
		case 2:
			System.out.println("Case 2");
			break;
		case 1+2:
			System.out.println("Case 3");
			break;
		case 4:
		case 5:
			System.out.println("Common Case 4 | 5");
			break;
		case b:
			System.out.println("Constante");
			break;
		default:
			System.out.println("Default"); 
			break;
		}
	}
}
