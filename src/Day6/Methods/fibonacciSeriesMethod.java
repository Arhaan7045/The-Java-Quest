package Day6.Methods;
import java.util.Scanner;
public class fibonacciSeriesMethod {

    //Day 6
    //Fibonacci Series Using Method

    public static void printFibonacci(int num) {

        int a = 0, b = 1, c;
        int fibonacci = 0;
        System.out.print(a + " " + b);
        for (int i = 3; i <= num; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        System.out.print("Enter the number of terms: ");
        number = sc.nextInt();

        System.out.println("Fibonacci Series: ");
        printFibonacci(number);

        sc.close();
    }
}
