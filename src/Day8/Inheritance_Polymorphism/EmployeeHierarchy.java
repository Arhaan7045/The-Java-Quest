package Day8.Inheritance_Polymorphism;

import java.util.Scanner;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public double calculateBonus() {
        return salary * 0.05; // base 5% bonus
    }
    public void displayDetails() {
        System.out.println("Employee id: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Salary: ₹%.2f\n", salary);
        System.out.println("Bonus: ₹" + calculateBonus() + "0");
    }
}

class Manager extends Employee{
    public Manager(int id, String name, double salary) {
        super(id, name, salary);
    }
    public double calculateBonus() {
        return salary * 0.15; // manager gets 15% bonus
    }
}

class Developer extends Employee {
    public Developer(int id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public double calculateBonus() {
        return salary * 0.10; // developer gets 10% bonus
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        System.out.println("===== Employee Bonus Calculator =====");
        System.out.println("1. Manager");
        System.out.println("2. Developer");
        System.out.print("Choose employee type: ");
        choice = scanner.nextInt();

        System.out.print("Enter Id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Salary: ₹");
        double salary = scanner.nextDouble();

        Employee emp;

        if (choice == 1) {
            emp = new Manager(id, name, salary);
        }
        else {
            emp = new Developer(id, name, salary);
        }

        emp.displayDetails();

        scanner.close();
    }
}
