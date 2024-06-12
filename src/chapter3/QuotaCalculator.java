package chapter3; // Chapter 3B

import java.util.Scanner;

/*
 * IF ELSE statement:
 * All salespeople are expected to make at least 10 sales a week
 * For those who do, they receive a congratulatory message
 * Those who don't are informed on how many sales short they were
 */

public class QuotaCalculator {

    public static void main(String[] args) {
        // Initialize values we know
        int quota = 10;

        // Get values we don't know
        System.out.println("Enter the number of sales you made this week.");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Make a decision on path to take - Output
        if (sales >= quota) {
            System.out.println("Congrats! You've met your quota!");
        } else {
            int salesShort = quota - sales;
            System.out.println("You did not meet your quota. You were " + salesShort + " sales short.");
        }
    }
}
