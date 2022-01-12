package main;

public class Main {

    private static String notificationType = null;

    public static void main(String[] args) {
        NotificationFactory nf = new NotificationFactory();
        Notification notification = nf.createNotification(notificationType);
        if (notification != null) {
            notification.notifyUser();
        }
    }


}
