import java.util.Scanner;
public class MergingThreeArrays {
    static int[] MergeArrays(int[] ar1, int[] ar2, int[] ar3) {
        int[] res = new int[ar1.length + ar2.length + ar3.length];
        int i = 0, k = 0;
        while (i < res.length) {
            if (i < ar1.length) {
                res[k] = ar1[i];
                k++;
                i++;
            }
            if (i < ar2.length) {
                res[k] = ar2[i];
                k++;
                i++;
            }
            if (i < ar3.length) {
                res[k] = ar3[i];
                k++;
                i++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int[] ar1 = new int[n1];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = scan.nextInt();
        }
        int n2 = scan.nextInt();
        int[] ar2 = new int[n2];
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = scan.nextInt();
        }
        int n3 = scan.nextInt();
        int[] ar3 = new int[n3];
        for (int i = 0; i < ar3.length; i++) {
            ar3[i] = scan.nextInt();
        }
        int[] res = MergeArrays(ar1, ar2, ar3);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
