package chapter4;

import java.util.Scanner;

/*
 * FOR loop
 * Write a cashier program that will scan a given number of items and tally the cost
 */

public class Cashier {

    public static void main(String[] args) {

        // Get nunber of items to scan
        System.out.println("Enter the number of items you would like to scan.");
        Scanner scanner = new Scanner(System.in);

        int quantity = scanner.nextInt();
        double total = 0;

        // Create loop to iterate through all of the items and accumulate the costs
        // note: first you set a sentinel, second is condition that ends loop
        for (int i = 0; i < quantity; i++) {

            System.out.println("Enter the cost of the item.");
            double price = scanner.nextDouble();

            total = total + price;
        }

        scanner.close();

        System.out.println("Your total is $" + total);
    }
}
