package Day3.Loops;
import java.util.Scanner;
public class countDigits {
    public static void main(String[] args) {

        //Day3
        //Count Digits in a Number (do-while loop)

        Scanner scanner = new Scanner(System.in);

        int num, count = 0;
        System.out.print("Enter a number to count digit: ");
        num = scanner.nextInt();

        do {
            num = num / 10;
            System.out.println(num);
            count++;
        } while (num != 0);

        System.out.println("Digits = " + count);


        scanner.close();
    }
}
