package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]) {
        // im like 99% im doing this exercise out of order
        System.out.println("What season of the year is it?");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Give an adjective to describe the season.");
        String adj = scanner.next();

        System.out.println("In " + season + ", how many cups of coffee do you drink at minimum?");
        int cups = scanner.nextInt();

        System.out.print("Complete Mad Lib: On a ");
        System.out.print(adj);
        System.out.print(" ");
        System.out.print(season);
        System.out.print(" ");
        System.out.print("day, I drink a minimum of");
        System.out.print(" ");
        System.out.print(cups);
        System.out.print(" ");
        System.out.println("cups of coffee.");
    }
}




