package chapter6; // Chapter 6 Homework

import java.util.Scanner;

/*
 * We need the following:
 * ID
 * Base cost
 * Number of allotted minutes
 * Total minutes used
 */

public class PhoneBill {

    // stuff for calculation
    private static double rate = 0.25;
    private static double tax = 0.15;

    // default values
    private int id;
    private double base;
    private double used;
    private double over;

    public PhoneBill() {
        id = 0;
        base = 69.99;
        used = 200;
        over = 100;
    }

    public PhoneBill(int id) {
        setId(id);
        base = 69.99;
        used = 200;
        over = 100;
    }

    public PhoneBill(int id, double base, double used, double over) {
        setId(id);
        setBase(base);
        setUsed(used);
        setOver(over);
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getBase() {
        return base;
    }

    public void setUsed(double used) {
        this.used = used;
    }

    public double getUsed() {
        return used;
    }

    public void setOver(double over) {
        this.over = over;
    }

    public void printBill() {
        double totalOver = over * rate;
        double totalTax = base * tax;
        double total = base + totalTax + totalOver;
        System.out.println("Your total phone bill is $" + total);
    }
}
