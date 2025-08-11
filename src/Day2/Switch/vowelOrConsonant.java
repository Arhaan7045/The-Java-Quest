package Day2.Switch;
import java.util.Scanner;
public class vowelOrConsonant {
    public static void main(String[] args) {

        //Day2
        //Vowel or Consonant

        Scanner scanner = new Scanner(System.in);

        char letter;
        System.out.print("Enter a letter to check if it's vowel or consonant: ");
        letter = scanner.next().toLowerCase().charAt(0);

        switch (letter) {
            case 'a', 'e', 'i', 'o', 'u' -> System.out.println(letter + " is a vowel.");
            default -> System.out.println(letter + " is a consonant.");
        }

        scanner.close();
    }
}
