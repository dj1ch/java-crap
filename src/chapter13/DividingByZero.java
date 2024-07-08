package chapter13; // Chapter 13 Homework

public class DividingByZero {

    public static void main(String[] args) {
        try {
            int c = 30/0;
        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.println("Division is fun!");
        }
    }
}
