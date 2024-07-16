package privatemethods;

public class SendNotificationsImpl implements SendNotificarions {

	public static void main(String[] args) {
		SendNotificarions sendNotificarions = new SendNotificationsImpl();
		sendNotificarions.sendNotification();
		SendNotificarions.sendNotifications();
	}

}
