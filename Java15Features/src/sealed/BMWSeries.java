package sealed;

/*
 * Una superclase que define a quienes estan permitidos ser heredados, los hijos estan implicitamente heredando
 * la clase, los hijos deben ser final, sealed o non-sealed(clase comun)
 * 
 * Esta caracter�stica se trata de habilitar un control de herencia m�s detallado en Java.
 * El sellado permite a las clases e interfaces definir sus subtipos permitidos.
 */
public sealed interface BMWSeries permits ThreeSeries, FiveSeries{
	
}
