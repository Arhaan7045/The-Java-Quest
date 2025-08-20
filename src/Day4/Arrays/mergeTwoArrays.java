package Day4.Arrays;
import java.util.Scanner;
public class mergeTwoArrays {
    public static void main(String[] args) {

        //Day4
        //Merge Two Arrays

        Scanner scanner = new Scanner(System.in);

        int size1, size2;
        System.out.print("Enter the size of 1st array: ");
        size1 = scanner.nextInt();
        System.out.print("Enter the size of 2nd array: ");
        size2 = scanner.nextInt();

        int[] numbers1 = new int[size1];
        int[] numbers2 = new int[size2];
        int[] merged = new int[size1 + size2];

        System.out.print("Enter " + size1 + " elements for 1st array: ");
        for (int i = 0; i < size1; i++) numbers1[i] = scanner.nextInt();

        System.out.print("Enter " + size2 + " elements for 2nd array: ");
        for (int i = 0; i < size2; i++) numbers2[i] = scanner.nextInt();

        for (int i = 0; i < size1; i++) {
            merged[i] = numbers1[i];
        }
        for (int i = 0; i < size2; i++) {
            merged[size1 + i] = numbers2[i];
        }

        System.out.println("Merged Array: ");
        for (int num : merged) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
