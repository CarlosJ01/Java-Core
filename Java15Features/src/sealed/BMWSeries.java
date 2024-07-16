package sealed;

/*
 * Una superclase que define a quienes estan permitidos ser heredados, los hijos estan implicitamente heredando
 * la clase, los hijos deben ser final, sealed o non-sealed(clase comun)
 * 
 * Esta característica se trata de habilitar un control de herencia más detallado en Java.
 * El sellado permite a las clases e interfaces definir sus subtipos permitidos.
 */
public sealed interface BMWSeries permits ThreeSeries, FiveSeries{
	
}
