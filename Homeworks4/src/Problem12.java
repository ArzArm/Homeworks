import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        System.out.println("Input an integer");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        String black = "black";
        String white = "white";

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (j % 2 == 0) {
                    System.out.print(" - " + white);
                } else {
                    if (j != 1) {
                        System.out.print(" - ");
                    }
                    System.out.print(black);
                }
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}
