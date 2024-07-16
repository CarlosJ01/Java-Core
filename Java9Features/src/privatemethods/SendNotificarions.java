package privatemethods;

// Caba vez son mas clases que interfaces
public interface SendNotificarions {

	static void sendNotifications() {
		establishConnection();
		System.out.println("Sending Multiple Notifications");
	}
	
	default void sendNotification() {
		establishConnection();
		System.out.println("Sending Multiple Notification");
	}
	
	// Metodos privados en interfaces que se pueden llamanr desede metosdos default estos tambien son default
	// No se pueden usar en estaticos almenos que el tambien lo sea
	private static void establishConnection() {
		System.out.println("Establishing a connection");
	}
}
