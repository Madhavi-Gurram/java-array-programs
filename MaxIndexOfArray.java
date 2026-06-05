import java.util.Scanner;
public class MaxIndexOfArray {
    public static int maximumIndex(int[] ar) {
        int max = Integer.MIN_VALUE;
        int index = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int result = maximumIndex(ar);
        System.out.println(result);
    }
}
