package Day8.Inheritance_Polymorphism;

import javax.xml.transform.Source;
import java.util.Scanner;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Calculator_MethodOverloading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator c = new Calculator();

        System.out.println("1. Add 2 Numbers");
        System.out.println("2. Add 3 Numbers");
        System.out.print("Choose from the above options: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1 -> {
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();
                System.out.println("Result = " + c.add(num1, num2));
            }
            case 2 -> {
                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();
                System.out.print("Enter the third number: ");
                int num3 = scanner.nextInt();
                System.out.println("Result = " + c.add(num1, num2, num3));
            }
            default -> System.out.println("Incorrect choice!");
        }
        scanner.close();
    }
}
