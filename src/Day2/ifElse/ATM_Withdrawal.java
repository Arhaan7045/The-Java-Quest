package Day2.ifElse;
import java.util.Scanner;
public class ATM_Withdrawal {
    public static void main(String[] args) {

        //Day2
        //ATM Withdrawal
        Scanner scanner = new Scanner(System.in);
        double balance = 10000, withdrawal;

        System.out.print("Enter the amount to withdraw: ");
        withdrawal = scanner.nextDouble();

        if (balance >= withdrawal && withdrawal % 100 == 0) {
            balance -= withdrawal;
            System.out.printf("Your current balance after %.2frs withdrawal is %.2frs", withdrawal, balance);
        }
        else {
            System.out.println("Insufficient balance");
        }

        scanner.close();

    }
}
