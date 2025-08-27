package Day5.Strings;

import java.util.Scanner;

public class removeWhitespaces {
    public static void main(String[] args) {

        //Day 5
        //Remove Whitespaces

        Scanner sc = new Scanner(System.in);

        String line;
        System.out.print("Enter a string: ");
        line = sc.nextLine();

        String lineWithoutSpace = line.replace(" ", "");
        System.out.println("String without space: " + lineWithoutSpace);

        sc.close();
    }
}
