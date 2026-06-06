import java.util.Scanner;
public class ArrayElementsSumEqualToK {
    static void SumOccurenceElements(int[] ar, int size, int k) {
        for (int i = 0; i <= ar.length - size; i++) {
            int sum = 0;
            for (int j = i; j < i + size; j++) {
                sum = sum + ar[j];
            }
            if (sum == k) {

                for (int j = i; j < i + size; j++) {
                    System.out.print(ar[j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int size = scan.nextInt();
        int k = scan.nextInt();
        SumOccurenceElements(ar, size, k);
    }
}
