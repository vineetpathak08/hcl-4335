package org.example.notificationService;

import org.springframework.stereotype.Component;

@Component
public class WhatsappService implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println( "Whatsapp Notification : " + message);
    }
}
