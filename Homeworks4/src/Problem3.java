import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        System.out.println("Input an integer");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int result;

        while (i <= 10) {
            result = n * i;
            System.out.println(n + " * " + i + " = " + result);
            i++;
        }
    }
}
