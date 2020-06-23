import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        System.out.println("Input size of array:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int [n];

        for (int i = 0; i < n; i++) {
            System.out.println("Input element " + i + ":");
            arr[i] = scanner.nextInt();
        }
    }
}
