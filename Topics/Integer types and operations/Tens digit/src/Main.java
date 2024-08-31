import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        int digit_10 = (number/10)%10;
        System.out.println(digit_10);
    }
}