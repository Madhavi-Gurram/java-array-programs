import java.util.Scanner;
public class CommonElements {
    static void printCommonElements(int[] arr1, int[] arr2) {
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
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
        for (int i = 0; i < n1; i++) {
            arr1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = scan.nextInt();
        }
        printCommonElements(arr1, arr2);
    }
}
