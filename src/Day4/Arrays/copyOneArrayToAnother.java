package Day4.Arrays;
import java.util.Scanner;
public class copyOneArrayToAnother {
    public static void main(String[] args) {


        //Day4
        //Copy One Array To Another

        Scanner scanner = new Scanner(System.in);

        int size;
        System.out.print("Enter the size of array: ");
        size = scanner.nextInt();

        int[] numbers = new int[size];
        int[] numbers2 = new int[size];

        System.out.print("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Original Array: " );
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size; i++) {
           numbers2[i] = numbers[i];
        }

        System.out.print("Copied Array: ");
        for (int num : numbers2) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
