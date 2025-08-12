package Day3.Loops;
import java.util.Scanner;
public class reverseNumber {
    public static void main(String[] args) {

        //Day3
        //Reverse a Number (while loop)

        Scanner scanner = new Scanner(System.in);

        int num , rem, reverse = 0;
        System.out.print("Enter a number to reverse it: ");
        num = scanner.nextInt();
        System.out.println(num);

        while (num > 0) {
            rem = num % 10;
            reverse = (reverse * 10) + rem;
            num = num / 10;
            
        }
        System.out.println("Reverse = " + reverse);

        scanner.close();
    }
}
