package chapter4; // Chapter 4 Homework

import java.util.Random;

public class RollTheDie {

    public static void main(String[] args) {
        int rolls = 5;
        int winScore = 20;
        boolean win = false;
        int score = 0;

        do {
            for (int i = 0; i < rolls; i++) {
                // generate random number
                Random random = new Random();
                int die = random.nextInt(6) + 1;

                int previous = score;
                score = score + die;
                int scoreLeft = winScore - score;

                if (scoreLeft == 0 && winScore == score) { // you win
                    System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are now on space " + score + ". Congrats, you win!");
                    win = true;
                    break;
                } else if (scoreLeft < 0 && score > winScore) { // check for negatives
                    System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are now on space " + previous + " and cannot continue past 20");
                } else { // this is when it's less than 20
                    System.out.println("Roll #" + (i + 1) + ": You've rolled a " + die + ". You are now on space " + score + " and have " + scoreLeft + " to go.");
                }
            }
        } while (win);

        if (!win) {
            System.out.println("You lost!");
        }
    }
}
