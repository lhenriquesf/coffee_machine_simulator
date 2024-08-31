import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int n = scanner.nextInt();
        int sum_one=0, sum_zero=0, sum_neg=0;

        for(int i=1; i<=n; i++){
            int part = scanner.nextInt();

            if(part==1){
                sum_one+=1;
            } else if (part==0) {
                sum_zero+=1;
            }else {
                sum_neg+=1;
            }
        }
        System.out.printf("%d %d %d",sum_zero,sum_one,sum_neg);
    }
}