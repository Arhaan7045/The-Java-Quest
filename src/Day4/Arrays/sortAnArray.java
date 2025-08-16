package Day4.Arrays;
import java.util.Scanner;
public class sortAnArray {
    public static void main(String[] args) {

        //Day4
        //Sort an Array (Ascending & Descending)

        Scanner scanner = new Scanner(System.in);

        int size;
        System.out.print("Enter the size of array: ");
        size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Array = ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.print("Array in Ascending Order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        // ---------- Descending Order ----------
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    // swap
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.print("Array in Descending Order: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();

    }
}
