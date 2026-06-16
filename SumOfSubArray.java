import java.util.Scanner;
public class SumOfSubArray {
    public static void PrintSumArrays(int[] ar, int size) {
        for (int i = 0; i <= ar.length - size; i++) {
            int sum = 0;
            for (int j = i; j < i + size; j++) {
                sum = sum + ar[j];
            }
            System.out.println(sum);
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
        PrintSumArrays(ar, size);
    }
}
