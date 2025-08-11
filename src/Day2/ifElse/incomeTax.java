package Day2.ifElse;
import java.util.Scanner;

public class incomeTax {
    public static void main(String[] args) {

        //Day2
        //Income Tax Calculator

        Scanner scanner = new Scanner(System.in);
        double income, tax;

        System.out.print("Enter your income: ");
        income = scanner.nextDouble();

        if (income <= 250000) {
            System.out.println("No Tax");
        }
        else if (income > 250000 && income < 500000) {
            System.out.println("5% income tax applicable.");
            tax = (income / 100) * 5;
            System.out.printf("You'll have to pay %.2frs tax.", tax);
        }
        else if (income > 500000 && income < 1000000) {
            System.out.println("20% income tax applicable.");
            tax = (income / 100) * 20;
            System.out.printf("You'll have to pay %.2frs tax.", tax);
        }
        else if (income > 1000000) {
            System.out.println("30% income tax applicable.");
            tax = (income / 100) * 30;
            System.out.printf("You'll have to pay %.2frs tax.", tax);
        }
        else {
            System.out.println("Enter the valid income.");
        }

        scanner.close();
    }
}

