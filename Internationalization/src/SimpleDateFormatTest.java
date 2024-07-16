import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) throws ParseException {
		// Otra forma de formato con cadenas a un date
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(sdf.format(new Date()));
		
		// Parsiar una cadena a date
		String date = "03-09-1998";
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-M-yyyy");
		Date date1 = sdf1.parse(date);
		System.out.println(date1);
		
		
	}
	
}
