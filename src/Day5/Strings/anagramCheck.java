package Day5.Strings;
import java.util.Arrays;
import java.util.Scanner;
public class anagramCheck {
    public static void main(String[] args) {

        //Day 5
        //Anagram Check

        Scanner sc = new Scanner(System.in);

        String line1, line2;
        System.out.print("Enter 1st string: ");
        line1 = sc.nextLine().toLowerCase().replaceAll("//s", "");
        System.out.print("Enter 2nd string: ");
        line2 = sc.nextLine().toLowerCase().replaceAll("//s", "");

        if (line1.length() != line2.length()) {
            System.out.println("Not Anagrams");
        }
        else {
            char[] arr1 = line1.toCharArray();
            char[] arr2 = line2.toCharArray();

            // Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare arrays
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }

        sc.close();
    }
}
