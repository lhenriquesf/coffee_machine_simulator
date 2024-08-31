import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        float x = scanner.nextFloat();

        float res = (x*x*x)+(x*x)+x+1;

        System.out.println(res);
    }
}