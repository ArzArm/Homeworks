import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {
        System.out.println("Input an integer");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i = 1;
        int sum = 0;

        while (i <= n) {
            if (i % 2 == 0) {
                sum -= i;
                System.out.print(" - " + i);
            } else {
                sum += i;
                if (i != 1) {
                    System.out.print(" + ");
                }
                System.out.print(i);
            }
            i++;
        }
        System.out.println(" = " + sum);
    }
}
