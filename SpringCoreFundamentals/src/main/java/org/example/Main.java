package org.example;
import org.example.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main( String [] args ) {
       ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
       Employee e1 = ctx.getBean(Employee.class);
       Employee e2 = ctx.getBean(Employee.class);
       e1.display();
    }
}
