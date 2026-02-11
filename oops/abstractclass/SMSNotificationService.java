package oops.abstractclass;

public class SMSNotificationService extends NotificationService{
    public void sendMessage(String message) {
        System.out.println("SMS notification sent");
    }

    @Override
    public boolean validateMessage(String message) {
        if (message == null || message.isEmpty() || message.length()>160) {
            return false;
        }
        return true;
    }
}
