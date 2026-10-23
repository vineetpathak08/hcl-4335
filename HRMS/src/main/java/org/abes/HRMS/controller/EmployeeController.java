package org.abes.HRMS.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

    @GetMapping("/")
    public String employee(){
        return "welcome to Hrms App";
    }

    @PostMapping("/add")
    public ResponseEntity<Employee>
}
