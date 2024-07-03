package chapter11; // Chapter 11 Homework

public class Farm {

    public static void main(String[] args) {
        // make pig and duck
        Animal pig = new Pig();
        Animal duck = new Duck();

        // make noise
        pig.makeSound();
        pig.eat();
        System.out.println(" ");

        duck.makeSound();
        duck.eat();
    }
}
