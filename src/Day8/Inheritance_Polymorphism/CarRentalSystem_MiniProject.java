package Day8.Inheritance_Polymorphism;

/*
🚀 Mini Project: Car Rental System (Console App)

Objective:
Build a small OOP project using inheritance & polymorphism.
 */

import java.util.ArrayList;
import java.util.Scanner;

// Parent class
class Vehicle {
    protected String brand;
    protected String model;
    protected boolean isRented;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isRented = false;
    }

    public void rent() {
        if (!isRented) {
            isRented = true;
            System.out.println("Vehicle " + brand + " rented.");
        } else {
            System.out.println("⚠️ Vehicle " + brand + " is already rented!");
        }
    }

    public boolean isAvailable() {
        return !isRented;
    }
}

// Child class Car
class Car extends Vehicle {
    private int pricePerDay = 1000;

    public Car(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void rent() {
        if (!isRented) {
            isRented = true;
            System.out.println("Car " + brand + " rented.");
        } else {
            System.out.println("⚠️ Car " + brand + " is already rented!");
        }
    }

    // Method overloading
    public void rent(int days) {
        if (!isRented) {
            isRented = true;
            int total = days * pricePerDay;
            System.out.println("Car " + brand + " rented for " + days + " days. Total cost: ₹" + total);
        } else {
            System.out.println("⚠️ Car " + brand + " is already rented!");
        }
    }
}

// Child class Bike
class Bike extends Vehicle {
    private int pricePerDay = 500;

    public Bike(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void rent() {
        if (!isRented) {
            isRented = true;
            System.out.println("Bike " + brand + " rented.");
        } else {
            System.out.println("⚠️ Bike " + brand + " is already rented!");
        }
    }

    public void rent(int days) {
        if (!isRented) {
            isRented = true;
            int total = days * pricePerDay;
            System.out.println("Bike " + brand + " rented for " + days + " days. Total cost: ₹" + total);
        } else {
            System.out.println("⚠️ Bike " + brand + " is already rented!");
        }
    }
}

// Main class
public class CarRentalSystem_MiniProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inventory
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("Toyota", "Corolla"));
        cars.add(new Car("Honda", "City"));
        cars.add(new Car("Hyundai", "Creta"));

        ArrayList<Bike> bikes = new ArrayList<>();
        bikes.add(new Bike("Honda", "CBR"));
        bikes.add(new Bike("Yamaha", "FZ"));
        bikes.add(new Bike("Bajaj", "Pulsar"));

        int choice;
        do {
            System.out.println("\n===== Car Rental System =====");
            System.out.println("1. Rent Car");
            System.out.println("2. Rent Bike");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.println("Available Cars:");
                    for (int i = 0; i < cars.size(); i++) {
                        Car car = cars.get(i);
                        System.out.println((i + 1) + ". " + car.brand + " " + car.model +
                                (car.isAvailable() ? "" : " (Rented)"));
                    }
                    System.out.print("Select car number: ");
                    int carChoice = scanner.nextInt();
                    if (carChoice >= 1 && carChoice <= cars.size()) {
                        Car selectedCar = cars.get(carChoice - 1);
                        if (selectedCar.isAvailable()) {
                            System.out.print("Enter number of days: ");
                            int days = scanner.nextInt();
                            selectedCar.rent(days); // calls overloaded method
                        } else {
                            System.out.println("⚠️ Car already rented!");
                        }
                    } else {
                        System.out.println("⚠️ Invalid choice!");
                    }
                }
                case 2 -> {
                    System.out.println("Available Bikes:");
                    for (int i = 0; i < bikes.size(); i++) {
                        Bike bike = bikes.get(i);
                        System.out.println((i + 1) + ". " + bike.brand + " " + bike.model +
                                (bike.isAvailable() ? "" : " (Rented)"));
                    }
                    System.out.print("Select bike number: ");
                    int bikeChoice = scanner.nextInt();
                    if (bikeChoice >= 1 && bikeChoice <= bikes.size()) {
                        Bike selectedBike = bikes.get(bikeChoice - 1);
                        if (selectedBike.isAvailable()) {
                            System.out.print("Enter number of days: ");
                            int days = scanner.nextInt();
                            selectedBike.rent(days); // overloaded method
                        } else {
                            System.out.println("⚠️ Bike already rented!");
                        }
                    } else {
                        System.out.println("⚠️ Invalid choice!");
                    }
                }
                case 3 -> System.out.println("Thank you for using Car Rental System!");
                default -> System.out.println("⚠️ Invalid choice! Try again.");
            }

        } while (choice != 3);

        scanner.close();
    }
}
