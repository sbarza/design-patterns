package creational.factory.simple_factory;

public class EmailNotification implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending email...");
    }
}
