// Assignment1_VehicleSystem.java

// Abstract class Vehicle
abstract class Vehicle {
    protected String brand;
    protected double speed;

    public Vehicle(String brand, double speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public abstract void start();

    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
    }
}

// Interface FuelEfficient
interface FuelEfficient {
    double calculateMileage();
}

// Concrete class Car
class Car extends Vehicle implements FuelEfficient {
    public Car(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void start() {
        System.out.println("Car Started...");
    }

    @Override
    public double calculateMileage() {
        return 18.0; // Sample mileage
    }
}

// Concrete class Bike
class Bike extends Vehicle implements FuelEfficient {
    public Bike(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void start() {
        System.out.println("Bike Started...");
    }

    @Override
    public double calculateMileage() {
        return 45.0; // Sample mileage
    }
}

// Main class to demonstrate Assignment 1
public class VehicleSystem {
    public static void main(String[] args) {
        Car hondaCar = new Car("Honda", 60);
        hondaCar.displayInfo();
        hondaCar.start();
        System.out.println("Mileage: " + hondaCar.calculateMileage() + " km/l");
        System.out.println();

        Bike yamahaBike = new Bike("Yamaha", 80);
        yamahaBike.displayInfo();
        yamahaBike.start();
        System.out.println("Mileage: " + yamahaBike.calculateMileage() + " km/l");
    }
}
