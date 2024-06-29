package chapter7; // Chapter 7A and Chapter 7B

/*
 * Note:
 *
 * Sequential Search
 * The first approach is to use a sequential search algorithm.
 * The sequential search algorithm searches every element in the array until it finds the value that it's looking for.
 * Or, until it arrives at the end of the array.
 * This algorithm is okay for small arrays but it's inefficient for arrays with more than several thousand elements.
 *
 * Binary Search
 * Another search algorithm is the binary search. For the binary search the array must first be sorted.
 * So, in the case of our lottery ticket array, the elements would need to be in ascending order from least to greatest.
 * Then you will write code that will begin the search, by checking the element in the middle of the array,
 * to see if it's equal, greater than, or less than the value that you're searching for.
 * If it's greater than, then there's no need to search the entire second half of the array.
 * Because we know, that everything over there will be greater than as well.
 * And the element you're searching for is definitely not over there.
 * Likewise, if the middle number is less than the value you're searching for,
 * then there's no need to search the entire first half of the array.
 * And if the value is equal, you're lucky and you're done.
 * If it's not equal you've still eliminated half of the array where you know the value is not,
 * and then you continue with another iteration.
 * Each iteration continues like this — eliminating half of the array for what needs to be searched,
 * until you find the value, or you search the entire array.
 * This is a much quicker approach than the sequential search.
 * And this algorithm is one that you should definitely know as it's often brought up in tech interviews.
 * You can code all of this by hand. But if you need to use this in real life,
 * simply use this handy util method called Arrays.binarySearch().
 */

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers() {

        int[] ticket = new int[LENGTH];

        Random random = new Random();

        for (int i = 0; i < LENGTH; i++) {
            int randomNumber;
        /*
         * Generate random number then search to make sure it doesn't
         * already exist in the array. If it does, regenerate and search again.
         */
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            } while(search(ticket, randomNumber));

            // Number is unique if we get here. Add it to the array.
            ticket[i] = randomNumber;
        }

        return ticket;
    }

    /**
     * Does a sequential search on the array to find a value
     * @param array Array to search through
     * @param numberToSearchFor Value to search for
     * @return true if found, false if not
     */
    public static boolean search(int[] array, int numberToSearchFor) {

        // This is called an enhanced loop. It iterates through array and each time assigns the current element to 'value'
        for (int value : array) { // Note: better for already defined values
            if (value == numberToSearchFor) {
                return true;
            }
        }

        /*
         * If we've reached this point, then the entire array was searched
         * and the value was not found.
         */
        return false;
    }

    public static boolean binarySearch(int[] array, int numberToSearchFor) {

        // Array must be sorted first
        Arrays.sort(array);

        int index = Arrays.binarySearch(array, numberToSearchFor);

        if (index >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void printTicket(int[] ticket) {

        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }
}
