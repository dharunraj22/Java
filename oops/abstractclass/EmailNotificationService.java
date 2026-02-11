package oops.abstractclass;

public class EmailNotificationService extends NotificationService{
    public void sendMessage(String message) {
        System.out.println("Email notification sent");
    }
}
