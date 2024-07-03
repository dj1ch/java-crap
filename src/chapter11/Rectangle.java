package chapter11; // Chapter 11A

public class Rectangle extends Shape {

    public double length;
    public double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(double length, double width) {
        setLength(length);
        setWidth(width);
    }

    // Note: make sure to use abstract methods when using an abstract class
    @Override
    double calculateArea() {
        return length * width;
    }
}
