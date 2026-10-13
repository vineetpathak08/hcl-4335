package day_1_2;

public class Employee {
    protected String name;
    protected String id;
    protected double baseSalary;

    public Employee(String name, String id, double baseSalary) {
        this.name = name;
        this.id = id;
        this.baseSalary = baseSalary;
    }

    public double calculateMonthlyPay() {
        return baseSalary / 12.0;
    }

    public String getDetails() {
        return "ID: " + id + ", Name: " + name;
    }
}