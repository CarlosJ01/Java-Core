package exercices;

public class Exercice {
	public static void main(String[] args) throws CustomException {
		try {
			Thread.sleep(2000);
			throw new InterruptedException();
		} catch (InterruptedException e) {
			throw new CustomException();
		} finally {
			System.out.println("Finish");
		}
	}
}
