package chapter9;

public class TasteTester {

    public static void main(String[] args) {
        WeddingCake cake = new WeddingCake();
        cake.setFlavor("Vanilla");
        cake.setPrice(99.99);
        cake.setCandles(1000);
        cake.setTiers(1000);

        System.out.println("The " + cake.getFlavor() + "-flavored cake costs $" + cake.getPrice() + ", has " + cake.getCandles() + " candles, and has " + cake.getTiers() + " tiers.");
    }
}
