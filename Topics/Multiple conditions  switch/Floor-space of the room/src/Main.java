import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        final double pi = 3.14;
        double res = 0;

        String typeShape = scanner.nextLine();

        switch (typeShape) {
            case "triangle":
                double a = scanner.nextInt();
                double b = scanner.nextInt();
                double c = scanner.nextInt();

                double p = (a + b + c) / 2;

                res = Math.sqrt(p * (p - a) * (p - b) * (p - c));

                break;

            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();

                res = a * b;
                break;

            case "circle":
                double r = scanner.nextInt();

                res = pi * (Math.pow(r, 2));
                break;

            default:
                res = 0;
                break;
        }
        System.out.println(res);
    }
}