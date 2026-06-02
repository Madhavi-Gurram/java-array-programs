import java.util.Scanner;
public class SecondLargestElement {
    static int SecondLargest(int[] ar) {
        int Largest = Integer.MIN_VALUE;
        int SecondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > Largest) {
                SecondLargest = Largest;
                Largest = ar[i];
            } 
            else if (ar[i] > SecondLargest && ar[i] != Largest) {
                SecondLargest = ar[i];
            }
        }
        return SecondLargest;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int res = SecondLargest(ar);
        System.out.println(res);
    }
}
