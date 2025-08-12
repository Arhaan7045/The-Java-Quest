package Day3.Loops;
import java.util.Scanner;
public class fibonacciSeries {
    public static void main(String[] args) {

        //Day4
        //Fibonacci Series (for loop)

        Scanner scanner = new Scanner(System.in);

        int a = 0, b = 1, c, num;
        System.out.print("Enter the N term for fibonacci series: ");
        num = scanner.nextInt();
        System.out.print(a + " " + b);

        for (int i = 1; i <= num; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        scanner.close();
    }
}