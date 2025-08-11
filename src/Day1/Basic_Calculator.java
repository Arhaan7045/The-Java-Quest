package Day1;
import java.util.Scanner;

public class Basic_Calculator {
    public static void main(String[] args) {

        //Day1
        //Take 2 numbers from user & print sum, difference, product, division

        Scanner scanner = new Scanner(System.in);

        int num1, num2, result;
        char operation;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextInt();
        System.out.print("Choose the operation to perform (+, -, *, /): ");
        operation = scanner.next().charAt(0);
        System.out.print("Enter the second number: ");
        num2 = scanner.nextInt();

        if (num2 == 0) {
            System.out.println("Number can't be divisible by zero");
        }
        else {
            switch (operation) {
                case '+' -> {
                    result = num1 + num2;
                    System.out.println("The sum of " + num1 + " & " + num2 + " = " + result);
                }
                case '-' -> {
                    result = num1 - num2;
                    System.out.println("The difference of " + num1 + " & " + num2 + " = " + result);
                }
                case '*' -> {
                    result = num1 * num2;
                    System.out.println("The product of " + num1 + " & " + num2 + " = " + result);

                }
                case '/' -> {
                    result = num1 / num2;
                    System.out.println("The division of " + num1 + " & " + num2 + " = " + result);
                }
                default -> System.out.println("Invalid choice");
            }
        }

        scanner.close();

    }
}
