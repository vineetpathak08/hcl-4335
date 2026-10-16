package org.example.constructordi;




import org.example.constructordi.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main( String [] args ) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee1 e1 = ctx.getBean(Employee1.class);
        Employee1 e2 = ctx.getBean(Employee1.class);
        e1.getAddress();
    }
}

