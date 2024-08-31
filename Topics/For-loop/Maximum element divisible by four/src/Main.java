import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int seq = scanner.nextInt();
        int number, maxNumber=0;

        for(int count=0; count<seq; count++){
            number = scanner.nextInt();

            if (number%4==0 && number>maxNumber){
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
    }
}