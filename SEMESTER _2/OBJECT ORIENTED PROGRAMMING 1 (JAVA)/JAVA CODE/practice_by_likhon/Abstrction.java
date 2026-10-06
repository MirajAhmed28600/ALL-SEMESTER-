abstract class Vehicle {
    String brand;

    public Vehicle(String brand){
        System.out.println("Vehicle constructor called");
        this.brand = brand;
    }

    public abstract double calculateFuelEfficiency();
    public abstract String toString();

    public String getBrand(){
        return brand;
    }
}

// ---------------- Car ----------------
class Car extends Vehicle {

    double distanceTravelled;
    double fuelConsumed;

    public Car(String brand, double distanceTravelled, double fuelConsumed){
        super(brand);
        System.out.println("Car constructor called");

        this.distanceTravelled = distanceTravelled;
        this.fuelConsumed = fuelConsumed;
    }

    @Override
    public double calculateFuelEfficiency() {
        return distanceTravelled / fuelConsumed;
    }

    @Override 
    public String toString(){
        return "Car brand is: " + getBrand() +
               " and fuel efficiency is: " + calculateFuelEfficiency();
    }
}

// ---------------- Motorcycle ----------------
class Motorcycle extends Vehicle {

    int engineCapacity;
    double mileage;

    public Motorcycle(String brand, int engineCapacity, double mileage) {
        super(brand);
        System.out.println("Motorcycle constructor called");

        this.engineCapacity = engineCapacity;
        this.mileage = mileage;
    }

    @Override
    public double calculateFuelEfficiency(){
        return engineCapacity / mileage;
    }

    @Override
    public String toString(){
        return "Motorcycle brand is: " + getBrand() +
               " and fuel efficiency is: " + calculateFuelEfficiency();
    }
}

// ---------------- Main ----------------
public class Abstrction{
    public static void main(String[] args) {

        Vehicle v1 = new Car("Toyota", 500, 40);
        Vehicle v2 = new Motorcycle("Yamaha", 150, 45.5);

        System.out.println(v1);
        System.out.println(v2);
    }
}