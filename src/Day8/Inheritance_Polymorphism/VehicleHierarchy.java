package Day8.Inheritance_Polymorphism;

class Vehicle2 {
    public void maxSpeed() {
        System.out.println("Vehicle speed is unknown");
    }
}

class Car2 extends Vehicle2 {
    @Override
    public void maxSpeed() {
        System.out.println("Car maximum speed: 180 km/h");
    }
}

class Bike2 extends Vehicle2 {
    @Override
    public void maxSpeed() {
        System.out.println("Bike maximum speed: 120 km/h");
    }
}

public class VehicleHierarchy {
    public static void main(String[] args) {
        Vehicle2 v;

        v = new Car2();
        v.maxSpeed();

        v = new Bike2();
        v.maxSpeed();

        Vehicle2 u = new Vehicle2();
        u.maxSpeed();
    }
}
