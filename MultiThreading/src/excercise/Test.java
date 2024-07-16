package excercise;

public class Test {
	
	public static void main(String[] args) {
		Thread t1 = new EvenNumber();
		Thread t2 = new Thread(new OddNumbers());
		
		t1.start();
		t2.start();
	}
	
}
