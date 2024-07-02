package chapter9; // Chapter 9C

public class Square extends Rectangle {

    // Note: let Java know that it's inherited from super class, and that we will override it
    @Override
    public double calculatePerimeter() {
        return sides * length;
    }


    public void print(String what) {
        System.out.println("I am a " + what);
    }
}
