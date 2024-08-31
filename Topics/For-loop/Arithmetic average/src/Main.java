import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        int a = scanner.nextInt(), b = scanner.nextInt();
        double sum=0, count=0;

        for (int i=a; i<=b; i++){
            if(i%3==0){
                sum+=i;
                count+=1;
            }
        }
        double media = sum /count;
        System.out.println(media);
    }
}