import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here

        final byte number = scanner.nextByte();
        String txt = "You have chosen a ";

        switch (number) {
            case 1:
                txt += "square";
                break;
            case 2:
                txt += "circle";
                break;
            case 3:
                txt += "triangle";
                break;
            case 4:
                txt += "rhombus";
                break;
            default:
                txt = "There is no such shape!";
                break;
        }

        System.out.println(txt);

    }
}