package Day6.Methods;

import java.util.Scanner;

public class factorialUsingMethod {

    //Day 6
    //Factorial Using Method

    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num, result;
        System.out.print("Enter a number for factorial: ");
        num = sc.nextInt();
        result = factorial(num);

        System.out.println("Factorial of " + num + " = " + result);

        sc.close();
    }
}