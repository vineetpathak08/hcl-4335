package org.example.practise;

import org.example.Employee;
import org.example.constructordi.Address;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
   public Address address(){
       return new Address();
   }
   @Bean
   public Salary salary(){
        return new Salary();
   }
   public Department department(){
        return new Department();
   }
   @Bean
    public Employee employee(Address address, Salary salary, Department department){
       return new Employee();
    }

}
