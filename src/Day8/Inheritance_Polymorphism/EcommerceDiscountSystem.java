package Day8.Inheritance_Polymorphism;

/*
E-commerce Discount System
Base Class: Product
Subclasses: Electronics, Clothing, Grocery
Each subclass overrides getDiscount() method.
In main(), create an array of Product and calculate final price polymorphically.
 */

import java.util.ArrayList;
import java.util.Scanner;

class Product {
    String name;
    double price;

    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public double getDiscount() {
        return 0.0; //
    }

    public double getFinalPrice() {
        return price - getDiscount();
    }

    public void displayDetails() {
        System.out.println("Product name: " + name);
        System.out.println("Price: ₹" + price);
        System.out.println("Discount: ₹" + getDiscount());
        System.out.println("Final price: ₹" + getFinalPrice());
    }
}

class Electronics extends Product{
    Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return price * 0.10;
    }
}

class Clothing extends Product {
    Clothing(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return price * 0.20;
    }
}

class Grocery extends Product {
    Grocery(String name, double price) {
        super(name, price);
    }

    @Override
    public double getDiscount() {
        return price * 0.05;
    }
}

public class EcommerceDiscountSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> cart = new ArrayList<>();
        int choice;

        do {
            System.out.println("===== E-Commerce Mart =====");
            System.out.println("1. Electronics");
            System.out.println("2. Clothing");
            System.out.println("3. Grocery");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter Electronic item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    cart.add(new Electronics(name, price));
                    System.out.println("✅ " + name + " added to cart!");
                }
                case 2 -> {
                    System.out.print("Enter Clothing item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    cart.add(new Clothing(name, price));
                    System.out.println("✅ " + name + " added to cart!");
                }
                case 3 -> {
                    System.out.print("Enter Grocery item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter price: ");
                    double price = scanner.nextDouble();
                    cart.add(new Grocery(name, price));
                    System.out.println("✅ " + name + " added to cart!");
                }
                case 4 -> {
                    System.out.println("\n===== 🧾 Final Bill =====");

                    double total = 0;
                    for (Product p : cart) {
                        p.displayDetails();
                        total = total + p.getFinalPrice();
                    }
                    System.out.println("\n----------------------------------");
                    System.out.println("Total Payable Amount: ₹" + total);
                    System.out.println("----------------------------------");
                }
                default -> System.out.println("⚠️ Invalid choice! Try again.");
            }

        } while(choice != 4);

        scanner.close();
    }
}
