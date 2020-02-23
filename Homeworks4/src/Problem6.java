import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        System.out.println("Input an integer");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        double sum = 0;
        while (i <= n) {
            sum += 1.0 / i;
            i++;
        }
        System.out.println(sum);
    }
}
