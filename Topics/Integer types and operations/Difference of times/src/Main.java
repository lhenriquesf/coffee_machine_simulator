import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int hour1 = scanner.nextInt(), minute1 = scanner.nextInt(), second1 = scanner.nextInt();
        int hour2 = scanner.nextInt(), minute2 = scanner.nextInt(), second2 = scanner.nextInt();

        int totalSecond1 = (hour1*60*60) + (minute1*60) + second1;
        int totalSecond2 = (hour2*60*60) + (minute2*60) + second2;

        System.out.println(totalSecond2-totalSecond1);

    }
}