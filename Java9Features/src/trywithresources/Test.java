package trywithresources;

public class Test {
	
	public static void main(String[] args) {
		MyWorker worker = new MyWorker();
		// Se colocan los recursos que se quieren que se cierren despues del try o catch como si fueran
		// un finally siempre se cierran esos recursos
		try (worker; MyWorker worker2 = new MyWorker()){
			worker.doSomething();
			worker2.doSomething();
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	
}
