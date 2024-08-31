import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Read the number of apples from the user
        int numberApples = input.nextInt();

        // Read the number of oranges from the user
        int numberOranges = input.nextInt();


        // Calculate the total number of fruits
        int numberFruits = numberOranges+numberApples;

        // Print the result
        System.out.println(numberFruits);
    }
}