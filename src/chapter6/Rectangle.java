package chapter6; // Chapter 6A

public class Rectangle {

    // note: these are called fields
    private double length;
    private double width;

    // note: constructors are used in the initialization of objects
    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) {
        setLength(length); // this can be used to initialize values if specified when creating an instance of the class
        setWidth(width); // this can also be done with this.length or this.width and set it equal to the corresponding arg
    }

    /*
     * Getters and setters are used to modify/use private variables/methods
     */

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length; // note: this keyword refers to calling an object in this class.
                              // in this case, we bring this into our scope/function arguments
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculatePerimeter() {
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }
}
