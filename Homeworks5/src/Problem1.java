import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Input size of array:");
        Scanner scanner = new Scanner(System.in);
        int mn = scanner.nextInt();
        int[] arr = new int[mn];

        for (int i = 0; i < mn; i++) {
            arr[i] = i + 2;
            System.out.println(arr[i]);
        }
    }
}
