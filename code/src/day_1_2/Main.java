package day_1_2;

public class Main {
    public static void main(String[] args) {
        System.out.println("------ 1. Encapsulation Demo --------");
        Account account = new Account("ACC-100", 500.0);
        account.deposit(200.0);
        account.withdraw(150.0);
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: $" + account.getBalance());

        System.out.println("\n--- 2. Inheritance Demo ---");
        Employee emp = new Employee("Alice", "E01", 60000.0);
        Manager mgr = new Manager("Bob", "M01", 90000.0, 15000.0);
        System.out.println(emp.getDetails() + " | Monthly Pay: $" + emp.calculateMonthlyPay());
        System.out.println(mgr.getDetails() + " | Monthly Pay: $" + mgr.calculateMonthlyPay());

        System.out.println("\n--- 3. Polymorphism Demo ---");
        NotificationService notifier = new EmailNotifier();
        notifier.sendNotification("alice@example.com", "Your monthly statement is ready.");

        System.out.println("\n--- 4. Abstraction Demo ---");
        ReportGenerator report = new PDFReportGenerator();
        report.generateReport("Financial Summary", "Q2 Revenue increased by 15 percent.");
    }
}