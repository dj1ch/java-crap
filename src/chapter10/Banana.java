package chapter10; // Chapter 10 Homework

public class Banana extends Fruit {

    private int calories;

    public Banana() {
        setCalories(125);
        System.out.println("This fruit has " + getCalories() + " calories");
    }

    @Override
    public void makeJuice() {
        System.out.println("Made your banana juice!");
    }

    public void peel() {
        System.out.println("Skin is now peeled.");
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
