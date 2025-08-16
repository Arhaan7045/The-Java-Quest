package Day4.Arrays;
import java.util.Scanner;
public class evenAndOddElements {
    public static void main(String[] args) {

        //Day4
        //Count Even and Odd Elements

        Scanner scanner = new Scanner(System.in);

        int size;
        System.out.print("Enter the size of array: ");
        size = scanner.nextInt();

        int[] numbers = new int[size];
        System.out.print("Enter " + size + " elements: ");

        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        int evenCount = 0, oddCount = 0;

        System.out.print("Even numbers: ");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.print(num + " ");
                evenCount++;
            }
        }
        System.out.println("(" + evenCount + " Even number/s)");

        System.out.print("Odd numbers: ");
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
                oddCount++;
            }
        }
        System.out.println("(" + oddCount + " Odd number/s)");

        scanner.close();
    }
}
