package Day5.Strings;

import java.util.Scanner;

public class countWordsInSentence {
    public static void main(String[] args) {

        //Day 5
        //Count Words in a Sentence

        Scanner scanner = new Scanner(System.in);

        String line;
        int count = 0;
        System.out.print("Enter a string: ");
        line  =scanner.nextLine().trim();

        boolean inWord = false;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (ch != ' ' && !inWord) {
                // start of a new word
                inWord = true;
                count++;
            }
            else if (ch == ' ') {
                // end of a word
                inWord = false;
            }
        }

        System.out.println("No. of words in this string is: " + count);

        scanner.close();
    }
}
