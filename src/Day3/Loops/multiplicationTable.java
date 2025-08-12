package Day3.Loops;
import java.util.Scanner;
public class multiplicationTable {
    public static void main(String[] args) {


        //Day3
        //Multiplication Table (for loop)

        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.print("Enter a number you want to print table of: ");
        num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

        scanner.close();
    }
}
