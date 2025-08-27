package Day5.Strings;
import java.util.Scanner;
public class countVowelsConsonants {
    public static void main(String[] args) {

        //Day 5
        //Count Vowels and Consonants

        Scanner scanner = new Scanner(System.in);

        String line;
        int vowels = 0, consonants = 0;
        System.out.print("Enter a string: ");
        line = scanner.nextLine().toLowerCase();

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            // Check only alphabets
            if (ch >= 'a' && ch <= 'z') {
                switch (ch) {
                    case 'a', 'e', 'i', 'o', 'u' -> vowels++;
                    default -> consonants++;
                }
            }
        }
        System.out.println("Vowel count: " + vowels);
        System.out.println("Consonant count: " + consonants);
        
        scanner.close();
    }
}