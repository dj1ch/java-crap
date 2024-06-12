package chapter2; // Chapter 2 Homework

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] arg) {
        // im like 99% im doing this exercise out of order
        System.out.println("What season of the year is it?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Give an adjective to describe the season.");
        String adj = scanner.next();

        System.out.println("In " + season + ", how many cups of coffee do you drink at minimum?");
        int cups = scanner.nextInt();

        // formatting lol
        System.out.println("Complete Mad Lib: On a " + adj + " " + season + " "
        + "day, I drank a minimum of " + cups + " cups of coffee.");
    }
}




