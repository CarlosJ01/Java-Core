package customexceptions;

// Para hacer una excepcion custom se puede heredar de RuntimeException, y actuara
// como una excepcion que no necesita control
public class UncheckedCustomException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public UncheckedCustomException(String message) {
		super(message);
	}
	
}
