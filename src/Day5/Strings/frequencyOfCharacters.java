package Day5.Strings;
import java.util.Scanner;
public class frequencyOfCharacters {
    public static void main(String[] args) {

        //Day 5
        //Frequency of Characters

        Scanner scanner = new Scanner(System.in);

        String line;
        System.out.print("Enter a string: ");
        line = scanner.nextLine().toLowerCase();

        int[] freq = new int[256];

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (ch != ' ') {
                freq[ch]++;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)i + " = " + freq[i]);
            }
        }

        scanner.close();
    }
}
