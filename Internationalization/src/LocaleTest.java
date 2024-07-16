import java.util.Locale;

public class LocaleTest {
	
	public static void main(String[] args) {
		// Localizacion actual
		Locale l = Locale.getDefault();
		System.out.println(l.getCountry()+"/"+l.getLanguage());
		System.out.println(l.getDisplayCountry()+"/"+l.getDisplayLanguage());
		
		System.out.println();
		
		// Cambiar la localizacion actual
		Locale.setDefault(Locale.UK);
		l = Locale.getDefault();
		System.out.println(l.getCountry()+"/"+l.getLanguage());
		System.out.println(l.getDisplayCountry()+"/"+l.getDisplayLanguage());
		
		System.out.println("Countries");
		// Lista de paises soportados
		String[] isoCountries = Locale.getISOCountries();
		for (String country : isoCountries) {
			System.out.println(country);
		}
		
		System.out.println("Languages");
		// Lista de idiomas
		String[] isoLangueages = Locale.getISOLanguages();
		for (String language : isoLangueages) {
			System.out.println(language);
		}
	}
	
}
