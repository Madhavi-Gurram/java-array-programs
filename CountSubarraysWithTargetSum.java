import java.util.Scanner;
public class CountSubarraysWithTargetSum {
    public static int countSubarrays(int[] arr, int size, int targetSum) {
        int count = 0;
        for (int i = 0; i <= arr.length - size; i++) {
            int sum = 0;
            for (int j = i; j < i + size; j++) {
                sum += arr[j];
            }
            if (sum == targetSum) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        int size = scan.nextInt();
        int targetSum = scan.nextInt();
        int result = countSubarrays(arr, size, targetSum);
        System.out.println(result);
    }
}
