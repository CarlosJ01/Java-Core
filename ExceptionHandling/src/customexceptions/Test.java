package customexceptions;

public class Test {
	public static void main(String[] args) throws CheckCustomException {
		// throw new UncheckedCustomException("Custom Exception");
		throw new CheckCustomException("New Exception");
	}
}
