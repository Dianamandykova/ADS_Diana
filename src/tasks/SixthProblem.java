package tasks;
import java.util.Scanner;

/**
 * This class provides a method to compute the power of a number using recursion.
 */
public class SixthProblem {
    /**
     * Main method to compute and print the power of a given number.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(powerOf(a, n));
    }

    /**
     * Computes the power of a given number using recursion.
     *
     * This method has a time complexity of O(n), where n is the exponent.
     * The method recursively calculates the power by multiplying the base number 'a'
     * with itself 'n' times. Each invocation of the method results in one recursive call,
     * leading to linear growth in the number of recursive calls. Therefore, the time taken
     * by the method grows linearly with the value of n.
     *
     * @param a The base number.
     * @param n The exponent.
     * @return The result of raising 'a' to the power of 'n'.
     */
    public static int powerOf(int a, int n){
        if (n == 0)
            return 1;
        return a * powerOf(a, n - 1);
    }
}
