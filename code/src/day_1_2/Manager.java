package day_1_2;

public class Manager extends Employee {
    private double yearlyBonus;

    public Manager(String name, String id, double baseSalary, double yearlyBonus) {
        super(name, id, baseSalary);
        this.yearlyBonus = yearlyBonus;
    }

    @Override
    public double calculateMonthlyPay() {
        return (baseSalary + yearlyBonus) / 12.0;
    }
}