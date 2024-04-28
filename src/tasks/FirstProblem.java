package tasks;
import java.util.Scanner;
public class FirstProblem {
    /**
     * This method reads input from user.
     * first number n is a count of elements
     * then it reads next n numbers.
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int solution = findMinimum(arr, N);
        System.out.println(solution);
    }
    /**
     * this method calculate the minimum element from array.
     * time of this algorithm complexity is O(n).
     * this method recursively finds the min element in array.
     * @param arr is Array of numbers
     * @param n count of numbers
     * @return min element
     */
    public static int findMinimum(int[] arr, int n) {
        if (n == 1)
            return arr[0];
        int minOfRest = findMinimum(arr, n - 1);
        return Math.min(minOfRest, arr[n - 1]);
    }
}