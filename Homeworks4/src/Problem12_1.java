import java.util.Scanner;

public class Problem12_1 {
    public static void main(String[] args) {
        System.out.println("Input an Integer");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int j;
        String black = "black";
        String white = "white";
        String[][] arr = new String[n][n];

        for (; i < n; i++) {
            j = 0;
            for (; j < n; j++) {
                if (j != 0) {
                    System.out.print(" - ");
                }
                if ((i - j) % 2 == 0) {
                    arr[i][j] = black;
                } else {
                    arr[i][j] = white;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

    }
}

