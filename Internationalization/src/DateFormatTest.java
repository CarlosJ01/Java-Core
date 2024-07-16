import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class DateFormatTest {
	
	public static void main(String[] args) {
		
		Date d = new Date();
		
		// Extraer formato de fecha actual y uno seleccionado, Style 0-4 Mayor a menor
		DateFormat mxDF = DateFormat.getDateInstance(DateFormat.FULL);
		DateFormat usDF = DateFormat.getDateInstance(0, Locale.US);
		
		System.out.println(mxDF.format(d));
		System.out.println(usDF.format(d));
		
		// Formato de hora
		DateFormat timeInstance = DateFormat.getTimeInstance();
		System.out.println(timeInstance.format(d));
		
		// Fecha y Hora
		DateFormat dateTimeInstance = DateFormat.getDateTimeInstance(0, 0);
		System.out.println(dateTimeInstance.format(d));
	}
	
}
