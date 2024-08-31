import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value

        int butterCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        int ten = 10;
        int twenty = 20;
        int fifteen = 15;
        int twentyFive = 25;

        if(isWeekend){
            System.out.println((isWeekend) && (fifteen <= butterCups && butterCups <= twentyFive));
        }else{
            System.out.println((!isWeekend) && (ten <= butterCups && butterCups <= twenty));
        }


    }
}