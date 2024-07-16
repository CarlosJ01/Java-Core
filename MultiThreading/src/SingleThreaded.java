
public class SingleThreaded {
	
	public static void main(String[] args) {
		SingleThreaded st = new SingleThreaded();
		st.printNumbers();
		
		System.out.println("-----------------------------");
		for (int j = 0; j < 200; j++) {
			System.out.print("j: "+j+"\t");
		}
	}
	
	public void printNumbers() {
		for (int i = 0; i < 200; i++) {
			System.out.print("i: "+i+"\t");
		}
	}
}
