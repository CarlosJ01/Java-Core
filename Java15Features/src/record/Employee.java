package record;

// Tambien se usan en interfaces
public sealed interface Employee permits Doctor, Nurse {

}
