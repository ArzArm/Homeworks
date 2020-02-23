import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {
        System.out.println("Input an integer");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int result = 1;

        while (i <= n) {
            result *= i;
            i++;
        }
        System.out.println(n + "!" + " = " + result);
    }
}
