package Day2.ifElse;
import java.util.Scanner;

public class Positive_Negative_Zero {
    public static void main(String[] args) {

        //Day2
        //Check Positive, Negative, or Zero

        Scanner scanner = new Scanner(System.in);
        long num;
        System.out.print("Enter a number to check Positive, Negative, or Zero: ");
        num = scanner.nextInt();

        if (num > 0) {
            System.out.println(num + " is a Positive number.");
        }
        else if (num < 0) {
            System.out.println(num + " is a Negative number.");
        }
        else {
            System.out.println("It's a Zero.");
        }

        scanner.close();
    }
}
