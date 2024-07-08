package chapter14;

import java.util.Scanner;

public class CoinTossGame {

    private static final Player player1 = new Player("Player 1");
    private static final Player player2 = new Player("Player 2");
    private static final Coin coin = new Coin();

    public static void main(String[] args) {
        // ask player
        System.out.println(player1.getName() + ", heads or tails? (Type in all lowercase)");
        player1.setGuess(validateChoice());

        System.out.println("Player 1 chose " + player1.getGuess());
        System.out.println("Player 2 chose " + player2.getGuess());

        // choice
        if (coin.flip().equalsIgnoreCase(player1.getGuess())) {
            System.out.println("You win " + player1.getName());
        } else {
            System.out.println("You win " + player2.getName());
        }
    }

    public static String validateChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        String[] sides = coin.getSides();

        while (!choice.equalsIgnoreCase(sides[0]) && !choice.equalsIgnoreCase(sides[1])) {
            System.out.println("Invalid guess. Try again?");
            choice = scanner.nextLine();
        }

        // opposite choice
        if (choice.equalsIgnoreCase(sides[0])) {
            player2.setGuess(sides[1]);
        } else if (choice.equalsIgnoreCase(sides[1])) {
            player2.setGuess(sides[0]);
        }

        return choice;
    }
}
