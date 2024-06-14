package chapter4; // Chapter 4C

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {

        // Get text
        System.out.println("Enter in some text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        boolean letterFound = false;

        // Search text for letter A
        for (int i = 0; i < text.length(); i++) {
            char currentLetter = text.charAt(i);

            if (currentLetter == 'A' || currentLetter == 'a') {
                letterFound = true;
                break;
            }
        }

        if (letterFound) {
            System.out.println("This text contains the letter 'A'");
        } else {
            System.out.println("This text does not contain the letter 'A'");
        }
    }
}
