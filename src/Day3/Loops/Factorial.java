package Day3.Loops;
import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        //Day3
        //Factorial of a Number (for loop)

        Scanner scanner = new Scanner(System.in);

        int num, factorial = 1;
        System.out.print("Enter a number to find factorial: ");
        num = scanner.nextInt();

        for (int i = num; i >= 1; i--) {
            System.out.print(i + " ");
            factorial = factorial * i;

        }
        System.out.println();
        System.out.println("Factorial = " + factorial);


        scanner.close();
    }
}
