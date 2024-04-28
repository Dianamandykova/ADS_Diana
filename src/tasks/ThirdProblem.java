package tasks;
import java.util.Scanner;

public class ThirdProblem {
    /**
     * Main method to check if a given number is prime or not.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if (isItPrime(N))
            System.out.println("Prime");
        else
            System.out.println("Composite");
    }

    /**
     * Checks whether a given number is prime.
     * Time complexities like O(N) or O(N/2)
     * @param N The number to check for primality.
     * @return true if the given number is prime, false otherwise.
     */
    public static boolean isItPrime(int N) {
        if (N <= 1)
            return false;
        if (N <= 3)
            return true;
        for (int i = 2; i * i <= N; i++) {
            if (N % i == 0)
                return false;
        }
        return true;
    }
}