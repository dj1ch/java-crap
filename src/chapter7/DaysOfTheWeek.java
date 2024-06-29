package chapter7; // Chapter 7 Homework

import java.util.Scanner;

public class DaysOfTheWeek {

    private static final String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int day = getDay();
        String DOTW = checkDay(day);
        System.out.println("Current day: " + DOTW);
    }

    public static int getDay() {
        int day;
        System.out.println("Choose a day by number: ");
        day = scanner.nextInt();

        return day;
    }

    public static String checkDay(int number) {
        String day;
        if (number < days.length) {
            day = days[number - 1];
        } else {
            day = "Not a valid choice.";
        }

        return day;
    }
}
