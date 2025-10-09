package Day8.Inheritance_Polymorphism;

import java.util.Scanner;

class Shape {
    public void area() {
        System.out.println("The shape is not defined.");
    }
}

class Circle extends Shape{
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println("Area of circle = " + Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println("Area of rectangle = " + length * breadth);
    }
}

class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println("Area of triangle = " + 0.5 * base * height);
    }
}

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n===== Area Calculator System =====");
            System.out.println("1. Area of circle");
            System.out.println("2. Area of rectangle");
            System.out.println("3. Area of triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    Shape c = new Circle(radius);
                    c.area();
                }
                case 2 -> {
                    System.out.print("Enter the length of rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the breadth of rectangle: ");
                    double breadth = scanner.nextDouble();
                    Shape r = new Rectangle(length, breadth);
                    r.area();
                }
                case 3 -> {
                    System.out.print("Enter the base of triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of triangle: ");
                    double height = scanner.nextDouble();
                    Shape t = new Triangle(base, height);
                    t.area();
                }
                case 4 -> System.out.println("Thank you for using Area Calculator System.");
                default -> System.out.println("⚠️ Invalid choice! Try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
