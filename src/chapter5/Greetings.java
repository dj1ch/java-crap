package chapter5; // Chapter 5A

import java.util.Scanner;

/*
 * OUR FIRST METHOD
 * Write a method that asks the user for their name, then greets them by name
 */

public class Greetings {

    public static void main(String[] args) {

        System.out.println("Enter your name:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        greetUser(name);
    }

    public static void greetUser(String name) {

        System.out.println("Hi there, " + name);
    }
}
