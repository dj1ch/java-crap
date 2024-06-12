package chapter3; // Chapter 3 Homework

import java.util.Scanner;

public class OneDollarChange {

    public static void main(String[] args) {
        int penny = 1;
        int nickel = 5;
        int dime = 10;
        int quarter = 25;
        int dollar = 100;

        System.out.println("Add up pennies, nickels, dimes, and quarters to equal $1!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many pennies?");
        int pennyNumber = scanner.nextInt();

        System.out.println("How many nickels?");
        int nickelNumber = scanner.nextInt();

        System.out.println("How many dimes?");
        int dimeNumber = scanner.nextInt();

        System.out.println("How many quarters?");
        int quarterNumber = scanner.nextInt();

        int result = (penny * pennyNumber) + (nickel * nickelNumber) + (dime * dimeNumber)
                + (quarter * quarterNumber);

        if (result == 100) {
            System.out.println("You won!");
        } else if (result > 100) {
            int moneyAbove = result - dollar;
            System.out.println("You didn't meet the required value.");
            System.out.println("You were " + moneyAbove + " cents above $1.");
        } else if (result < 100) {
            int moneyShort = dollar - result;
            System.out.println("You didn't meet the required value.");
            System.out.println("You were " + moneyShort + " cents short.");
        }
    }
}
