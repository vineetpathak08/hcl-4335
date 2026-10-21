package org.example.notificationService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student s1 = context.getBean(Student.class);
        Student s2 = context.getBean(Student.class);
        System.out.println(s1.hashCode() + "     ===   " +  s2.hashCode());
//        System.out.println("Student Object destroyed");
        s1.notifyStudent();
        context.close();
    }
}
