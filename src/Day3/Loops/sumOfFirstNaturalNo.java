package Day3.Loops;
import java.util.Scanner;
public class sumOfFirstNaturalNo {
    public static void main(String[] args) {

        //Day3
        //Sum of First N Natural Numbers (while loop)

        Scanner scanner = new Scanner(System.in);

        int num, i = 1, sum = 0;
        System.out.print("Enter a number to print the sum: ");
        num = scanner.nextInt();

        while (i <= num) {
            sum = sum + i;
            i++;
        }
        System.out.println("Sum = " + sum);

        scanner.close();
    }
}
