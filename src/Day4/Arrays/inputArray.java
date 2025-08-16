package Day4.Arrays;

import java.util.Scanner;

public class inputArray {
    public static void main(String[] args) {

        //Day4
        //Input and Print Array

        Scanner scanner = new Scanner(System.in);
        int size;
        System.out.print("Enter the size of array: ");
        size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.print("Enter " + size + " inputs: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.println("You Entered: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        scanner.close();
    }
}
