package chapter14;

public class Player {

    private String name;
    private String guess;

    Player(String name) {
        setName(name);
        guess = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }
}
