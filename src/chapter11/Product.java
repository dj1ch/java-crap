package chapter11; // Chapter 11B

public interface Product {

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default String getBarcode() {
        return "no barcode";
    }
}
