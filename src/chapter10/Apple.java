package chapter10; // Chapter 10 Homework

public class Apple extends Fruit {

    private int calories;

    public Apple() {
        setCalories(150);
        System.out.println("This fruit has " + getCalories() + " calories");
    }

    @Override
    public void makeJuice() {
        System.out.println("Made your apple juice!");
    }

    public void removeSeeds() {
        System.out.println("Seeds have been removed.");
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
}
