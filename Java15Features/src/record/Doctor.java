package record;

// Los record pueden solo ser usados con interfaces
public record Doctor(@MyAnnotation String name) implements Employee {

}
