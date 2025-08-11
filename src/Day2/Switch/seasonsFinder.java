package Day2.Switch;
import java.util.Scanner;
public class seasonsFinder {
    public static void main(String[] args) {

        //Day2
        //Seasons Finder

        Scanner scanner = new Scanner(System.in);

        int monthNumber;
        System.out.print("Enter the month number to check season: ");
        monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1 -> System.out.println("January -> Winter season");
            case 2 -> System.out.println("February -> Winter season");
            case 3 -> System.out.println("March -> Summer season");
            case 4 -> System.out.println("April -> Summer season");
            case 5 -> System.out.println("May -> Summer season");
            case 6 -> System.out.println("June -> Summer season");
            case 7 -> System.out.println("July -> Monsoon season");
            case 8 -> System.out.println("August -> Monsoon season");
            case 9 -> System.out.println("September -> Monsoon season");
            case 10 -> System.out.println("October -> Autumn season");
            case 11 -> System.out.println("November -> Autumn season");
            case 12 -> System.out.println("December -> Winter season");
            default -> System.out.println("Invalid month number");
        }

        scanner.close();
    }
}
