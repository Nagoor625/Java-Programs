package Week5_Programs;

public class Week5_Program2 {

    // Attributes
    String name;
    int rollNo;
    double marks1, marks2, marks3;

    // Constructor
    public Week5_Program2(String name, int rollNo, double marks1, double marks2, double marks3) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    // Method to calculate percentage
    public double calculatePercentage() {
        return (marks1 + marks2 + marks3) / 3.0;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks1 + ", " + marks2 + ", " + marks3);
        System.out.println("Percentage: " + String.format("%.2f", calculatePercentage()) + "%");
    }

    // Main method to create objects
    public static void main(String[] args) {
    	Week5_Program2 s1 = new Week5_Program2("Sharif", 101, 85, 90, 88);
    	Week5_Program2 s2 = new Week5_Program2("Aisha", 102, 78, 84, 80);

        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();
    }
}
