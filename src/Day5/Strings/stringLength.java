package Day5.Strings;

import java.util.Scanner;

public class stringLength {
    public static void main(String[] args) {

        //Day 5
        //String Length

        Scanner scanner = new Scanner(System.in);

        String line;
        System.out.print("Enter a string: ");
        line = scanner.nextLine();

        int count = 0;

        // Loop until IndexOutOfBounds occurs
        try {
            while (true) {
                line.charAt(count);
                count++;
            }
        } catch (Exception e) {
            // do nothing, loop stops automatically
        }

        System.out.println("Length of the string: " + count);

        scanner.close();
    }
}
