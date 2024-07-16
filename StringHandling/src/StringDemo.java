
public class StringDemo {
	
	public static void main(String[] args) {
		// Como crear una cadena
		String s = "Six";
		
		String s1 = new String("Seven");
		
		char c[] = {'h','o','l','a'};
		String s2 = new String(c);
		
		byte b[] = {65,66,67};
		String s3 = new String(b);
		
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
	
}
