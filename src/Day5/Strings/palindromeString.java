package Day5.Strings;
import java.util.Scanner;
public class palindromeString {
    public static void main(String[] args) {

        //Day 5
        //Palindrome String

        Scanner scanner = new Scanner(System.in);

        String line, reversed = "";
        System.out.print("Enter a string: ");
        line = scanner.nextLine();

        for (int i = line.length() - 1; i >= 0; i--) {
            reversed = reversed + line.charAt(i);
        }

        if (line.equals(reversed)) {
            System.out.println("The string is palindrome");
        }
        else {
            System.out.println("The string is not palindrome");
        }

        scanner.close();
    }
}