package Day2.ifElse;

import java.util.Scanner;

public class Largest2Numbers {
    public static void main(String[] args) {

        //Day2
        //Find the Largest of Two Numbers

        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2 + ".");
        }
        else {
            System.out.println(num2 + " is greater than " + num1 + ".");
        }


        scanner.close();
    }
}
