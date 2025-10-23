package Week6_Programs;

//File: Employee.java
class Employee {
 String name;
 double salary;

 Employee(String name, double salary) {
     this.name = name;
     this.salary = salary;
 }

 void displayDetails() {
     System.out.println("Employee Name: " + name);
     System.out.println("Salary: $" + salary);
 }
}

//File: Manager.java
class Manager extends Employee {
 double bonus;

 Manager(String name, double salary, double bonus) {
     super(name, salary);
     this.bonus = bonus;
 }

 // Overriding method
 @Override
 void displayDetails() {
     System.out.println("Manager Name: " + name);
     System.out.println("Salary: $" + salary);
     System.out.println("Bonus: $" + bonus);
 }
}


public class Week6_Program3 {
 public static void main(String[] args) {
     Employee emp = new Employee("John", 50000);
     Manager mgr = new Manager("Deekshitha", 70000, 10000);

     System.out.println("--- Employee Details ---");
     emp.displayDetails();

     System.out.println("\n--- Manager Details (Overridden Method) ---");
     mgr.displayDetails();
 }
}
