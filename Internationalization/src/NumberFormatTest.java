import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest {
	
	public static void main(String[] args) {
		Double d = 123154651.564545646;
		
		// Formato de numeros actual
		NumberFormat nf = NumberFormat.getInstance();
		System.out.println(nf.format(d));
		
		// Formato de una localidad
		NumberFormat nf1 = NumberFormat.getInstance(Locale.CHINA);
		System.out.println(nf.format(d));
		
		
		double numero = 56465465456.4564;
		System.out.println(NumberFormat.getInstance().format(numero));
		System.out.println(NumberFormat.getInstance(Locale.US).format(numero));
		System.out.println(NumberFormat.getInstance(Locale.UK).format(numero));
		
		// max y min de decimales los redondea o agrega 0
		nf.setMinimumFractionDigits(2);
		nf.setMaximumFractionDigits(4);
		System.out.println(nf.format(d));
			
	}
	
}
