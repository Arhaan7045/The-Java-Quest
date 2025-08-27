package Day5.Strings;
import java.util.Scanner;
public class reverseAString {
    public static void main(String[] args) {

        //Day 5
        //Reverse a String

        Scanner scanner = new Scanner(System.in);

        String line;
        System.out.print("Enter a string: ");
        line = scanner.nextLine();

        String reversed = "";

        for (int i = line.length() - 1; i >= 0; i--) {
            reversed = reversed + line.charAt(i);
        }
        System.out.println("Reversed = " + reversed);

        scanner.close();
    }
}
