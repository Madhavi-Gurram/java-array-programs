import java.util.Scanner;
class PrintAllSubArrays {
    static void printAllSubArrays(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int size = 1; size <= ar.length - i; size++) {
                for (int j = i; j < i + size; j++) {
                    System.out.print(ar[j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        printAllSubArrays(ar);
    }
}
