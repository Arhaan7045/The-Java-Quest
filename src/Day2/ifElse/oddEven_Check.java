package Day2.ifElse;
import java.util.Scanner;

public class oddEven_Check {
    public static void main(String[] args) {

        //Day2
        //Check if a number is even/odd

        Scanner scanner = new Scanner(System.in);
        int num;
        System.out.print("Enter the number to check whether it's Odd or Even: ");
        num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is an Even number.");
        }
        else {
            System.out.println(num + " is an Odd number.");
        }

        scanner.close();
    }
}
