import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        System.out.println("Input two numbers");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int i = 1;
        int result = x;
        while (i < y) {
            result *= x;
            i++;
        }
        System.out.println(x + " ^ " + y + " = " + result);
    }
}
