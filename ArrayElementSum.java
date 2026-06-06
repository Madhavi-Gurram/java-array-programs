import java.util.Scanner;
public class ArrayElementSum {
    static int elementSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scan.nextInt();
        }
        int result = elementSum(arr);
        System.out.println("Sum of array elements: " + result)  
    }
}
