package Day4.Arrays;

import java.util.Scanner;

public class arraysSumAndAverage {
    public static void main(String[] args) {

        //Day4
        //Sum and Average of Elements

        Scanner scanner = new Scanner(System.in);

        int size, sum = 0;
        double avg = 0;
        System.out.print("Enter the size of array: ");
        size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("Array = ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
            sum = sum + numbers[i];
            avg = (double) sum / size;
        }

        System.out.println("Sum = " + sum);
        System.out.println("Average = " + sum + "/" + size + " = " + avg);

        scanner.close();
    }
}
