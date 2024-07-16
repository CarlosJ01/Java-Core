import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Una anotaci�n en Java es aquella caracter�stica que le permite incrustar informaci�n suplementaria 
// en un archivo fuente. Esta informaci�n no cambia las acciones de un programa, pero puede ser utilizada 
// por varias herramientas, tanto durante el desarrollo como durante el despliegue.
// Metadatos

// Cuando se ejecutara la anotacion
@Retention(RetentionPolicy.RUNTIME)
// En que nivel se usara la anotacion
@Target(ElementType.METHOD)
public @interface MyAnnotation {
	
}
