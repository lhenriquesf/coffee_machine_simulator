import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n = scanner.nextInt();
        int a_sum = 0, b_sum = 0, c_sum = 0, d_sum = 0;
        String grades;

        for(int i=0; i<n; i++){
            grades = scanner.next();

            switch (grades) {
                case "A" -> a_sum += 1;
                case "B" -> b_sum += 1;
                case "C" -> c_sum += 1;
                default -> d_sum += 1;
            }
        }
        System.out.printf("%d %d %d %d".formatted(d_sum, c_sum, b_sum, a_sum));
    }
}