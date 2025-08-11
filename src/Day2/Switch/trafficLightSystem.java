package Day2.Switch;
import java.util.Scanner;
public class trafficLightSystem {
    public static void main(String[] args) {

        //Day2
        //Traffic Light System

        Scanner scanner = new Scanner(System.in);

        String trafficColor;
        System.out.print("Enter the traffic color (Red, Yellow, Green): ");
        trafficColor = scanner.nextLine().toLowerCase();

        switch (trafficColor) {
            case "red" -> System.out.println("Stop!");
            case "yellow" -> System.out.println("Ready!");
            case "green" -> System.out.println("Go!");
            default -> System.out.println("Invalid Traffic Color");
        }

        scanner.close();
    }
}
