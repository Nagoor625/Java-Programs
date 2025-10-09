package Week3;

public class Program3_FibonacciSeries {

    // Method to print Fibonacci series
    public static void printFibonacci(int n) {
        int first = 0, second = 1;
        System.out.print("Fibonacci Series up to " + n + " numbers: ");

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }

    public static void main(String[] args) {
        printFibonacci(10); // print first 10 Fibonacci numbers
    }
}
