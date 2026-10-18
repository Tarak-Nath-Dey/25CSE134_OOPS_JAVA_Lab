//Write a Java program to create a vehicle class hierarchy. The base class should be vehicle with subclass Truck, Car and Motorcycle. Each subclass should have properties such as make,model,years,and fuel type. Implement methods for calculating fuel efficiency, distance travelled, and maximum speed.

class Vehicle {
    String make;
    String model;
    int years;
    String fuelType;

    void fuelEfficiency() {
        System.out.println("Fuel efficiency depends on the vehicle.");
    }

    void distanceTravelled() {
        System.out.println("Distance travelled depends on the vehicle.");
    }

    void maximumSpeed() {
        System.out.println("Maximum speed depends on the vehicle.");
    }
}

class Truck extends Vehicle {

    Truck(String make, String model, int years, String fuelType) {
        this.make = make;
        this.model = model;
        this.years = years;
        this.fuelType = fuelType;
    }

    void fuelEfficiency() {
        System.out.println("Fuel efficiency: 8 km/l");
    }

    void distanceTravelled() {
        System.out.println("Distance travelled: 500 km");
    }

    void maximumSpeed() {
        System.out.println("Maximum speed: 120 km/h");
    }
}

class Car extends Vehicle {

    Car(String make, String model, int years, String fuelType) {
        this.make = make;
        this.model = model;
        this.years = years;
        this.fuelType = fuelType;
    }

    void fuelEfficiency() {
        System.out.println("Fuel efficiency: 18 km/l");
    }

    void distanceTravelled() {
        System.out.println("Distance travelled: 600 km");
    }

    void maximumSpeed() {
        System.out.println("Maximum speed: 180 km/h");
    }
}

class Motorcycle extends Vehicle {

    Motorcycle(String make, String model, int years, String fuelType) {
        this.make = make;
        this.model = model;
        this.years = years;
        this.fuelType = fuelType;
    }

    void fuelEfficiency() {
        System.out.println("Fuel efficiency: 45 km/l");
    }

    void distanceTravelled() {
        System.out.println("Distance travelled: 400 km");
    }

    void maximumSpeed() {
        System.out.println("Maximum speed: 150 km/h");
    }

    public static void main(String[] args) {

        Truck t = new Truck("Tata", "Prima", 2022, "Diesel");
        Car c = new Car("Toyota", "Fortuner", 2023, "Petrol");
        Motorcycle m = new Motorcycle("Honda", "CBR", 2024, "Petrol");

        System.out.println("Truck:");
        System.out.println(t.make + " " + t.model + " " + t.years + " " + t.fuelType);
        t.fuelEfficiency();
        t.distanceTravelled();
        t.maximumSpeed();

        System.out.println("\nCar:");
        System.out.println(c.make + " " + c.model + " " + c.years + " " + c.fuelType);
        c.fuelEfficiency();
        c.distanceTravelled();
        c.maximumSpeed();

        System.out.println("\nMotorcycle:");
        System.out.println(m.make + " " + m.model + " " + m.years + " " + m.fuelType);
        m.fuelEfficiency();
        m.distanceTravelled();
        m.maximumSpeed();
    }
}