import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Una anotación en Java es aquella característica que le permite incrustar información suplementaria 
// en un archivo fuente. Esta información no cambia las acciones de un programa, pero puede ser utilizada 
// por varias herramientas, tanto durante el desarrollo como durante el despliegue.
// Metadatos

// Cuando se ejecutara la anotacion
@Retention(RetentionPolicy.RUNTIME)
// En que nivel se usara la anotacion
@Target(ElementType.METHOD)
public @interface MyAnnotation {
	
}
