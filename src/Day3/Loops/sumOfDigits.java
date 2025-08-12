package Day3.Loops;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {

        //Day3
        //Sum of Digits (while loop)

        Scanner scanner = new Scanner(System.in);

        int num, i = 1, sum = 0;
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        while(i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum of " + num + " = " + sum);

        scanner.close();
    }
}
