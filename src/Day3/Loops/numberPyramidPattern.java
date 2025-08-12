package Day3.Loops;

import java.util.Scanner;

public class numberPyramidPattern {
    public static void main(String[] args) {

        //Day3
        //Number Pyramid Pattern (nested for loop)

        Scanner scanner = new Scanner(System.in);

        int num;
        System.out.print("Enter a number: ");
        num = scanner.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
