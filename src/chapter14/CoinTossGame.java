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
        System.out.println("Player 2 has the other side");

        // choice
        if (coin.flip().equals(player1.getGuess())) {
            System.out.println("You win " + player1.getName());
        } else {
            System.out.println("You win " + player2.getName());
        }
    }

    public static String validateChoice() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();
        String[] sides = coin.getSides();

        while ((choice != sides[0]) || (choice != sides[1])) {
            System.out.println("Choice isn't valid. Please try again.");
            choice = scanner.nextLine();
        }

        return choice;
    }
}
