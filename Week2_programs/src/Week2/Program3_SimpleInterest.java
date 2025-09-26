package Week2;

import java.util.Scanner;

public class Program3_SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principal (P): ");
        double P = sc.nextDouble();

        System.out.print("Enter Time (T in years): ");
        double T = sc.nextDouble();

        System.out.print("Enter Rate (R in %): ");
        double R = sc.nextDouble();

        double SI = (P * T * R) / 100;
        System.out.println("Simple Interest = " + SI);

        sc.close();
    }
}

//tested