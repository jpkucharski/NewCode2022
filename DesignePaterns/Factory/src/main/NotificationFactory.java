package main;

public class NotificationFactory {

    public Notification createNotification(String type) {
        if (type != null) {
            if (type.equals("SMS")) {
                return new SMSNotification();
            }
            if (type.equals("EMAIL")) {
                return new EmailNotification();
            }
            if (type.equals("PUSH")) {
                return new PushNotification();
            }
        }
        return null;
    }
}
