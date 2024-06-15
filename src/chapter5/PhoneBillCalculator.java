package chapter5; // Chapter 5 Homework

import java.util.Scanner;

public class PhoneBillCalculator {

    static double rate = 0.25;
    static double tax = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // get the user's input
        double bill = getBill();
        double fee = getFee();
        double overage = getOverage();
        scanner.close();

        // run calculations
        getTotal(bill, fee, overage);
    }

    public static double getBill() {
        System.out.println("According to your phone plan, what's the expected bill per every time you should pay it?:");

        return scanner.nextDouble();
    }

    public static double getFee() {
        System.out.println("What is your phone plan fee?:");

        return scanner.nextDouble();
    }

    public static double getOverage() {
        System.out.println("How many minutes were you over your phone plan?:");
        double over = scanner.nextDouble();

        return over * rate;
    }

    public static void getTotal(double bill, double fee, double over) {
        double total = bill + fee + over;

        System.out.println("Your total is $" + total);
    }
}
