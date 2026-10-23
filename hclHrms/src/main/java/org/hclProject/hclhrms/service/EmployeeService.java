package org.hclProject.hclhrms.service;

import org.hclProject.hclhrms.entity.Employee;
import org.hclProject.hclhrms.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private Employee employee;
    public String addEmp(){
        Employee emp = new Employee(1,"Vineet","Telibagh","pathakvineet@gmail.com","Senior software engineer");

        return "";
    }
}
