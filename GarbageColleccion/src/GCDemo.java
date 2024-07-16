
public class GCDemo {
	
	int objId;
	
	public GCDemo() {
		System.out.println(this + " created");
	}
	
	public GCDemo(int id) {
		this.objId = id;
		System.out.println(this.objId + " created");
	}
	
	public static void main(String[] args) {
		// El recolector de basura se activa cuando esta bajo de memoria o si se va a salir de la memoria
		// Recolecta memoria que no tiene referencias osea no estan en variables
		for (int i = 0; i < 100; i++) {
			new GCDemo(i);
		}
		System.gc(); // Llamar al recolector
	}
	
	// Metodo antes que se destrullen los objetos
	@Override
	protected void finalize() throws Throwable {
		System.out.println(this.objId + " finalized");
	}
	
}
