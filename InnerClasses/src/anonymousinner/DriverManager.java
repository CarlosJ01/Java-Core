package anonymousinner;

public class DriverManager {
	static Connection getConnection() {
		
		// Clase anonima que implicitamente implementa la interface
		Connection connection = new Connection() {
			@Override
			public void createStatement() {
				System.out.println("Anonymouse inner clases method");
			}
		};
		
		return connection;
	}
}
