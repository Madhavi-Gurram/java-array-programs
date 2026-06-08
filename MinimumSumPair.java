import java.util.Scanner;
public class MinimumSumPair {
    public static int minimumSumPair(int[] ar, int n) {
        int minimum = Integer.MAX_VALUE;
        int secondMinimum = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] < minimum) {
                secondMinimum = minimum;
                minimum = ar[i];
            } else if (ar[i] < secondMinimum) {
                secondMinimum = ar[i];
            }
        }
        return minimum + secondMinimum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int res = minimumSumPair(ar, n);
        System.out.println(res);
    }
}
