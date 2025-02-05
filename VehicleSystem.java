class Vehicle {
    String brand, model;
    double price;
    Vehicle(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    void displayDetails() {
        System.out.println(brand + " " + model + " costs " + price);
    }
}
class Car extends Vehicle {
    int seatingCapacity;
    String fuelType;
    Car(String brand, String model, double price, int seatingCapacity, String fuelType) {
        super(brand, model, price);
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Seating Capacity: " + seatingCapacity + ", Fuel Type: " + fuelType);
    }
}
class ElectricCar extends Car {
    int batteryCapacity;
    int chargingTime;
    ElectricCar(String brand, String model, double price, int seatingCapacity, String fuelType, int batteryCapacity, int chargingTime) {
        super(brand, model, price, seatingCapacity, fuelType);
        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }
    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Battery: " + batteryCapacity + " kWh, Charging Time: " + chargingTime + " hours");
    }
}
public class VehicleSystem {
    public static void main(String[] args) {
        ElectricCar tesla = new ElectricCar("Tesla", "Model S", 79999, 5, "Electric", 100, 2);
        tesla.displayDetails();
    }
}