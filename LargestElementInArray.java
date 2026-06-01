import java.util.Scanner;
public class LargestElementInArray {
    public static int LargestElement(int[] ar) {
        int Largest = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > Largest) {
                Largest = ar[i];
            }
        }
        return Largest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int result = LargestElement(ar);
        System.out.println(result);
    }
}
