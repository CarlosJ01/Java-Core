import java.util.Iterator;

public class CommandLineArguments {
	public static void main(String[] args) {
		int length = args.length;
		
		if (length == 0) {
			System.out.println("No inputs provided");
		} else {
			System.out.println("List of arguments");
			for (int i = 0; i < args.length; i++) {
				System.out.println(args[i]);
			}
		}
	}
}
