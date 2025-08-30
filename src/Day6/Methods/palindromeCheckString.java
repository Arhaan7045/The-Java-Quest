package Day6.Methods;

import java.util.Scanner;

public class palindromeCheckString {

    //Day 6
    //Palindrome Check (String)

    public static boolean isPalindrome(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed = reversed + str.charAt(i);
        }
        if (str.equals(reversed)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line;
        System.out.print("Enter a string: ");
        line = sc.nextLine();

        if (isPalindrome(line)) {
            System.out.println("The string is a palindrome");
        }
        else {
            System.out.println("The string is NOT a palindrome");
        }

        sc.close();
    }
}