package org.example.notificationService;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class EmailService implements NotificationService {
    public void sendNotification(String message) {
        System.out.println( "Email Notification : " + message);
    }

}
