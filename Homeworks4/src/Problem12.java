import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        System.out.println("Input an Integer");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        String black = "black";
        String white = "white";

        while (i <= n) {
            int j = 1;
            while (j <= n) {
                if (j != 1) {
                    System.out.print(" - ");
                }
                //if (i % 2 != 0 && j % 2 != 0 || i % 2 == 0 && j % 2 == 0) {
                  if ((i + j) %2 == 0) {
                    System.out.print(black);
                } else {
                    System.out.print(white);
                }
                j++;
            }
            System.out.print("\n");
            i++;
        }
    }
}

