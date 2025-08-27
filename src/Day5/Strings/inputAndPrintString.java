package Day5.Strings;
import java.util.Scanner;
public class inputAndPrintString {
    public static void main(String[] args) {

        //Day 5
        //Input and Print String

        Scanner scanner = new Scanner(System.in);

        String sentence;
        System.out.print("Enter a string: ");
        sentence = scanner.nextLine();

        System.out.println("String = " + sentence);


        scanner.close();
    }
}
