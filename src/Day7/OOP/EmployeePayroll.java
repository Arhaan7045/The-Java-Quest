package Day7.OOP;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    double calculateAnnualSalary() {
        return salary * 12;
    }

    void showDetails() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.printf("Salary: %,.2f%n", salary);
    }
}


public class EmployeePayroll {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Arhaan", 50000);
        Employee e2 = new Employee(102, "Rahul", 30000);

        e1.showDetails();
        System.out.println("Annual Salary: " + e1.calculateAnnualSalary());
        System.out.println();
        e2.showDetails();
        System.out.println("Annual Salary: " + e2.calculateAnnualSalary());
    }
}
