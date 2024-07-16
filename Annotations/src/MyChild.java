
public class MyChild extends MyParent{
	
	// Asegurar que sobreescribes el metodo correctamente
	@Override
	public String greet(String name) {
		return super.greet(name) + " 2";
	}
	
}
