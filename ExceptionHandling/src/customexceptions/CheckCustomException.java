package customexceptions;

//Para hacer una excepcion custom se puede heredar de RuntimeException, y actuara
// como una expecion, pero necesitara control con try-catch o throws
public class CheckCustomException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public CheckCustomException(String message) {
		super(message);
	}
}
