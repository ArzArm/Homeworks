import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        System.out.println("Input a positive number: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num < 0) {
            System.out.println("Invalid number!!!!");
        } else {
            System.out.println(digitsSum(num));
        }
    }

    public static int digitsSum(int x) {
        int result = 0;
        while (x / 10.0 > 0) {
            result += x % 10;
            x = x / 10;
        }
        return result;
    }
}
