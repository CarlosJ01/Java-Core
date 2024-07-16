
public class MultiLevelTest {
	public static void main(String[] args) {
		Child child = new Child();
		child.f1(); // Metodo del padre
		child.f2(); // Metodo propio
		child.hashCode(); // Metodo del abuelo Object
	}
}
