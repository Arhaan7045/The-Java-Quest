package Day2.Switch;

import java.util.Scanner;

public class mathFormula {
    public static void main(String[] args) {

        //Day2
        //Menu-Driven Program

        Scanner scanner = new Scanner(System.in);
        double area;
        char choice;

        System.out.println("1. Area of Circle");
        System.out.println("2. Area of Square");
        System.out.println("3. Area of Rectangle");
        System.out.print("Enter your choice: ");
        choice = scanner.next().charAt(0);

        switch (choice) {
            case '1' -> {
                System.out.print("Enter the radius: ");
                double radius = scanner.nextDouble();
                area = Math.PI * radius * radius;
                System.out.println("Area of Circle = " + area + " units");
            }
            case '2' -> {
                System.out.print("Enter the side in cm: ");
                double side = scanner.nextDouble();
                area = side * side;
                System.out.println("Area of Square = " + area + " units");
            }
            case '3' -> {
                System.out.print("Enter the length of rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of rectangle: ");
                double width = scanner.nextDouble();
                area = length * width;
                System.out.println("Area of Rectangle = " + area + " units");
            }
            default -> System.out.println("Invalid choice");
        }

        scanner.close();

    }
}
