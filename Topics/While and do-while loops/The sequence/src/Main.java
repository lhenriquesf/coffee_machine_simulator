import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int seq = scanner.nextInt();
        int number, count=0, numberMax=0;

        while (count<seq){
            number = scanner.nextInt();
            ++count;

            if (number%4==0 && number>numberMax){
                numberMax = number;
            }
        }
        System.out.println(numberMax);
    }
}