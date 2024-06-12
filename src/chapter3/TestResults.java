package chapter3; // Chapter 3D

import java.util.Scanner;

public class TestResults {

    public static void main(String[] arg) {
        // Get the test score
        System.out.println("Enter your test score:");
        Scanner scanner = new Scanner(System.in);
        double score = scanner.nextDouble();

        // Determine the letter grade
        char grade;

        if (score < 60) {
            grade = 'F'; // note: single '' for char, "" for string
        } else if (score < 70) {
            grade = 'D';
        } else if (score < 80) {
            grade = 'C';
        } else if (score < 90) {
            grade = 'B';
        } else {
            grade = 'A';
        }

        System.out.println("Your grade is " + grade);
    }
}