package tasks;

import java.util.Scanner;

/**
 * A program to check if a given string consists only of digits.
 */
public class EighthProblem {

    /**
     * Main method to check if a given string consists only of digits.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        boolean ch = check(n, 0);
        if (ch)
            System.out.println("Yes");
        else
            System.out.println("NO");
    }

    /**
     * Recursively checks whether a given string consists only of digits.
     *
     * @param n     The input string to check.
     * @param index The index of the current character being checked.
     * @return true if the string consists only of digits, false otherwise.
     * <p>
     * The time complexity of this method is O(N), where N is the length of the input string.
     * This is because the method iterates through each character of the string exactly once.
     * </p>
     */
    public static Boolean check(String n, int index) {
        if (index == n.length())
            return true;
        if (Character.isDigit(n.charAt(index)))
            return check(n, index + 1);
        return false;
    }
}
