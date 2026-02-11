package oops.abstractclass;

abstract class NotificationService {
    abstract void sendMessage(String message);
    public boolean validateMessage(String message) {
        if (message == null || message.isEmpty()) {
            return false;
        }
        return true;
    }

}
