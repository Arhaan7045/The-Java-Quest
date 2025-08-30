package Day6.Methods;
import java.util.Scanner;
public class maximumOfTwoNumbers {

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        else {
            return b;
        }
    }

    public static void main(String[] args) {

        //Day 6 - Methods (a block of reusable code that is executed when called () )
        //Maximum of Two Numbers

        Scanner sc = new Scanner(System.in);

        int num1, num2, result;
        System.out.print("Enter 1st number: ");
        num1 = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        num2 = sc.nextInt();

        result = max(num1, num2);

        System.out.println("Larger number is = " + result);

        sc.close();
    }
}
