package Day2.Switch;
import java.util.Scanner;
public class dayOfTheWeek {
    public static void main(String[] args) {

        //Day2
        //Day of the Week

        Scanner scanner = new Scanner(System.in);
        char choice;

        System.out.print("Enter number to check day: ");
        choice = scanner.next().charAt(0);

        switch (choice) {
            case '1' -> System.out.println("Today is Monday");
            case '2' -> System.out.println("Today is Tuesday");
            case '3' -> System.out.println("Today is Wednesday");
            case '4' -> System.out.println("Today is Thursday");
            case '5' -> System.out.println("Today is Friday");
            case '6' -> System.out.println("Today is Saturday");
            case '7' -> System.out.println("Today is Sunday");
            default -> System.out.println("Enter number between 1-7");
        }

        scanner.close();
    }
}
