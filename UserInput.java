import java.util.*;
import java.util.Scanner;
class UserInput {
    Scanner scan = new Scanner(System.in);

    // Get two numbers from the user
    int[] userInput() {
        int[] numbers = new int[2];
        System.out.println("Enter first number:");
        numbers[0] = scan.nextInt();
        System.out.println("Enter second number:");
        numbers[1] = scan.nextInt();
        return numbers;
    }

    // Get a single number for Fibonacci
    int getNumber() {
        System.out.println("Enter a number:");
        return scan.nextInt();
    }

    // Get an array from the user
    int[] getArray() {
        System.out.println("Enter the size of the array:");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++)
            arr[i] = scan.nextInt();
        return arr;
    }

    // Menu selection using switch-case
    int getMenuChoice() {
        System.out.println("""
                Choose an operation:
                1. Addition
                2. Subtraction
                3. Multiplication
                4. Division
                5. Fibonacci Sequence
                6. Array Operations (Sum, Mean, Variance, Std Dev)
                0. Exit
                Enter your choice: """);

        int choice = scan.nextInt();
        scan.nextLine();
        return choice;
    }

    // Sub-menu for array operations
    int getArrayMenuChoice() {
        System.out.println("""
                Choose an array operation:
                1. Sum
                2. Mean
                3. Variance
                4. Standard Deviation
                0. Back to Main Menu
                Enter your choice: """);
        return scan.nextInt();
    }
}
