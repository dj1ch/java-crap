package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {

    public static void main(String[] arg) {
        // 1. Get the number of hours worked
        System.out.println("Enter the number of hours the employee worked."); // note: statement ends in semicolon
        Scanner scanner = new Scanner(System.in); // instance of scanner class
        int hours = scanner.nextInt(); // note: we must store data in a type

        // 2. Get the hourly pay rate
        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble(); // note: nextDouble has a lot of uses

        // 3. Multiply hours and pay rate
        double grossPay = hours * rate;

        // 4. Display result
        System.out.println("The employee's gross pay is $" + grossPay);
    }
}