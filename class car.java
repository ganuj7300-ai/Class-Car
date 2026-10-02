class Car {
    // Data members
    String brand;
    String model;
    double price;
 
    // Constructor to initialize values
    Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
 
    // Method to display car details
    void displayDetail() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("---------------------------");
    }
}
 
public class Main {
    public static void main(String[] args) {
 
        // Creating 3 objects of Car class
        Car c1 = new Car("Maruti Suzuki", "Swift", 650000);
        Car c2 = new Car("Hyundai", "Creta", 1100000);
        Car c3 = new Car("Tata", "Nexon", 900000);
 
        System.out.println("Car Details:");
        System.out.println("---------------------------");
 
        // Displaying details
        c1.displayDetail();
        c2.displayDetail();
        c3.displayDetail();
    }
}
