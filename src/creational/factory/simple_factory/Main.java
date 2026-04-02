package creational.factory.simple_factory;

public class Main {

    public static void main(String[] args) {
        Notification notification = NotificationFactory.createNotification("email");
        notification.notifyUser();

        notification = NotificationFactory.createNotification("whatsapp");
        notification.notifyUser();
    }
}
