package Day1;
import java.util.Scanner;
public class Temp_Converter {
    public static void main(String[] args) {

        //Day1
        //Convert Celsius to Fahrenheit

        Scanner scanner = new Scanner(System.in);

        double celsius, fahrenheit, conversion;
        char choice;

        System.out.println("1. Convert Celsius to Fahrenheit");
        System.out.println("2. Convert Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        choice = scanner.next().charAt(0);

        switch (choice) {
            case '1' -> {
                System.out.print("Enter degrees in Celsius: ");
                celsius = scanner.nextDouble();
                conversion = ((double) 9 / 5 * celsius) + 32;
                System.out.println("The degree after conversion is " + conversion + "°f");
            }
            case '2' -> {
                System.out.print("Enter degrees in Fahrenheit: ");
                fahrenheit = scanner.nextDouble();
                conversion = (fahrenheit - 32) * 5/9;
                System.out.println("The degree after conversion is " + conversion + "°c");
            }
            default -> System.out.println("Invalid choice");
        }

        scanner.close();
    }
}
