
public class LabelledBlock {
	public static void main(String[] args) {
		int x = 210;
		
		//Bloque l1
		l1:{
			System.out.println("Block begins");
			if (x == 20) {
				break l1; // Romper el bloque l1
			}
			System.out.println("Block Ends");
		}
		
		System.out.println("Outside the block");
	}
	
}
