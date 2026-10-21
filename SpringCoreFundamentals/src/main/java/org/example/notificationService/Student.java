package org.example.notificationService;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Student {
    private final NotificationService notificationService;
    @Autowired
    public Student(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyStudent() {
        notificationService.sendNotification("Congratulations!!! your are selected at capgemini");
    }

    @PostConstruct
    public void init() {
        System.out.println("Student Object created");
    }
    @PreDestroy
    public void destroy() {
        System.out.println("Student Object destroyed");
    }
}
