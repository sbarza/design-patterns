package creational.factory.simple_factory;

public class NotificationFactory {

    public static Notification createNotification(String type) {
        return switch (type.toLowerCase()) {
            case "email" -> new EmailNotification();
            case "sms" -> new SmsNotification();
            case "whatsapp" -> new WhatsAppNotification();
            default -> throw new IllegalArgumentException("Unknown notification type: " + type);
        };
    }
}
