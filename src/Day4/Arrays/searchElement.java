package Day4.Arrays;
import java.util.Scanner;
public class searchElement {
    public static void main(String[] args) {

        //Day4
        //Search an Element

        Scanner scanner = new Scanner(System.in);

        int size, target;
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

        System.out.print("Enter the element to search: ");
        target = scanner.nextInt();

        int index = 0;
        boolean isfound = false;

        for (int num : numbers){
            if (num == target) {
                System.out.println(target + " found at index " + index);
                isfound = true;
                break;
            }
            index++;
        }

        if (!isfound) {
            System.out.println(target + " not found in the array.");

        }



        scanner.close();
    }
}
