package java1314;

public class StringContentBlockDemo {

	public static void main(String[] args) {
		String str = "<html>\n"
				+ "<body>\n"
				+ "Si we\n"
				+ "</body>\n"
				+ "</html>\n";
		System.out.println(str);
		
		// Como en Python
		String stringContent = """
		<html>
			<body>
				Si we
			</body>
		</html>
		""";
		System.out.println(stringContent);
		
		// \ => para que este en una sola linea, toma los tabuladores o espacios como referencia donde cierra
		stringContent = """
				{\
				"name": "carlos",\
				"sal": 1000\
				}\
				""";
		System.out.println(stringContent);
	}

}
