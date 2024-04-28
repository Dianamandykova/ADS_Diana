package tasks;
import java.util.Scanner;

/**
 * This class provides a method to compute the nth Fibonacci number using recursion.
 */
public class FifthProblem {
    /**
     * Main method to compute and print the nth Fibonacci number.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(fibo(n));
    }

    /**
     * Computes the nth Fibonacci number using recursion.
     *
     * This method has a time complexity of O(2^n), where n is the index of the Fibonacci number.
     * The method recursively calculates the Fibonacci number by summing the previous two Fibonacci numbers.
     * Each invocation of the method results in two recursive calls, leading to exponential growth in the number
     * of recursive calls. Therefore, the time taken by the method grows exponentially with the value of n.
     *
     * @param n The index of the Fibonacci number to compute.
     * @return The nth Fibonacci number.
     */
    public static int fibo(int n){
        if (n <= 1)
            return n;
        else
            return fibo(n - 1) + fibo(n - 2);
    }
}