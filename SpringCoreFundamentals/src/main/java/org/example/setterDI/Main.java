package org.example.setterDI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = (Employee) context.getBean("employee");
        employee.getAddress();
    }
}
