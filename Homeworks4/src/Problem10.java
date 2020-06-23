import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        System.out.println("Input an integer");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 0;
        int x = 0;
        int y = 1;
        int result = 0;

        while (i <= n) {
            if (i == 0) {
                i++;
                continue;
            }
            result = y + x;
            y = x;
            x = result;
            i++;
        }
        System.out.println("fib" + "(" + n + ") = " + result);
    }
}
