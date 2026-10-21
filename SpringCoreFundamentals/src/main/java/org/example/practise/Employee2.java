package org.example.practise;

import org.example.constructordi.Address;

public class Employee2 {
    private Salary salary;
    private Address address;
    private Department department;
    public Employee2(Address address, Salary salary, Department dept){
        this.address = address;
        this.salary = salary;
        this.department = dept;
    }
}
