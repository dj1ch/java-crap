package chapter11; // Chapter 11A

public class ShapeTester {

    public static void main(String[] args) {

        // Note: you cannot instantiate an abstract class
        Shape rectangle = new Rectangle(5, 7);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
    }
}
