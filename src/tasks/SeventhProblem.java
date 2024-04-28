package tasks;
import java.util.Scanner;

/**
 * This class provides a method to read N numbers from input and display them in reverse order.
 */
public class SeventhProblem {
    /**
     * Main method to read N numbers from input and display them in reverse order.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N > 0) {
            readAndDisplayReversed(N, sc);
        } else {
            System.out.println(0);
        }
    }

    /**
     * Reads N numbers from input and displays them in reverse order.
     *
     * This method has a time complexity of O(N), where N is the number of integers to be read and displayed.
     * The method recursively reads N integers from the input and stores them in the call stack. Once all N integers
     * are read, the method starts returning and printing the integers in reverse order, resulting in linear growth
     * in the number of recursive calls and time taken.
     *
     * @param N The number of integers to be read and displayed.
     * @param sc The Scanner object used for input.
     */
    public static void readAndDisplayReversed(int N, Scanner sc) {
        if (N == 0)
            return;
        int num = sc.nextInt();
        readAndDisplayReversed(N - 1, sc);
        System.out.print(num + " ");
    }
}