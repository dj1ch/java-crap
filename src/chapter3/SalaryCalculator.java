package chapter3;

import java.util.Scanner;

/*
 * If statement:
 * All salespeople get a payment of $1000 a week.
 * If their sales exceed 10 then they get an extra $250
 */

public class SalaryCalculator {

    public static void main(String[] args) {
        // Initialized known values
        int salary = 1000;
        int bonus = 250;
        int quota = 10; // note: this makes our code more readable and gives us context, removing the hard-coded 10.

        // Get values for unknown
        System.out.println("How many sales did the employee make?");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        // Quick detour for bonus earners
        if (sales > quota) {
            salary = salary + bonus; // note: no need to redeclare
        }

        // Output
        System.out.println("The employee's pay is $" + salary);
    }
}
