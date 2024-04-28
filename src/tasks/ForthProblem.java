package tasks;

import java.util.Scanner;

/**
 * This class provides a method to compute the factorial of a given integer using recursion.
 */
public class ForthProblem {

    /**
     * Main method to compute and print the factorial of a given integer.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factorial(n));
    }

    /**
     * Computes the factorial of a given integer using recursion.
     *
     * This method has a time complexity of O(n), where n is the given integer.
     * The method performs n - 1 recursive calls to compute the factorial, each time reducing the problem size by 1.
     * Therefore, the time taken by the method grows linearly with the value of the input integer.
     *
     * @param n The integer for which the factorial is to be computed.
     * @return The factorial of the given integer.
     */
    public static int factorial(int n){
        if (n <= 2)
            return n;
        return n * factorial(n - 1);
    }
}