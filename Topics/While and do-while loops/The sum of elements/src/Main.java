import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int sum = 0;
        int number;

        while((number = scanner.nextInt()) !=0){
            sum+=number;
        }
        System.out.println(sum);
    }
}