package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        menuApp();
    }

    public  static void menuApp() {
        Scanner inputUSer = new Scanner(System.in);

        int[] arrayMachine = new int[5];

        arrayMachine[0] = 400;
        arrayMachine[1] = 540;
        arrayMachine[2] = 120;
        arrayMachine[3] = 9;
        arrayMachine[4] = 550;


        boolean flag = true;
        while (flag) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit): ");
            String action = inputUSer.next();

            switch (action) {
                case "buy" :
                    arrayMachine = buyCoffee(arrayMachine[0], arrayMachine[1], arrayMachine[2], arrayMachine[3], arrayMachine[4]);
                    break;

                case "fill":
                    arrayMachine = fillMachine(arrayMachine[0], arrayMachine[1], arrayMachine[2], arrayMachine[3], arrayMachine[4]);
                    break;

                case "take":
                    arrayMachine[4] = takeMoney(arrayMachine[4]);
                    break;

                case "remaining":
                     remainingMachine(arrayMachine);
                    break;

                case "exit":
                    flag = false;
                    break;

                default:
                    break;
            }
        }
    }

    public static int[] buyCoffee(int water, int milk, int coffeeBeans, int cups, int money) {

        Scanner inputUser = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");

        String typeOfCoffee = inputUser.nextLine();

        switch (typeOfCoffee) {
            case "1":
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                } else if (coffeeBeans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");

                    cups--;

                    water -= 250;
                    coffeeBeans -= 16;
                    money += 4;
                }
                break;

            case "2":
                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                } else if (coffeeBeans < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");

                    cups--;

                    water -= 350;
                    milk -= 75;
                    coffeeBeans -= 20;
                    money += 7;
                }
                break;

            case "3":
                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                } else if (coffeeBeans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                } else {
                    System.out.println("I have enough resources, making you a coffee!");

                    cups--;

                    water -= 200;
                    milk -= 100;
                    coffeeBeans -= 12;
                    money += 6;
                }
                break;

            default:
                break;
        }

        return new int[] {water, milk, coffeeBeans, cups, money};
    }

    public static int[] fillMachine(int water, int milk, int coffeeBeans, int cups, int money) {

        Scanner inputUser = new Scanner(System.in);

        System.out.println("Write how many ml of water you want to add: ");
        water += inputUser.nextInt();

        System.out.println("Write how many ml of milk you want to add: ");
        milk += inputUser.nextInt();

        System.out.println("Write how many grams of coffee beans you want to add: ");
        coffeeBeans += inputUser.nextInt();

        System.out.println("Write how many disposable cups you want to add: ");
        cups += inputUser.nextInt();

        return new int[] {water, milk, coffeeBeans, cups, money};
    }

    public static int takeMoney (int money) {
        System.out.printf("I gave you $%d%n", money);
        System.out.println();
        money -= money;
        return money;
    }

    public static void remainingMachine (int[] arrayMachine) {
        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.printf("%d ml of water%n", arrayMachine[0]);
        System.out.printf("%d ml of milk%n", arrayMachine[1]);
        System.out.printf("%d g of coffee beans%n", arrayMachine[2]);
        System.out.printf("%d disposable cups%n", arrayMachine[3]);
        System.out.printf("$%d of money%n", arrayMachine[4]);
    }

}