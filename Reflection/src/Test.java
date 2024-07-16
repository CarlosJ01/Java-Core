import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		try {
			// Cargar una clase a memoria
			Class<?> myClass = Class.forName(Calculator.class.getName());

			System.out.println(myClass.getName());

			// Extraer los constructores solo publicos
			Constructor<?>[] constructors = myClass.getConstructors();
			System.out.println(Arrays.toString(constructors));

			// Extraer los methodos publicos
			Method[] methods = myClass.getMethods();
			System.out.println(Arrays.toString(methods));

			// Extraer un solo constructor por numero de parametros
			Constructor<?> constructor = myClass.getConstructor(null);
			System.out.println(constructor);
			// Crear un onjeto
			System.out.println(constructor.newInstance(null));

			Constructor<?> constructor2 = myClass.getConstructor(int.class);
			System.out.println(constructor2);

			Constructor<?> constructor3 = myClass.getConstructor(int.class, int.class);
			System.out.println(constructor3);

			System.out.println(constructor2.newInstance(1));
			Object obj = constructor3.newInstance(1, 2);
			System.out.println(obj);

			// Acceder a un methodo desde su nombre y numero de parametros
			Method method = myClass.getMethod("getNum", null);
			// Invocar un metodo con el objeto y los parametros
			System.out.println(method.invoke(obj, null));

			Method method2 = myClass.getMethod("setNum", int.class);
			System.out.println(method2.invoke(obj, 10));
			System.out.println(method.invoke(obj, null));
			
			// Excercise
//			Class<?> myClass1 = Class.forName(Calculator.class.getName());
//			Constructor<?> constructor4 = myClass.getConstructor(null);
//			Object newInstance = constructor4.newInstance(null);
//			Method method3 = myClass1.getMethod("sum", int.class, int.class);
//			System.out.println(method3.invoke(newInstance, 3, 5));
//			
			// Extraer campos y cambiarlos a public y valor
			Field field = myClass.getDeclaredField("num");
			field.setAccessible(true);
			field.set(obj, 100);
			System.out.println(method.invoke(obj, null));
			
			// Extraer anotaciones
			Annotation[] annotations = myClass.getAnnotations();
			System.out.println(Arrays.toString(annotations));
			
			MyAnnotation annotation = (MyAnnotation) annotations[0];
			System.out.println(annotation.num1());
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		}

	}

}
