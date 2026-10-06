

abstract class Vehicle {
    String brand;

    // these are abstract methods
    abstract double calculateFuelEfficiency();

    public abstract String toString();

    // abstract class can have the constructor
    public Shape(String brand ) {

        System.out.println("Vehicle constructor called");
        this.brand = brand;
    }

    // this is a concrete method
    public String getBrand() {

        return brand;

    }
}

class Car extends Vehicle {

    double distanceTravelled;
    double fuelConsumed;


    public Car(String brand, double distanceTravelled, double fuelConsumed) {

        // calling Shape constructor
        super(brand);
        System.out.println("car constructor called");
        this.fuelConsumed = fuelConsumed;
        this.distanceTravelled = distanceTravelled;
    }

    @Override
    calculateFuelEfficiency(){

        return distanceTravelled / fuelConsumed;
    }

    @Override
    public String toString() {

        return "Car brand  is " + super.getBrand()
                + "fuel efficiency is : " + calculateFuelEfficiency();
    }
}

class Motorcycle extends Vehicle {

    int engineCapacity;
    double mileage;

    public Motorcycle(String brand,int engineCapacity, double mileage) {
        // calling Shape constructor
        super(brand);
        System.out.println("Motorcycle constructor called");
        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
    }

    @Override
    double calculateFuelEfficiency() {
        return engineCapacity/mileage;
    }

    @Override
    public String toString() {
        return "motorcycle brand is " + super.getBrand()
                + "and fuel efficiency  is : " + calculateFuelEfficiency();
    }
}

public class Test{
    public static void main(String[] args) {
        Vehicle s1 = new Car("Toyota", 500, 50);
        Vehicle s2 = new Motorcycle("Honda", 600, 60);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
 