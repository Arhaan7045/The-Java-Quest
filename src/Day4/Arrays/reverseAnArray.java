package Day4.Arrays;
import java.util.Scanner;
public class reverseAnArray {
    public static void main(String[] args) {

        //Day4
        //Reverse an Array

        Scanner scanner = new Scanner(System.in);

        int size;
        System.out.print("Enter the size of array: ");
        size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Original Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < size / 2; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[size - 1 - i];
            numbers[size - 1 - i] = temp;
        }

        System.out.print("Reversed Array: ");
        for (int num : numbers){
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
