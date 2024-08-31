import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int a=scanner.nextInt(), b=scanner.nextInt(), sum=0;

        for(int i=a; i<=b; i++){
            sum+=i;
        }
        System.out.println(sum);
    }
}