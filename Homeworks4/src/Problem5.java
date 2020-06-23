import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        System.out.println("Input two numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int sum = 0;
        System.out.println("Numbers between " + x + " and " + y + ", divisible by 9:");
        while (x <= y) {
            if (x % 9 == 0) {
               System.out.print(x + " ");
               sum += x;
            }
            x++;
        }
        System.out.println("\n" + "Sum of these numbers is: " + sum);
    }
}

