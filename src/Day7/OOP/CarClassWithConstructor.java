package Day7.OOP;

class Car {
    String brand;
    String model;
    int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void showCarDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println();
    }
}

public class CarClassWithConstructor {
    public static void main(String[] args) {

        Car c1 = new Car("BMW", "X5", 2022);
        Car c2 = new Car("Audi", "Q7", 2021);
        Car c3 = new Car("Tesla", "Model S", 2023);

        c1.showCarDetails();
        c2.showCarDetails();
        c3.showCarDetails();
    }
}
