import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // You can use nextLine method of scanner object to take the input from user
        String input = scanner.nextLine();
        // Use a switch statement here to determine the color of the traffic signal
        String color = switch (input) {
            case "1" -> "Green";
            case "2" -> "Yellow";
            case "3" -> "Red";
            default -> "Invalid";
        };

        System.out.println(color);
    }
}