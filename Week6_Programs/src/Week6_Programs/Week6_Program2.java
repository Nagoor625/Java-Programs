package Week6_Programs;

//File: Calculator.java
class Calculator {
 // Method Overloading: add() with different parameters

 int add(int a, int b) {
     return a + b;
 }

 double add(double a, double b) {
     return a + b;
 }

 int add(int a, int b, int c) {
     return a + b + c;
 }
}

public class Week6_Program2 {
 public static void main(String[] args) {
     Calculator calc = new Calculator();

     System.out.println("Sum of 2 integers: " + calc.add(10, 20));
     System.out.println("Sum of 2 doubles: " + calc.add(12.5, 7.5));
     System.out.println("Sum of 3 integers: " + calc.add(5, 10, 15));
 }
}
