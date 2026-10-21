package org.example.setterDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    private Address address;
    public Employee() {}

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }
    public void getAddress() {
        address.printAddress();
        System.out.println("Address is printing....");
    }
}
