package Week4;

import java.util.Scanner;

public class Program4_LinearSearch {

    // Method to perform linear search
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key)
                return i;  // return index if found
        }
        return -1;  // return -1 if not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = linearSearch(arr, key);
        if (result == -1)
            System.out.println("Element not found.");
        else
            System.out.println("Element found at index: " + result);

        sc.close();
    }
}
