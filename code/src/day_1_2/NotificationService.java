package day_1_2;

public interface NotificationService {
    void sendNotification(String recipient, String message);
}
class EmailNotifier implements NotificationService {
    @Override
    public void sendNotification(String recipient, String message) {
        System.out.println("Sending Email to " + recipient + ": " + message);
    }
}