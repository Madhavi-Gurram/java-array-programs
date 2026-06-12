import java.util.Scanner;
public class EvenCommonElements {
    static void printEvenCommonElements(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                if (arr1[i] % 2 == 0) {
                    System.out.print(arr1[i] + " ");
                }
                i++;
                j++;
            }
            else if (arr1[i] > arr2[j]) {
                j++;
            }
            else {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scan.nextInt();
        }
        printEvenCommonElements(arr1, arr2);
    }
}
