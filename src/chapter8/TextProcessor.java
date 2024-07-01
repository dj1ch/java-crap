package chapter8; // Chapter 8B

public class TextProcessor {

    public static void main(String[] args) {
        countWords("I love Test Automation University!");
        reverseString("Hello TAU");
        System.out.println(" "); // print extra line
        addSpaces("HeyWorld!It'sMeAngie");
    }

    /**
     * Splits a string into an array by tokenizing it.
     * Counts words and prints them
     * @param text Full string to be split
     */
    public static void countWords(String text) {
        var words = text.split(" "); // Note: arg splits text whenever it sees that character
        int numberOfWords = words.length;

        String message = String.format("Your text contains %d words:", numberOfWords);
        System.out.println(message);

        for (int i = 0; i < numberOfWords; i++) {
            System.out.println(words[i]);
        }
    }

    /**
     * Prints a string in reverse order
     * @param text String to reverse
     */
    public static void reverseString(String text) {
        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    /**
     * Add spaces before each uppercase letter
     * @param text jumbled text
     */
    public static void addSpaces(String text) {

        var modifiedText = new StringBuilder(text);

        for (int i = 0; i < modifiedText.length(); i++) {
            if (i != 0 && Character.isUpperCase(modifiedText.charAt(i))) {
                modifiedText.insert(i, " ");
                i++; // inserts space, moves onto next char
            }
        }

        System.out.println(modifiedText);
    }
}
