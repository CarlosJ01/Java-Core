package inmutable;

public class InmutableDemo {
	
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		
		System.out.println("Before concat \ns1:"+s1+"\ns2:"+s2);
		
		s1.concat(s2);
		System.out.println("After concat \ns1:"+s1+"\ns2:"+s2);
		
		String s3 = s1.concat(s2);
		System.out.println(s3);
	}
	
}
