package Week5_Programs;

public class Week5_Program1 {

    // Attributes
    String brand;
    String model;
    int year;

    // Constructor
    public Week5_Program1(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    // Main method to create objects and display info
    public static void main(String[] args) {
    	Week5_Program1 car1 = new Week5_Program1("Toyota", "Camry", 2022);
    	Week5_Program1 car2 = new Week5_Program1("Tesla", "Model 3", 2024);

        car1.displayCarDetails();
        System.out.println();
        car2.displayCarDetails();
    }
}
