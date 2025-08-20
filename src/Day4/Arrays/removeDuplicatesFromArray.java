package Day4.Arrays;
import java.util.Scanner;

public class removeDuplicatesFromArray {
    public static void main(String[] args) {

        // Day4
        // Remove Duplicates from Array
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = scanner.nextInt();

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

        // ---- Remove Duplicates ----
        System.out.print("Array without duplicates: ");
        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;

            // Check if numbers[i] already appeared before
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not duplicate, print it
            if (!isDuplicate) {
                System.out.print(numbers[i] + " ");
            }
        }

        scanner.close();
    }
}
