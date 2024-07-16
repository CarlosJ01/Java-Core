package interfaces;

// Son como un contrato con otras clases para la implementacion de metodos
// No tiene bloques ni constructores

// Marker interfaces son interfaces de la JVM que dan propiedades a las clases
// que los implementan estos son Serializable, Clonable, RandomAccess
public interface Car {
	// Todas las variables son public, static y final y tienen que ser inicializada
	int num = 10;
	
	// Todos los metodos de las interfaces son public y abstract por default
	// No se implementan
	void go();
	void stop();
}
