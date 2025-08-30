package Day6.Methods;
import java.util.Scanner;
public class checkPrimeNumber {

    //Day 6
    //Check Prime Number

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter the number: ");
        num = sc.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        }
        else {
            System.out.println(num + " is NOT a prime number.");
        }

        sc.close();
    }
}