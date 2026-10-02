class Car {
// Data members String brand; String model; double price;

// Constructor
Car(String brand, String model, double price) { this.brand = brand;
this.model = model; this.price = price;
}

// Method to display car details void displayDetail() {
System.out.println("Brand: " + brand); System.out.println("Model: " + model); System.out.println("Price: Rs." + price); System.out.println("	");
}
}

public class Main {
public static void main(String[] args) {

// Creating 3 objects
Car car1 = new Car("Toyota", "Fortuner", 3500000); Car car2 = new Car("Hyundai", "Creta", 1800000); Car car3 = new Car("Tata", "Nexon", 1200000);

// Displaying details car1.displayDetail();
 
car2.displayDetail(); car3.displayDetail();
}
}
