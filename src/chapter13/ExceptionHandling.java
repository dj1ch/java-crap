package chapter13; // Chapter 13A and 13B

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

    public static void main(String[] args) {
        numbersExceptionHandling();
    }

    // Note: using this will expect this exception and will rely on other methods to fix this.
    // Note: we can also use the `throw new` keywords to throw an exception
    // when a user does something that creates an exception.
    public static void createNewFile() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }

    public static void createNewFileRethrow() {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch(IOException e) {
            System.out.println("Directory doesn't exist.");
            e.printStackTrace();
        }
    }

    public static void numbersExceptionHandling() {
        File file = new File("resources/numbers.txt");
        try(Scanner fileReader = new Scanner(file);) {

            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println(num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            e.printStackTrace();
        }
    }
}
