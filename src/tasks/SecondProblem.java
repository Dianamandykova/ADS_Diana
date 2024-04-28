package tasks;
import java.util.Scanner;

/**
 * This class calculates the average of elements in an array using recursion.
 */
public class SecondProblem {
    /**
     * Takes input from the user, calculates the average of the elements in the array,
     * and prints the result.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scanner.nextInt();
        }
        double solution = average(N, arr);
        System.out.println(solution);
    }

    /**
     * Calculates the average of elements in the array.
     *
     * This method has a time complexity of O(N), where N is the number of elements in the array.
     * The method iterates through the array once to calculate the sum and then divides it by N to find the average.
     *
     * @param N   The number of elements in the array.
     * @param arr The array of integers.
     * @return The average of elements in the array.
     */
    public static double average(int N, int[] arr) {
        // Convert sum to double for floating-point division
        return (double) sumRecursive(N, arr) / N;
    }

    /**
     * Recursively calculates the sum of elements in the array.
     *
     * This method has a time complexity of O(N), where N is the number of elements in the array.
     * The method recursively sums the elements in the array, reducing the problem size by 1 at each step.
     *
     * @param N   The number of elements to sum.
     * @param arr The array of integers.
     * @return The sum of the first N elements in the array.
     */
    public static int sumRecursive(int N, int[] arr) {
        if (N == 1)
            return arr[0];
        return arr[N - 1] + sumRecursive(N - 1, arr);
    }
}