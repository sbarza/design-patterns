package creational.factory.simple_factory;

public class SmsNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending sms...");
    }
}
