
public class CharReversal {
	
	public static void main(String[] args) {
		var s = "Java is awesome !!";
		String[] temp = s.split(" ");
		
		int i = 0;
		String r = "";
		while (i < temp.length) {
			r += new StringBuffer(temp[i]).reverse().toString()+" ";
			i++;
		}
		System.out.println(r);
		
		System.out.println(new StringBuffer(s).reverse().toString());
	}
	
}
