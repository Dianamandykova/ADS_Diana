import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N > 0){
            readAndDisplayReversed(N, sc);
        }
        else
            System.out.println(0);
    }

    public static void readAndDisplayReversed(int N, Scanner sc){
        if (N == 0)
            return;
        int num = sc.nextInt();
        readAndDisplayReversed(N - 1, sc);
        System.out.print(num + " ");
    }
}