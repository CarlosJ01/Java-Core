import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;

public class Student {
	
	public static void main(String[] args) {
		// Formas de instanciar un objeto
		Student student = new Student();
		
		// Descontinuada
//		try {
//			Class.forName("Student").newInstance();
//		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		try {
			Student student1 = Student.class.getConstructor(null).newInstance(null);
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
				| NoSuchMethodException | SecurityException e) {
			e.printStackTrace();
		}
		
		// Clonar un objeto ya existente
		try {
			Student student2 = (Student)student.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		DateFormat dateFormat = DateFormat.getInstance();
		
	}
	
}
