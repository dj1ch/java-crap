package chapter9; // Chapter 9A,9B,9C,9D

public class InheritanceTester {

    public static void main(String[] args) {

        Mother mom = new Mother();
        mom.setName("Glenda");

        System.out.println(mom.getName() + " is a " + mom.getGender());
    }

    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(4);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(4);
        System.out.println(square.calculatePerimeter());
    }
}
