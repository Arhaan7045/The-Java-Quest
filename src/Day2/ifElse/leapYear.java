package Day2.ifElse;

import java.util.Scanner;
public class leapYear {
    public static void main(String[] args) {

        //Day2
        //Leap Year Checker

        Scanner scanner = new Scanner(System.in);
        int year;

        System.out.print("Enter the year to check if it's a leap or not: ");
        year = scanner.nextInt();

        if (year % 4 == 0 || (year % 100 == 0 && year % 400 == 0)){
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
}
