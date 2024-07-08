package chapter14; // Chapter 14 Homework/Final project

import java.util.Random;

public class Coin {

    // side choice
    private String side;

    // choices
    private final String[] sides = {"heads", "tails"};

    public String[] getSides() {
        return sides;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String flip() {
        Random random = new Random();
        int num = random.nextInt((1 - 0) + 1) + 0;

        side = sides[num];

        return side;
    }
}
