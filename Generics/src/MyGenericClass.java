
// Para usar una clase generica se pone los <T>, esto es un tipo que puede ser especificado al momento de 
// instanciar y se puede usar en toda la clase
public class MyGenericClass<T> {
	T obj;

	public MyGenericClass(T obj) {
		super();
		this.obj = obj;
	}
	
	public void displayObjectDetails() {
		System.out.println(obj.getClass().getName());
	}
	
	public T getObject() {
		return obj;
	}
}
