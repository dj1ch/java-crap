package chapter10; // Chapter 10 Homework

public class Market {

    public static void main(String[] args) {
        // using apple class
        Apple apple = new Apple();
        apple.removeSeeds();
        apple.makeJuice();
        System.out.println(" ");

        // using banana class
        Banana banana = new Banana();
        banana.peel();
        banana.makeJuice();
        System.out.println(" ");

        // changing apple to banana
        Fruit apple2 = new Apple();
        ((Apple) apple2).removeSeeds();
        apple2.makeJuice();
        System.out.println(" ");

        // it's now a banana...
        apple2 = new Banana();
        ((Banana) apple2).peel();
        apple2.makeJuice();
    }
}
