package reversal;

public class StringReversal {
	
	public String firstWay (String actual) {
		String reversed = "";
		for (int i = actual.length(); i > 0 ; i--) {
			reversed += actual.charAt(i-1);
		}
		return reversed;
	}
	
	public String secondWay(String actual) {
		byte[] s1 = actual.getBytes(); // Obtener los bytes de una cadena
		byte[] s2 = new byte[s1.length];
		
		for (int i = 0; i < s1.length; i++) {
			s2[i] = s1[s1.length - i - 1];
		}
		
		return new String(s2);
	}
	
	public String thirdWay(String actual) {
		return new StringBuffer(actual).reverse().toString();
	}
	
	public static void main(String[] args) {
		String str = "Fatima";
		StringReversal sr = new StringReversal();
		
		System.out.println(sr.firstWay(str));
		System.out.println(sr.secondWay(str));
		System.out.println(sr.thirdWay(str));
	}
	
}
