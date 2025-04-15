package Activity1;

import java.util.Scanner;

// Base class Vehicle
public class Vehicle {
    private String brand;
    private int speed;
    private String fuelType;

    // Constructor to initialize attributes
    public Vehicle(String brand, int speed, String fuelType) {
        this.brand = brand;
        this.speed = speed;
        this.fuelType = fuelType;
    }

    // Getter methods
    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public String getFuelType() {
        return fuelType;
    }

    // Method to display vehicle information
    public void displayInfo() {
        System.out.println("Vehicle Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Type: " + fuelType);
    }

    // Main method to test the Vehicle, Car, and Motorcycle classes
    public static void main(String[] args) {
        // Create a scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter details for a Car
        System.out.println("Enter details for the Car:");

        System.out.print("Brand: ");
        String carBrand = scanner.nextLine();
        
        System.out.print("Speed (km/h): ");
        int carSpeed = scanner.nextInt();
        
        scanner.nextLine(); // Consume the newline character

        System.out.print("Fuel Type: ");
        String carFuelType = scanner.nextLine();

        System.out.print("Number of Doors: ");
        int carNumDoors = scanner.nextInt();
        
        // Create the Car object using the entered details
        Car myCar = new Car(carBrand, carSpeed, carFuelType, carNumDoors);

        // Prompt user to enter details for a Motorcycle
        scanner.nextLine(); // Consume the newline character
        System.out.println("\nEnter details for the Motorcycle:");

        System.out.print("Brand: ");
        String motoBrand = scanner.nextLine();
        
        System.out.print("Speed (km/h): ");
        int motoSpeed = scanner.nextInt();
        
        scanner.nextLine(); // Consume the newline character

        System.out.print("Fuel Type: ");
        String motoFuelType = scanner.nextLine();

        System.out.print("Does the motorcycle have a sidecar (true/false): ");
        boolean hasSidecar = scanner.nextBoolean();
        
        // Create the Motorcycle object using the entered details
        Motorcycle myMotorcycle = new Motorcycle(motoBrand, motoSpeed, motoFuelType, hasSidecar);

        // Display information for both vehicles
        System.out.println("\nCar Information:");
        myCar.displayInfo();
        
        System.out.println("\nMotorcycle Information:");
        myMotorcycle.displayInfo();
        
        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}

// Car subclass extends Vehicle class
class Car extends Vehicle {
    // Additional attribute for Car
    private int numDoors;

    // Constructor to initialize the attributes of Car and call the superclass constructor
    public Car(String brand, int speed, String fuelType, int numDoors) {
        // Call the superclass constructor
        super(brand, speed, fuelType);
        this.numDoors = numDoors;
    }

    // Override displayInfo() method to include the number of doors
    @Override
    public void displayInfo() {
        // Call the superclass displayInfo() method
        super.displayInfo();
        // Display the number of doors
        System.out.println("Number of Doors: " + numDoors);
    }
}

// Motorcycle subclass extends Vehicle class
class Motorcycle extends Vehicle {
    // Additional attribute for Motorcycle
    private boolean hasSidecar;

    // Constructor to initialize the attributes of Motorcycle and call the superclass constructor
    public Motorcycle(String brand, int speed, String fuelType, boolean hasSidecar) {
        // Call the superclass constructor
        super(brand, speed, fuelType);
        this.hasSidecar = hasSidecar;
    }

    // Override displayInfo() method to include whether the motorcycle has a sidecar
    @Override
    public void displayInfo() {
        // Call the superclass displayInfo() method
        super.displayInfo();
        // Display whether the motorcycle has a sidecar
        String sidecarInfo = hasSidecar ? "Yes" : "No";
        System.out.println("Has Sidecar: " + sidecarInfo);
    }
}
