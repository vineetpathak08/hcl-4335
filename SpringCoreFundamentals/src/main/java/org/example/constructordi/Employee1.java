package org.example.constructordi;


public class Employee1 {

    private Address address;

    public Employee1(Address address) {
        this.address = address;
    }

    public void getAddress() {
        address.getAddress();
    }

}
